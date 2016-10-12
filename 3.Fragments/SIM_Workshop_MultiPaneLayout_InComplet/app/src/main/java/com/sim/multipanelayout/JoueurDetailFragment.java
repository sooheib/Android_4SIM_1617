package com.sim.multipanelayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sim.multipanelayout.data.JoueurContent;

public class JoueurDetailFragment extends Fragment {
	
	public static final String ARG_ITEM_ID = "item_id";
	private JoueurContent.JoueurItem mItem;

	public JoueurDetailFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActivity().getActionBar().setBackgroundDrawable(
				new ColorDrawable(Color.parseColor("#0e67b2")));
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_joueur_detail,container, false);
		
		if (mItem != null) {
			getActivity().getActionBar().setTitle(mItem.name);
			((TextView) rootView.findViewById(R.id.number_joueur)).setText(mItem.number);
			((TextView) rootView.findViewById(R.id.joueur_name)).setText(mItem.name+" - "+mItem.poste);
			((ImageView) rootView.findViewById(R.id.big_img)).setImageResource(mItem.bigPictureId);
			((TextView) rootView.findViewById(R.id.date_of_birth)).setText(mItem.dateOfBirth);
			((TextView) rootView.findViewById(R.id.star_sign)).setText(mItem.starSign);
			((TextView) rootView.findViewById(R.id.nickname)).setText(mItem.nickName);
			((TextView) rootView.findViewById(R.id.height_weight)).setText(mItem.heightWeight);
			((TextView) rootView.findViewById(R.id.marital_status)).setText(mItem.martialStatus);
			((TextView) rootView.findViewById(R.id.education)).setText(mItem.eduction);
			((TextView) rootView.findViewById(R.id.hobbies)).setText(mItem.hobbies);
			
		}

		return rootView;
	}
}
