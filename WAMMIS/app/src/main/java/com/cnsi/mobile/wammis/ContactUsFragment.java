package com.cnsi.mobile.wammis;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




public class ContactUsFragment extends Fragment {

	public ContactUsFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_contact_us, container, false);
         
        return rootView;
    }
}
