package com.espritmobile.fragmentini.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.espritmobile.fragmentini.R;
import com.espritmobile.fragmentini.utils.Utils;

public class ContentFragment extends Fragment {

	ImageView img;
	TextView text,title;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_content, container, false);

		img = (ImageView) view.findViewById(R.id.img);
		text = (TextView) view.findViewById(R.id.txt);
		title = (TextView) view.findViewById(R.id.title);
		return view;
	}



	@Override
	public void onStart() {
		super.onStart();
		Bundle args = getArguments();
		if (args != null) {
			if (args.containsKey("type")) {
				int index = args.getInt("type");
				getActivity().getActionBar().setIcon(Utils.actionBarIcon[index]);
				getActivity().getActionBar().setTitle(Utils.actionBarTitle[index]);
				img.setImageResource(Utils.contentImage[index]);
				text.setText(Utils.contentDesc[index]);
				title.setText(Utils.contentTitle[index]);
			}
		}
	}

}
