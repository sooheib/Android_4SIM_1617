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


public class VideoFrag extends Fragment {

	private static ViewGroup layout;

	ListView videolist;
	Cursor videocursor;
	int video_column_index;
	int count;
	ArrayList<Media> videolistArray;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		return layout;
	}
	
	
	private void init_phone_video_grid() {
		
		query();
		
		MediaAdapter adapter = new MediaAdapter(getActivity(), R.layout.item_media, videolistArray);

		videolist= (ListView)getActivity().findViewById(R.id.lv_video);
		videolist.setAdapter(adapter);
		videolist.setOnItemClickListener(videogridlistener);
		videolist.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				return false;
			}
		});
	}

	private OnItemClickListener videogridlistener = new OnItemClickListener() {
		@SuppressWarnings("rawtypes")
		public void onItemClick(AdapterView parent, View v, int position,
				long id) {
			System.gc();
			video_column_index = videocursor
					.getColumnIndexOrThrow(MediaStore.Video.Media.DATA);
			videocursor.moveToPosition(position);
			String filename = videocursor.getString(video_column_index);

			Intent intent = new Intent();  
			intent.setAction(android.content.Intent.ACTION_VIEW);  
			File file = new File(filename);  
			intent.setDataAndType(Uri.fromFile(file), "video/*");  
			startActivity(intent);
		}
	};
	
	@SuppressWarnings("deprecation")
	private void query() {
		// TODO Auto-generated method stub
		System.gc();
		String[] proj = { MediaStore.Video.Media._ID,
				MediaStore.Video.Media.DATA,
				MediaStore.Video.Media.DISPLAY_NAME,
				MediaStore.Video.Media.SIZE };
		videocursor = getActivity().managedQuery(MediaStore.Video.Media.EXTERNAL_CONTENT_URI,
				proj, null, null, null);
		count = videocursor.getCount();
		videolistArray = new ArrayList<Media>();
		for (int i = 0; i < count; i++) {
			video_column_index = videocursor
					.getColumnIndexOrThrow(MediaStore.Audio.Media.DISPLAY_NAME);
			videocursor.moveToPosition(i);
			String name = videocursor.getString(video_column_index);
			video_column_index = videocursor
					.getColumnIndexOrThrow(MediaStore.Audio.Media.SIZE);
			videocursor.moveToPosition(i);
			String size = videocursor.getString(video_column_index);

			videolistArray.add(new Media(name, size));
		}
	}
}
