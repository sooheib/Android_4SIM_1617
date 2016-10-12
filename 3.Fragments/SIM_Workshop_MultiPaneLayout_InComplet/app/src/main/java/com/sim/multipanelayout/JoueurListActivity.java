package com.sim.multipanelayout;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class JoueurListActivity extends FragmentActivity implements
		JoueurListFragment.Callbacks {

	private boolean mTwoPane;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_joueur_list);

		//getFragmentManager().beginTransaction().add(R.id.joueur_list,new JoueurListFragment()).commit();


		if (findViewById(R.id.joueur_detail_container) != null) {
			mTwoPane = true;
			((JoueurListFragment) getFragmentManager().findFragmentById(
					R.id.joueur_list)).setActivateOnItemClick(true);
		}
	}

	@Override
	public void onItemSelected(String id) {
		if (mTwoPane) {
			

		} else {
			
			
		}
	}
}
