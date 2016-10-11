package com.cnsi.android.wammisdemo20;


import android.animation.Animator;
import android.app.ListFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends ListFragment implements AdapterView.OnItemClickListener {

    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).setTitle("Dashboard");

        return inflater.inflate(R.layout.fragment_dashboard, container, false);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Planets, android.R.layout.simple_list_item_1);

        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id)
    {
        Toast.makeText(getActivity(), "Item: " + position, Toast.LENGTH_SHORT)
                .show();
    }

}
