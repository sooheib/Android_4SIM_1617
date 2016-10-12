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


public class PictureFrag extends Fragment {

	private static ViewGroup layout;

	ListView picturelist;
	Cursor picturecursor;
	int picture_column_index;
	int count;
	ArrayList<Media> picturelistArray;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		return layout;
	}
	

	private void init_phone_picture_grid() {
		query();

		MediaAdapter adapter = new MediaAdapter(getActivity(), R.layout.item_media, picturelistArray);

		picturelist= (ListView)getActivity().findViewById(R.id.lv_picture);
		picturelist.setAdapter(adapter);
		picturelist.setOnItemClickListener(picturegridlistener);
		picturelist.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {

				return false;
			}
		});
	}

	private OnItemClickListener picturegridlistener = new OnItemClickListener() {
		@SuppressWarnings("rawtypes")
		public void onItemClick(AdapterView parent, View v, int position,
				long id) {
			System.gc();
			picture_column_index = picturecursor
					.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
			picturecursor.moveToPosition(position);
			String filename = picturecursor.getString(picture_column_index);

			Intent intent = new Intent();  
			intent.setAction(android.content.Intent.ACTION_VIEW);  
			File file = new File(filename);  
			intent.setDataAndType(Uri.fromFile(file), "image/*");  
			startActivity(intent);
		}
	};
	@SuppressWarnings("deprecation")
	private void query() {
		// TODO Auto-generated method stub
		System.gc();
		String[] proj = { MediaStore.Images.Media._ID,
				MediaStore.Images.Media.DATA,
				MediaStore.Images.Media.DISPLAY_NAME,
				MediaStore.Images.Media.SIZE };
		picturecursor = getActivity().managedQuery(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
				proj, null, null, null);
		count = picturecursor.getCount();
		picturelistArray = new ArrayList<Media>();
		for (int i = 0; i < count; i++) {
			picture_column_index = picturecursor
					.getColumnIndexOrThrow(MediaStore.Audio.Media.DISPLAY_NAME);
			picturecursor.moveToPosition(i);
			String name = picturecursor.getString(picture_column_index);
			picture_column_index = picturecursor
					.getColumnIndexOrThrow(MediaStore.Audio.Media.SIZE);
			picturecursor.moveToPosition(i);
			String size = picturecursor.getString(picture_column_index);

			picturelistArray.add(new Media(name, size));
		}
	}

}
