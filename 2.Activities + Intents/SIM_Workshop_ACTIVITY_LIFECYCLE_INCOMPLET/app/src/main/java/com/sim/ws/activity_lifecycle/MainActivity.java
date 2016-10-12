package com.sim.ws.activity_lifecycle;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends TracerActivity {
	Spinner sp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sp = (Spinner) findViewById(R.id.spinner1);
	}

	public void onClick(View view) {
		//Lancer A2
	}
	

}