package com.sim.fragmentandroid;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.sim.fragmentandroid.fragments.AllCategorieFrag;
import com.sim.fragmentandroid.fragments.MusicFrag;
import com.sim.fragmentandroid.fragments.PictureFrag;
import com.sim.fragmentandroid.fragments.ProgressDialogFrag;
import com.sim.fragmentandroid.fragments.VideoFrag;
import com.sim.fragmentandroid.utils.CustomViewPager;

public class MainActivity extends FragmentActivity {

	private static AllCategorieFrag allCatFrag = null;
	private static MusicFrag musicFrag = null;
	private static VideoFrag videoFrag = null;
	private static PictureFrag pictureFrag = null;

	public static CustomViewPager pager;
	ProgressDialogFrag newFragment;

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		pager = (CustomViewPager)findViewById(R.id.viewpager);

		PagerTabStrip pagerTabStrip = (PagerTabStrip) findViewById(R.id.pagerTabStrip);
		pagerTabStrip.setDrawFullUnderline(true);
		pagerTabStrip.setTabIndicatorColor(Color.parseColor("#00a7e7"));

		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.back_actionbar));
		}

	}

	class TitleAdapter extends FragmentPagerAdapter{
		private String titles[] = new String[]{"Menu","Music", "Video", "Photo"};
		public TitleAdapter(FragmentManager fm) {
			super(fm);
			allCatFrag = new AllCategorieFrag();
			musicFrag = new MusicFrag();
			videoFrag = new VideoFrag();
			pictureFrag = new PictureFrag();
		}

		@Override
		public CharSequence getPageTitle (int position){
			return titles[position];
		}

		@Override
		public Fragment getItem(int position) {
			switch (position) {
			case 0: return allCatFrag;
			case 1: return musicFrag;
			case 2: return videoFrag;
			case 3: return pictureFrag;
			}
			return null;
		}

		@Override
		public int getCount() {
			return titles.length;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case R.id.action_download:
			String url = "http://espritmobile.com/awicha.mp3";
			new DownloadFileAsync().execute(url);
			return true;

		}

		return super.onOptionsItemSelected(item);
	}

	class DownloadFileAsync extends AsyncTask<String, String, String> {

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
		}

		@SuppressLint("SdCardPath")
		@Override
		protected String doInBackground(String... aurl) {
			int count;
			try {
				URL url = new URL(aurl[0]);
				URLConnection conexion = url.openConnection();
				conexion.connect();
				int lenghtOfFile = conexion.getContentLength();
				Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);
				InputStream input = new BufferedInputStream(url.openStream());
				OutputStream output;
				output = new FileOutputStream("/sdcard/awicha.mp3");

				byte data[] = new byte[1024];
				long total = 0;
				while ((count = input.read(data)) != -1) {
					total += count;
					publishProgress(""+(int)((total*100)/lenghtOfFile));
					output.write(data, 0, count);
				}

				output.flush();
				output.close();
				input.close();
			} catch (Exception e) {}
			return null;
		}

		protected void onProgressUpdate(String... progress) {
			Log.d("ANDRO_ASYNC",progress[0]);
		}

		@SuppressLint("SdCardPath")
		@Override
		protected void onPostExecute(String unused) {

			
			File file = new File("/sdcard/awicha.mp3");


		}
	}
}
