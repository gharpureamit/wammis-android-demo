package com.cnsi.android.wammisdemo20;


import android.os.Bundle;
import android.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.text.Html.fromHtml;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResourcesFragment extends Fragment {


    public ResourcesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ((MainActivity) getActivity()).setTitle("Resources");
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_resources, container, false);

        TextView textView =(TextView)rootView.findViewById(R.id.a1);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://www.hca.wa.gov/assets/free-or-low-cost/19-024.pdf'> First-timers' Guide to Washington Apple Health (Medicaid) </a>";
        textView.setText(fromHtml(text));

        TextView textView2 =(TextView)rootView.findViewById(R.id.a2);
        textView2.setClickable(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "<a href='http://www.hca.wa.gov/about-hca'> FAQ - Health Care Authority - Access Washington </a>";
        textView2.setText(fromHtml(text2));


        return rootView;
    }

}
