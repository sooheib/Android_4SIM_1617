package com.sim.ws.activity_lifecycle;

import java.io.File;
import java.util.List;

import com.sim.ws.intents.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.MediaStore.Video.Media;
import android.view.View;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.les_intents);
	}

	public void callIntent(View view) {
		//Implémenter les différents type d'action dans les Intents
	}

	
	
	
	//Aller plus loin: Test sur la disponibilité d'une application bien définie
	public boolean isIntentAvailable(Context context, String action) {
		final PackageManager packageManager = context.getPackageManager();
		final Intent intent = new Intent(action);
		List<ResolveInfo> resolveInfo = packageManager.queryIntentActivities(
				intent, PackageManager.MATCH_DEFAULT_ONLY);
		if (resolveInfo.size() > 0) {
			return true;
		}
		return false;
	}
}
