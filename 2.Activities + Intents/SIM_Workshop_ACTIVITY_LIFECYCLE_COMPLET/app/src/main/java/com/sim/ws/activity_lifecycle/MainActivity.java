package com.sim.ws.activity_lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends TracerActivity {
	// constant to determine which sub-activity returns
	  private static final int REQUEST_CODE = 10;
	  public static final String CHOICE_OPTION="choix";
	Spinner sp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sp = (Spinner) findViewById(R.id.spinner1);
	}
//
	public void onClick(View view) {
		Intent intent = new Intent(this, SecondActivity.class);
		intent.putExtra(CHOICE_OPTION, sp.getSelectedItem().toString());

		//startActivity(intent);

		startActivityForResult(intent, REQUEST_CODE);
	}

	//		ActivityForResult

	@Override
	  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
	      if (data.hasExtra(SecondActivity.RATING_OPTION)) {
	        String result = data.getExtras().getString(SecondActivity.RATING_OPTION);
	        if (result != null && result.length() > 0) {
	          Toast.makeText(this, "Niveau de satisfaction: "+result, Toast.LENGTH_LONG).show();
	        }
	      }
	    }
	  }

}