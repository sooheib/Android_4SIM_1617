package com.sim.datastorage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sim.datastorage.utils.MyApp;

public class ActivityLogin extends Activity implements OnClickListener {

	EditText editTextLogin,editTextPassword;
	Button btnConnect,btnDontConnect;
	MyApp app;
	SharedPreferences sharedPreferences;


	//TODO Set Preferences fileName
	final String PREF_FILE_NAME = "SharedDATA";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_activity);

		editTextLogin = (EditText) findViewById(R.id.et_login);
		editTextPassword = (EditText) findViewById(R.id.et_password);
		btnConnect = (Button) findViewById(R.id.btn_connect);
		btnDontConnect = (Button) findViewById(R.id.btn_dont_connect);
		
		//TODO Get App Variable

        app = (MyApp)getApplication();

        //TODO Get Preferences


		sharedPreferences = getSharedPreferences(PREF_FILE_NAME, MODE_PRIVATE);
		String login = sharedPreferences.getString("login", "");
		String password = sharedPreferences.getString("password", "");
		//String login = "";
		//String password = "";
		
		editTextLogin.setText(login);
		editTextPassword.setText(password);

		btnConnect.setOnClickListener(this);
		btnDontConnect.setOnClickListener(this);



	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_connect:
			String login = editTextLogin.getText().toString();
			String password = editTextPassword.getText().toString();
			if (!login.equals("") && !password.equals("")) {
				//TODO Set connect state

                app.setConnected(true);

				//TODO Set preferences Value

                sharedPreferences = getSharedPreferences(PREF_FILE_NAME, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putString("login", login);

				editor.putString("password", password);

                editor.commit();
				
				startActivity(new Intent(ActivityLogin.this,ActivityAddArticle.class));
			}

			else {
				Toast.makeText(getApplicationContext(), "please, tap login and password ", Toast.LENGTH_SHORT ).show();
			}
			
			break;

		case R.id.btn_dont_connect:
			//TODO Set connect state
            app.setConnected(false);
            startActivity(new Intent(ActivityLogin.this,ActivityAddArticle.class));
			break;
		}
		
	}

}
