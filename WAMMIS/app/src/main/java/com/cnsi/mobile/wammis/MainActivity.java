package com.cnsi.mobile.wammis;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

    /*----------------------------------------------------------------------------------------------*/
    /*----------------------Date Picker Start------------------------------------------------------*/
    /*----------------------------------------------------------------------------------------------*/
    /*----------------------------------------------------------------------------------------------*/
    //UI References
    private EditText dob_view;

    private DatePickerDialog fromDatePickerDialog;

    private SimpleDateFormat dateFormatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AutoCompleteTextView[] Id_val = new AutoCompleteTextView[1];
        final EditText[] Dob_val = new EditText[1];

        Dob_val[0] = (EditText) findViewById(R.id.dob_view);
        Id_val[0] = (AutoCompleteTextView) findViewById(R.id.mmis_id);


        dateFormatter = new SimpleDateFormat("MM-dd-yyyy", Locale.US);
        findViewsById();
        setDateTimeField();


/*-------------------------------------------------------*/
        Button b1;
        b1=(Button)findViewById(R.id.sign_in_button);

        b1.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {

                                      Dob_val[0].setError(null);
                                      Id_val[0].setError(null);

                                      final String[] DUMMY_CREDENTIALS = new String[]{
                                              "123:09-25-2016"
                                      };

                                      Id_val[0] = (AutoCompleteTextView) findViewById(R.id.mmis_id);
                                      Dob_val[0] = (EditText) findViewById(R.id.dob_view);

                                      String Id_str = Id_val[0].getText().toString();
                                      String Dob_str = Dob_val[0].getText().toString();

                                      for (String credential : DUMMY_CREDENTIALS) {
                                          String[] pieces = credential.split(":");
                                          if (pieces[0].equals(Id_str))
                                          {
                                              // Account exists, return true if the dob matches.
                                              if (pieces[1].equals(Dob_str))
                                              {
                                                  Toast.makeText(getApplicationContext(), "Welcome Mr. John Doe", Toast.LENGTH_SHORT).show();
                                                  Intent i=new Intent(getApplicationContext(),HomeActivity.class);
                                                  i.putExtra("id", Id_str + "");
                                                  i.putExtra("dob", Dob_str);
                                                  //startActivity(new Intent(MainActivity.this, HomeActivity.class));
                                                  startActivity(i);
                                                  finish();
                                              }
                                              else
                                              {
                                                  Dob_val[0].setError(getString(R.string.error_incorrect_dob));
                                                  Id_val[0].setError(getString(R.string.error_incorrect_id));
                                                  Toast.makeText(getApplicationContext(), "Incorrect ID and DOB combination", Toast.LENGTH_SHORT).show();
                                              }
                                          }
                                          else
                                          {
                                              Dob_val[0].setError(getString(R.string.error_incorrect_dob));
                                              Id_val[0].setError(getString(R.string.error_incorrect_id));
                                              Toast.makeText(getApplicationContext(), "Incorrect ID and DOB combination", Toast.LENGTH_SHORT).show();
                                          }
                                      }

                                  }

                              }
        );
    }

    private void findViewsById() {
        dob_view = (EditText) findViewById(R.id.dob_view);
        dob_view.setInputType(InputType.TYPE_NULL);
        dob_view.requestFocus();
    }

    private void setDateTimeField() {
        dob_view.setOnClickListener(this);

        Calendar newCalendar = Calendar.getInstance();
        fromDatePickerDialog = new DatePickerDialog(this, new OnDateSetListener() {

            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                dob_view.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

    }
    @Override
    public void onClick(View view) {
        if(view == dob_view) {
            fromDatePickerDialog.show();
        }
    }

    /*----------------------------------------------------------------------------------------------*/
    /*------------------Date Picker End------------------------------------------------------------------*/
    /*----------------------------------------------------------------------------------------------*/
    /*----------------------------------------------------------------------------------------------*/


}