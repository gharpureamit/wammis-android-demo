package com.cnsi.android.wammisdemo20;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewIDFragment extends Fragment {


    public ViewIDFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity) getActivity()).setTitle("View ID Card");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_id, container, false);
    }

}
