package com.sim.multipanelayout;

import android.content.Intent;
import android.os.Bundle;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;



public class JoueurDetailActivity extends FragmentActivity {

	String id;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_joueur_detail);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		if (savedInstanceState == null) {


			Bundle arBundle=new Bundle();
			arBundle.putString(JoueurDetailFragment.ARG_ITEM_ID,getIntent().getStringExtra(JoueurDetailFragment.ARG_ITEM_ID));

			JoueurDetailFragment jd=new JoueurDetailFragment();
			jd.setArguments(arBundle);
			getSupportFragmentManager().beginTransaction().add(R.id.joueur_detail_container,jd).commit();
		}


		Bundle arBundle=new Bundle();
		arBundle.putString(JoueurDetailFragment.ARG_ITEM_ID,getIntent().getStringExtra(JoueurDetailFragment.ARG_ITEM_ID));

		JoueurDetailFragment jd=new JoueurDetailFragment();
		jd.setArguments(arBundle);
		getSupportFragmentManager().beginTransaction().add(R.id.joueur_detail_container,jd).commit();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			NavUtils.navigateUpTo(this, new Intent(this,
					JoueurListActivity.class));
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
