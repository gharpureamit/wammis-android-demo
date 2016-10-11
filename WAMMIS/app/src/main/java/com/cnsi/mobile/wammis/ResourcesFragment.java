package com.cnsi.mobile.wammis;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.text.Html.fromHtml;

public class ResourcesFragment extends Fragment {

	public ResourcesFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_resources, container, false);

        TextView textView =(TextView)rootView.findViewById(R.id.a1);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.google.com/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=first+time+users+HCA+washington'> First-timers' Guide to Washington Apple Health (Medicaid) </a>";
        textView.setText(fromHtml(text));

        TextView textView2 =(TextView)rootView.findViewById(R.id.a2);
        textView2.setClickable(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "<a href='https://www.google.com/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=faqS+hca+WA'> FAQ - Health Care Authority - Access Washington </a>";
        textView2.setText(fromHtml(text2));

        return rootView;
    }
}
