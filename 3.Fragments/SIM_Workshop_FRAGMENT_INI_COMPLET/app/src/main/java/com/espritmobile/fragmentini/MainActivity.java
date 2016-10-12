package com.espritmobile.fragmentini;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;

import com.espritmobile.fragmentini.*;
import com.espritmobile.fragmentini.fragments.ChoiceFragment;

import static com.espritmobile.fragmentini.R.id.container;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getFragmentManager().beginTransaction().add(container,new ChoiceFragment()).commit();
	}
}