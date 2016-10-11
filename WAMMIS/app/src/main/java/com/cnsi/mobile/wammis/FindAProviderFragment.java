package com.cnsi.mobile.wammis;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FindAProviderFragment extends Fragment {

	public FindAProviderFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_find_provider, container, false);

//------------------------------Location ----------------------------
        final RadioGroup location = (RadioGroup) rootView.findViewById(R.id.location_radio);
        final RadioButton city_radio = (RadioButton) rootView.findViewById(R.id.radioCity);
        final RadioButton county_radio = (RadioButton) rootView.findViewById(R.id.radioCounty);
        final Spinner loc_spinner = (Spinner) rootView.findViewById(R.id.location_dropdown);
        List<String> city_list = new ArrayList<String>();
        city_list.add("Aberdeen");                city_list.add("Acme");  city_list.add("Addy");  city_list.add("Adna");  city_list.add("Ahtanum");
        city_list.add("Airway Heights");               city_list.add("Albion");                city_list.add("Algona");  city_list.add("Allyn");  city_list.add("Almira");  city_list.add("Amanda Park");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(rootView.getContext(),android.R.layout.simple_spinner_item, city_list);
        loc_spinner.setAdapter(dataAdapter);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        loc_spinner.setAdapter(dataAdapter);
        loc_spinner.setPrompt("Select a city");

        city_radio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                loc_spinner.setPrompt("Select a city");
                List<String> city_list = new ArrayList<String>();
                city_list.add("Aberdeen");                city_list.add("Acme");  city_list.add("Addy");  city_list.add("Adna");  city_list.add("Ahtanum");
                city_list.add("Airway Heights");               city_list.add("Albion");                city_list.add("Algona");  city_list.add("Allyn");  city_list.add("Almira");  city_list.add("Amanda Park");

                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(v.getContext(),android.R.layout.simple_spinner_item, city_list);
                loc_spinner.setAdapter(dataAdapter);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                //Toast.makeText(v.getContext(), location_btn.getText(), Toast.LENGTH_SHORT).show();
            }
        });


    county_radio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              ;
                loc_spinner.setPrompt("Select a county");
                List<String> county_list = new ArrayList<String>();
                county_list.add("Asotin");                county_list.add("Benton");  county_list.add("Chelan");  county_list.add("Clark");  county_list.add("Columbia");
                county_list.add("Cowlitz");               county_list.add("Duglas");

                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(v.getContext(),android.R.layout.simple_spinner_item, county_list);
                loc_spinner.setAdapter(dataAdapter);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                //Toast.makeText(v.getContext(), location_btn.getText(), Toast.LENGTH_SHORT).show();
            }});
//------------------------------Location ---------------------------
// ------------------------------Speciality ----------------------------
        final Spinner spec_spinner = (Spinner) rootView.findViewById(R.id.spec_dropdown);
        List<String> spec_list = new ArrayList<String>();
        spec_list.add("Acupuncturist");
        spec_list.add("Adult Companion");
        spec_list.add("Advanced Practice Dental Therapist");
        spec_list.add("Allergy & Immunology");
        spec_list.add("Ambulance");
        spec_list.add("Anesthesiology");
        spec_list.add("Assisted Living Facility");
        spec_list.add("Audiologist");
        spec_list.add("Behavioral Analyst");
        spec_list.add("Blood Bank");
        spec_list.add("Case Management");
        spec_list.add("Case Manager/Care Coordinator");
        spec_list.add("Chiropractor");
        spec_list.add("Chronic Disease Hospital");
        spec_list.add("Clinic/Center");
        spec_list.add("Clinical Medical Laboratory");
        spec_list.add("Colon & Rectal Surgery");
        spec_list.add("Community guide");
        spec_list.add("Family Practice");
        spec_list.add("Internal Medicine");
        spec_list.add("Obstetrics & Gynecology");
         spec_list.add("Occupational Therapist");
         spec_list.add("Occupational Therapy Assistant");
         spec_list.add("Ophthalmology");
         spec_list.add("Optometrist");
         spec_list.add("Oral & Maxillofacial Surgery");
        spec_list.add("Orthopaedic Surgery");
        spec_list.add("Orthotics/Prosthetics Fitter");
        spec_list.add("Orthotist");
        spec_list.add("Otolaryngology");
        spec_list.add("Pathology");
        spec_list.add("Pediatrics");
        spec_list.add("Peer Specialist");
        spec_list.add("Pharmacist");
        spec_list.add("Pharmacy");
        spec_list.add("Physical Medicine & Rehabilitation");
        spec_list.add("Physical Therapist");
        spec_list.add("Physical Therapy Assistant");
        spec_list.add("Physician Assistant");
        spec_list.add("Physiological Laboratory");
        spec_list.add("Plastic Surgery");
        spec_list.add("Podiatrist");
        spec_list.add("Point of Service");
        spec_list.add("Portable X-Ray Supplier");
        spec_list.add("Preferred Provider Organization");
        spec_list.add("Preventive Medicine");
        spec_list.add("Private Vehicle");
        spec_list.add("Prosthetic/Orthotic Supplier");
        spec_list.add("Prosthetist");
        spec_list.add("Psychiatric Hospital");
        spec_list.add("Psychiatric Unit");
        spec_list.add("Psychiatry & Neurology");
        spec_list.add("Psychologist");
        spec_list.add("Public Health or Welfare");
        spec_list.add("Purchase Card and Store Accounts");
        spec_list.add("Radiologic Technologist");
        spec_list.add("Radiology");
        spec_list.add("Recreational Opportunities");
        spec_list.add("Registered Nurse");
        spec_list.add("Rehabilitation Counselor");
        spec_list.add("Rehabilitation Hospital");
        spec_list.add("Rehabilitation Unit");
        spec_list.add("Rehabilitation, Substance Use Disorder Unit");
        spec_list.add("Residential Treatment Faclity Mental Retardation and/or Developmental Disabilities");
        spec_list.add("Respiratory Therapist, Certified");
        spec_list.add("Respiratory Therapist, Registered");
        spec_list.add("Respite Care");
        spec_list.add("Secured Medical Transport (VAN)");
        spec_list.add("Single Specialty");
        spec_list.add("Skilled Nursing Facility");
        spec_list.add("Social Worker");
        spec_list.add("Specialist");
        spec_list.add("Specialist/Technologist");
        spec_list.add("Speech-Language Pathologist");
        spec_list.add("Student in an Organized Health Care Education/Training Program");
        spec_list.add("Substance Abuse Rehabilitation Facility");
        spec_list.add("Surgery");
        spec_list.add("Taxi");
        spec_list.add("Technician");
        spec_list.add("Technician, Other");
        spec_list.add("Technician/Technologist");
        spec_list.add("Thoracic Surgery (Cardiothoracic Vascular Surgery)");
        spec_list.add("Transition Services");
        spec_list.add("Transportation Broker");
        spec_list.add("Urology");

        ArrayAdapter<String> specDataAdapter = new ArrayAdapter<String>(rootView.getContext(),android.R.layout.simple_spinner_item, spec_list);
        spec_spinner.setAdapter(specDataAdapter);
        specDataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spec_spinner.setAdapter(specDataAdapter);
// ------------------------------Speciality ----------------------------
// ------------------------------Sub-Speciality ----------------------------

        final Spinner sub_spec_spinner = (Spinner) rootView.findViewById(R.id.subSpec_dropdown);
        final List<String> sub_spec_list = new ArrayList<String>();


        spec_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                String Specialty_selected = spec_spinner.getSelectedItem().toString();
                sub_spec_spinner.setEnabled(true);
                switch (Specialty_selected) {
                    case "Ambulance":
                        sub_spec_list.clear();
                        sub_spec_list.add("Air Transport");
                        sub_spec_list.add("Land Transport");
                        break;
                    case "Chiropractor":
                        sub_spec_list.clear();
                        sub_spec_list.add("Internist");
                        sub_spec_list.add("Neurology");
                        sub_spec_list.add("Nutrition");
                        sub_spec_list.add("Occupational Medicine");
                        sub_spec_list.add("Orthopedic");
                        sub_spec_list.add("Radiology");
                        sub_spec_list.add("Rehabilitation");
                        sub_spec_list.add("Sports Physician");
                        sub_spec_list.add("Thermography");
                        break;
                    case "Chronic Disease Hospital":
                        sub_spec_list.clear();
                        sub_spec_list.add("Children");
                        break;
                    case "Family Practice":
                        sub_spec_list.clear();
                        sub_spec_list.add("Addiction Medicine");
                        sub_spec_list.add("Adoloscent Medicine");
                        sub_spec_list.add("Adult Medicine");
                        sub_spec_list.add("Geriatric Medicine");
                        sub_spec_list.add("Sports Medicine");
                        break;
                    case "Internal Medicine":
                        sub_spec_list.clear();
                        sub_spec_list.add("Addiction Medicine");
                        sub_spec_list.add("Adolescent Medicine");
                        sub_spec_list.add("Allergy & Immunology");
                        sub_spec_list.add("Cardiovascular Disease");
                        sub_spec_list.add("Clinical & Laboratory Immunology");
                        sub_spec_list.add("Clinical Cardiac Electrophysiology");
                        sub_spec_list.add("Critical Care Medicine");
                        sub_spec_list.add("Endocrinology, Diabetes & Metabolism");
                        sub_spec_list.add("Gastroenterology");
                        sub_spec_list.add("Geriatric Medicine");
                        sub_spec_list.add("Hematology");
                        sub_spec_list.add("Hematology & Oncology");
                        sub_spec_list.add("Hepatology");
                        sub_spec_list.add("Infectious Disease");
                        sub_spec_list.add("Interventional Cardiology");
                        sub_spec_list.add("Magnetic Resonance Imaging (MRI)");
                        sub_spec_list.add("Medical Oncology");
                        sub_spec_list.add("Nephrology");
                        sub_spec_list.add("Pulmonary Disease");
                        sub_spec_list.add("Rheumatology");
                        sub_spec_list.add("Sleep Medicine");
                        sub_spec_list.add("Sports Medicine");
                        break;
                    default:
                        sub_spec_list.clear();
                        sub_spec_spinner.setEnabled(false);
                        break;
                }

                ArrayAdapter<String> subSpecDataAdapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_spinner_item, sub_spec_list);
                sub_spec_spinner.setAdapter(subSpecDataAdapter);
                subSpecDataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                sub_spec_spinner.setAdapter(subSpecDataAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
// ------------------------------Sub-Speciality ----------------------------
// ------------------------------Search Button ----------------------------
        Button btn = (Button)rootView.findViewById(R.id.find_provider_button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "There are no providers available that meet your search criteria", Toast.LENGTH_LONG).show();
            }});
// ------------------------------Search Button ----------------------------
        return rootView;
    }
}