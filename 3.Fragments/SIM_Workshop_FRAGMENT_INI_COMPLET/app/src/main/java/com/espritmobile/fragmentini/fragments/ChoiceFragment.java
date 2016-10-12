package com.espritmobile.fragmentini.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.espritmobile.fragmentini.R;

public class ChoiceFragment extends Fragment implements OnClickListener{

	ImageButton btnLife,btnPlanet,btnLearn;

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_choice,container,false);

		btnLearn = (ImageButton) view.findViewById(R.id.btn_learn);
		btnLife = (ImageButton) view.findViewById(R.id.btn_life);
		btnPlanet = (ImageButton) view.findViewById(R.id.btn_planet);


		btnLearn.setOnClickListener(this);
		btnLife.setOnClickListener(this);
		btnPlanet.setOnClickListener(this);

		return view;
	}


	@Override
	public void onClick(View v) {


		ContentFragment frg = new ContentFragment();
		Bundle args = new Bundle();
		switch (v.getId()) {
			case R.id.btn_life:
				args.putInt("type", 0);
				break;
			case R.id.btn_learn:
				args.putInt("type",1);
				break;
			case R.id.btn_planet:
				args.putInt("type", 2);
				break;
		}
		frg.setArguments(args);
		getFragmentManager().beginTransaction()
				.replace(R.id.container,frg).addToBackStack(null).commit();
	}}
