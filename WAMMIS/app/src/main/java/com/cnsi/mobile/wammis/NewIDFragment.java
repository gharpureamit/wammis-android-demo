package com.cnsi.mobile.wammis;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.NotificationCompatSideChannelService;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class NewIDFragment extends Fragment {

    public NewIDFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_new_id, container, false);
        Button btn = (Button)rootView.findViewById(R.id.new_id_button);
        final CheckBox chk1 = (CheckBox) rootView.findViewById(R.id.checkBox1);
        final CheckBox chk2 = (CheckBox) rootView.findViewById(R.id.checkBox2);
        final TextView TV1 = (TextView) rootView.findViewById(R.id.CName1);
        final TextView TV2 = (TextView) rootView.findViewById(R.id.CName2);
        final TextView TV3 = (TextView) rootView.findViewById(R.id.status1);
        final TextView TV4 = (TextView) rootView.findViewById(R.id.status2);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String Name1 ;
                String Name2 ;
                //******  HERE's the PROBLEM  ********
                if(chk1.isChecked() || chk2.isChecked()) {
                    if (chk1.isChecked()) {

                        Name1 = TV1.getText().toString();
                        TV3.setText("In Process");
                        chk1.setEnabled(false);
                    }
                    else
                    {
                        Name1 = "";
                    }
                    if (chk2.isChecked()) {
                        Name2 = TV2.getText().toString();
                        TV4.setText("In Process");
                        chk2.setEnabled(false);
                    }
                    else
                    {
                        Name2 = "";
                    }
                    if(chk1.isChecked() & chk2.isChecked()) {
                        Toast.makeText(v.getContext(), "New IDs ordered for: " + Name1 + " and " + Name2, Toast.LENGTH_SHORT).show();
                    }
                    else if (chk1.isChecked())
                    {
                        Toast.makeText(v.getContext(), "New ID ordered for: " + Name1, Toast.LENGTH_SHORT).show();
                    }
                    else if (chk2.isChecked())
                    {
                        Toast.makeText(v.getContext(), "New ID ordered for: " + Name2, Toast.LENGTH_SHORT).show();
                    }
                    chk1.setChecked(false);
                    chk2.setChecked(false);
                }
                else
                {
                    Toast.makeText(v.getContext(), "No checkbox selected!!", Toast.LENGTH_LONG).show();
                }
            }});
        return rootView;
    }

}
