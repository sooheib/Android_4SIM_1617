package com.sim.ws.activity_lifecycle;

import android.os.Bundle;

public class SecondActivity extends TracerActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		// Recevoir les données
		
		// Récupérer le choix
		
		// Afficher le choix
	}

	@Override
	public void finish() {
		// Activity finished ok, return the data
		
		super.finish();
	}

}