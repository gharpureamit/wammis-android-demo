package com.cnsi.mobile.wammis;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ViewMagIDFragment extends Fragment {
	
	public ViewMagIDFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_view_id, container, false);
        String id = getActivity().getIntent().getExtras().getString("id");

        final TextView Name_val = (TextView) rootView.findViewById(R.id.id_name);
        final TextView Id_val = (TextView) rootView.findViewById(R.id.id_id);

        Name_val.setText(R.string.name);
        Id_val.setText(id);

        return rootView;
    }
}
