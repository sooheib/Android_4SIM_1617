package com.espritmobile.fragmentini.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.espritmobile.fragmentini.R;

public class ChoiceFragment extends Fragment implements OnClickListener{

	ImageButton btnLife,btnPlanet,btnLearn;

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = null;

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
		
	}


}
