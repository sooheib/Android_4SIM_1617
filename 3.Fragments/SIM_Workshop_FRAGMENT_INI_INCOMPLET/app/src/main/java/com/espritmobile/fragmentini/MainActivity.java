package com.espritmobile.fragmentini;

import android.app.Activity;
import android.os.Bundle;

import com.espritmobile.fragmentini.fragments.ChoiceFragment;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		getFragmentManager().beginTransaction().add(R.id.container,new ChoiceFragment()).commit();

	}
	
}
