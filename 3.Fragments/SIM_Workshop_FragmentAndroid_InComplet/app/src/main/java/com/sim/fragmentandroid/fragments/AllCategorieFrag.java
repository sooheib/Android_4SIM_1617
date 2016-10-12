package com.sim.fragmentandroid.fragments;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sim.fragmentandroid.MainActivity;
import com.sim.fragmentandroid.R;

public class AllCategorieFrag extends android.support.v4.app.ListFragment {

	String[] catagories = new String[] {"Music","Video","Picture","About","Exit"};

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		//Creating an array adapter to store the list of categories
		ArrayAdapter<String> adapter = new ArrayAdapter<String>
		(inflater.getContext(), android.R.layout.simple_list_item_1,catagories);
		//Setting the list adapter for the ListFragment
		return super.onCreateView(inflater, container, savedInstanceState);
	}

	
}