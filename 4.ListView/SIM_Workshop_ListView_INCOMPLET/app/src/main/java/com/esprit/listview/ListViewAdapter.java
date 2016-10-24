package com.esprit.listview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import data.manager.Article;

public class ListViewAdapter extends Activity {
    /** Called when the activity is first created. */
	List<Article> imgList = null;
	String img1 = "http://www.mosaiquefm.net/assets/content/jpg/SAHBI-JOUINI-07052013-3.jpg";
	String img2 = "http://www.mosaiquefm.net/assets/content/jpg/RIAHI-310513-2.jpg";
	String img3 = "http://www.mosaiquefm.net/assets/content/jpg/souk-jomla92.jpg";
	String img4 = "http://www.mosaiquefm.net/assets/content/jpg/SAMIRCHEFFI16122012.jpg";
	String img5 = "http://www.mosaiquefm.net/assets/content/jpg/SAHBI-JOUINI-07052013-3.jpg";
	String img6 = "http://www.mosaiquefm.net/assets/content/jpg/RIAHI-310513-2.jpg";
	String img7 = "http://www.mosaiquefm.net/assets/content/jpg/souk-jomla92.jpg";
	String img8 = "http://www.mosaiquefm.net/assets/content/jpg/SAMIRCHEFFI16122012.jpg";
	String img9 = "http://www.mosaiquefm.net/assets/content/jpg/SAHBI-JOUINI-07052013-3.jpg";
	String img10 = "http://www.mosaiquefm.net/assets/content/jpg/RIAHI-310513-2.jpg";
	String img11 = "http://www.mosaiquefm.net/assets/content/jpg/souk-jomla92.jpg";
	String img12 = "http://www.mosaiquefm.net/assets/content/jpg/SAMIRCHEFFI16122012.jpg";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mes_articles);
        
        ListView maListViewPerso = (ListView)findViewById(R.id.listArticle);
        
        imgList = new ArrayList<Article>();
        
        Article A1 = new Article(img1, "Titr 1", "Desc 1");
        Article A2 = new Article(img2, "Titr 2", "Desc 2");
        Article A3 = new Article(img3, "Titr 3", "Desc 3");
        Article A4 = new Article(img4, "Titr 4", "Desc 4");
        Article A5 = new Article(img5, "Titr 5", "Desc 5");
        Article A6 = new Article(img6, "Titr 6", "Desc 6");
        Article A7 = new Article(img7, "Titr 7", "Desc 7");
        Article A8 = new Article(img8, "Titr 8", "Desc 8");
        Article A9 = new Article(img9, "Titr 9", "Desc 9");
        Article A10 = new Article(img10, "Titr 10", "Desc 10");
        Article A11 = new Article(img11, "Titr 11", "Desc 11");
        Article A12 = new Article(img12, "Titr 12", "Desc 12");
        
        imgList.add(A1);
        imgList.add(A2);
        imgList.add(A3);
        imgList.add(A4);
        imgList.add(A5);
        imgList.add(A6);
        imgList.add(A7);
        imgList.add(A8);
        imgList.add(A9);
        imgList.add(A10);
        imgList.add(A11);
        imgList.add(A12);
        
        maListViewPerso.setAdapter(new ArticleCustomAdapter(getBaseContext(), R.layout.one_article, imgList));
        
    }
}