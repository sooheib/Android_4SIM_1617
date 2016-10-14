package com.sim.fragmentandroid.fragments;

import java.io.File;
import java.util.ArrayList;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;

import com.sim.fragmentandroid.R;
import com.sim.fragmentandroid.utils.Media;
import com.sim.fragmentandroid.utils.MediaAdapter;


public class MusicFrag extends Fragment {

	private static ViewGroup layout;

	ListView musiclist;
	Cursor musiccursor;
	int music_column_index;
	int count;
	ArrayList<Media> musiclistArray;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, 
			Bundle savedInstanceState) {
		///////
		super.onCreateView(inflater, container, savedInstanceState);

		layout= (ViewGroup) inflater.inflate(R.layout.music_frag,container,false);
		return layout;
	}
	
	private void init_phone_music_grid() {
		query();

		MediaAdapter adapter = new MediaAdapter(getActivity(), R.layout.item_media, musiclistArray);

		musiclist= (ListView)getActivity().findViewById(R.id.lv_music);
		musiclist.setAdapter(adapter);
		musiclist.setOnItemClickListener(musicgridlistener);
		musiclist.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				
				return false;
			}
		});
	}

	private OnItemClickListener musicgridlistener = new OnItemClickListener() {
		@SuppressWarnings("rawtypes")
		public void onItemClick(AdapterView parent, View v, int position,
				long id) {
			System.gc();
			music_column_index = musiccursor
					.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA);
			musiccursor.moveToPosition(position);
			String filename = musiccursor.getString(music_column_index);
			Intent intent = new Intent();  
			intent.setAction(android.content.Intent.ACTION_VIEW);  
			File file = new File(filename);  
			intent.setDataAndType(Uri.fromFile(file), "audio/*");  
			startActivity(intent);

			////////////////
			QuickRateFragment dialog=new QuickRateFragment();
			dialog.show(getActivity().getSupportFragmentManager(),"QuickContactFragment");
			/////////////
		}
	};
	@SuppressWarnings("deprecation")
	private void query() {
		// TODO Auto-generated method stub
		System.gc();
		String[] proj = { MediaStore.Audio.Media._ID,
				MediaStore.Audio.Media.DATA,
				MediaStore.Audio.Media.DISPLAY_NAME,
				MediaStore.Video.Media.SIZE };
		musiccursor = getActivity().managedQuery(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
				proj, null, null, null);
		count = musiccursor.getCount();
		musiclistArray = new ArrayList<Media>();
		for (int i = 0; i < count; i++) {
			music_column_index = musiccursor
					.getColumnIndexOrThrow(MediaStore.Audio.Media.DISPLAY_NAME);
			musiccursor.moveToPosition(i);
			String name = musiccursor.getString(music_column_index);
			music_column_index = musiccursor
					.getColumnIndexOrThrow(MediaStore.Audio.Media.SIZE);
			musiccursor.moveToPosition(i);
			String size = musiccursor.getString(music_column_index);

			musiclistArray.add(new Media(name, size));
		}
	}

	@Override
	public void onStart() {
		init_phone_music_grid();
		super.onStart();
	}
}
