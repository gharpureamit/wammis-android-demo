package com.cnsi.android.wammisdemo20;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlanChangeFragment extends Fragment {


    public PlanChangeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity) getActivity()).setTitle("Change Plan");
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_plan_change, container, false);

        final Button btn = (Button)rootView.findViewById(R.id.new_plan_button);
        final CheckBox chk1 = (CheckBox) rootView.findViewById(R.id.PBox1);
        final CheckBox chk2 = (CheckBox) rootView.findViewById(R.id.PBox2);
        final TableLayout tbl = (TableLayout) rootView.findViewById(R.id.PlanDetailsLayout1);
        final TableLayout tbl1 = (TableLayout) rootView.findViewById(R.id.PlanDetailsLayout2);
        final TableRow tr2=(TableRow)rootView.findViewById(R.id.tableRow2);
        final TableRow tr3=(TableRow)rootView.findViewById(R.id.tableRow3);
        final CheckBox plan1 = (CheckBox) rootView.findViewById(R.id.checkBoxPlan1);
        final CheckBox plan2 = (CheckBox) rootView.findViewById(R.id.checkBoxPlan2);
        final CheckBox plan3 = (CheckBox) rootView.findViewById(R.id.checkBoxPlan3);
        final CheckBox plan11 = (CheckBox) rootView.findViewById(R.id.checkBoxPlan11);
        final CheckBox plan21= (CheckBox) rootView.findViewById(R.id.checkBoxPlan21);
        String Name;
        final TextView TV1 = (TextView) rootView.findViewById(R.id.CName1);
        final TextView TV2 = (TextView) rootView.findViewById(R.id.CName2);

        final TextView PV1 = (TextView) rootView.findViewById(R.id.PName1);
        final TextView PV2 = (TextView) rootView.findViewById(R.id.PName2);
        final TextView PV3 = (TextView) rootView.findViewById(R.id.PName3);
        final TextView PV11 = (TextView) rootView.findViewById(R.id.PName11);
        final TextView PV21 = (TextView) rootView.findViewById(R.id.PName21);

        btn.setVisibility(rootView.GONE);
        tbl.setVisibility(rootView.GONE);
        tbl1.setVisibility(rootView.GONE);

        chk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chk1.isChecked()){
                    chk2.setChecked(false);
                    tbl.setVisibility(view.VISIBLE);
                    tbl1.setVisibility(view.GONE);
                    btn.setVisibility(view.VISIBLE);
                    btn.setEnabled(false);
                    tr3.setEnabled(false);
                }else{
                    tbl.setVisibility(view.GONE);
                    tbl1.setVisibility(view.GONE);
                    btn.setVisibility(view.GONE);
                }
            }
        });
        chk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chk2.isChecked()){
                    chk1.setChecked(false);
                    tbl.setVisibility(view.GONE);
                    tbl1.setVisibility(view.VISIBLE);
                    btn.setVisibility(view.VISIBLE);
                    btn.setEnabled(false);
                }else{
                    tbl.setVisibility(view.GONE);
                    tbl1.setVisibility(view.GONE);
                    btn.setVisibility(view.GONE);
                }
            }
        });

        plan1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(plan1.isChecked()){
                    plan2.setChecked(false);
                    plan3.setChecked(false);
                    btn.setEnabled(true);
                }
                else{
                    btn.setEnabled(false);
                }
            }
        });
        plan2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(plan2.isChecked()){
                    plan1.setChecked(false);
                    plan3.setChecked(false);
                    btn.setEnabled(true);
                }
                else{
                    btn.setEnabled(false);
                }
            }
        });
        plan3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(plan3.isChecked()){
                    plan2.setChecked(false);
                    plan1.setChecked(false);
                    btn.setEnabled(true);
                }
                else{
                    btn.setEnabled(false);
                }
            }
        });


        plan11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(plan11.isChecked()){
                    plan21.setChecked(false);
                    btn.setEnabled(true);
                }
                else{
                    btn.setEnabled(false);
                }
            }
        });
        plan21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(plan21.isChecked()){
                    plan11.setChecked(false);
                    btn.setEnabled(true);
                }
                else{
                    btn.setEnabled(false);
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener()
                               {
                                   public void onClick(View v)
                                   {
                                       String Name = "";
                                       String PlanName = "";

                                       if (chk1.isChecked()) {
                                           Name = TV1.getText().toString();
                                       } else if (chk2.isChecked()) {
                                           Name = TV2.getText().toString();
                                       }

                                       if (plan1.isChecked()) {
                                           PlanName = PV1.getText().toString();
                                       }
                                       else if(plan2.isChecked()) {
                                           PlanName = PV2.getText().toString();
                                       }
                                       else if(plan3.isChecked()) {
                                           PlanName = PV3.getText().toString();
                                       }
                                       else if(plan11.isChecked()) {
                                           PlanName = PV11.getText().toString();
                                       }
                                       else if(plan21.isChecked()) {
                                           PlanName = PV21.getText().toString();
                                       }
                                       chk1.setChecked(false);
                                       chk2.setChecked(false);
                                       plan1.setChecked(false);
                                       plan1.setChecked(false);
                                       plan2.setChecked(false);
                                       plan3.setChecked(false);
                                       plan11.setChecked(false);
                                       plan21.setChecked(false);
                                       btn.setEnabled(false);
                                       btn.setVisibility(v.GONE);
                                       tbl.setVisibility(v.GONE);
                                       tbl1.setVisibility(v.GONE);
                                       Toast.makeText(v.getContext(), "Plan changed for " +
                                               "Mr. " + Name +" to : " + PlanName, Toast.LENGTH_SHORT).show();
                                   }
                               }
        );

        return rootView;
    }

}
