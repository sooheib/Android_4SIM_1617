package com.esprit.listview;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import data.manager.Article;
import data.manager.ImageDownloader;

public class ArticleCustomAdapter extends ArrayAdapter<Article> {
	
	  private final static String TAG = "ArticleAdapter";
	  private int resourceId = 0;
	  private LayoutInflater inflater;
	  

	  public ArticleCustomAdapter(Context context, int resourceId, List<Article> mediaItems) {
	    super(context, 0, mediaItems);
	    this.resourceId = resourceId;
	    inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	  }
	  
	  @Override
	  public View getView(int position, View convertView, ViewGroup parent) {

	    View view;
	    TextView textTitle, DescText;
	    final ImageView image;

	    view = inflater.inflate(resourceId, parent, false);

	    try {
	      textTitle = (TextView)view.findViewById(R.id.titreArticle);
	      DescText = (TextView)view.findViewById(R.id.descArticle);
	      image = (ImageView)view.findViewById(R.id.imgArticle);
	    } catch( ClassCastException e ) {
	      Log.e(TAG, "Your layout must provide an image and a text view.", e);
	      throw e;
	    }


	   

	    return view;
	  }

	}