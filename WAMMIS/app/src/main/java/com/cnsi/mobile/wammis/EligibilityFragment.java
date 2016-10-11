package com.cnsi.mobile.wammis;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class EligibilityFragment extends Fragment {
	
	public EligibilityFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_eligibility, container, false);
         
        return rootView;
    }
}
