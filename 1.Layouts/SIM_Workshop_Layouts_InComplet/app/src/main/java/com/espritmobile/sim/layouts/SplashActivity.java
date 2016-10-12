package com.espritmobile.sim.layouts;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends Activity {
	ImageView imageLoad,head,body,leftHand,rightHand,leftLeg,RightLeg,logo;
	
	@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_frame);
		getActionBar().setBackgroundDrawable(
				new ColorDrawable(Color.parseColor("#ffffff")));
		
		imageLoad = (ImageView) findViewById(R.id.logo_android);
		
		logo = (ImageView) findViewById(R.id.sim);
		head = (ImageView) findViewById(R.id.head);
		body = (ImageView) findViewById(R.id.body);
		leftHand = (ImageView) findViewById(R.id.left_hand);
		rightHand = (ImageView) findViewById(R.id.right_hand);
		leftLeg = (ImageView) findViewById(R.id.left_leg);
		RightLeg = (ImageView) findViewById(R.id.right_leg);
		startAnim();
		

		
	}
	
	private void startAnim() {
	}
	
	private void animate(ImageView img , int animResId) {
		Animation a = AnimationUtils.loadAnimation(this, animResId);
		a.reset();
		img.clearAnimation();
		img.startAnimation(a);
	}
	
	public void passe(View v) {
		startAnim();
	}
	


	
}
