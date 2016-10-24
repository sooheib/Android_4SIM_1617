package com.esprit.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class ListViewSimple extends Activity implements OnItemClickListener {
    /** Called when the activity is first created. */
	ListView maListViewPerso;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mes_articles);
        
        maListViewPerso = (ListView)findViewById(R.id.listArticle);
        
        final ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();
        
     	HashMap<String, String> map;
     	
     	map = new HashMap<String, String>();
     	
     	
     	
  
     	map.put("Url", "http://www.mosaiquefm.net/assets/content/jpg/SAHBI-JOUINI-07052013-3.jpg");
        map.put("Titre", "Sahbi Jouini");
        map.put("Contenu", "Sahbi Jouini appelle plus de vigilance de la part des citoyens");
        listItem.add(map);
        
        
        
        
        map = new HashMap<String, String>();
        map.put("Url", "http://www.mosaiquefm.net/assets/content/jpg/RIAHI-310513-2.jpg");
        map.put("Titre", "Slim Riahi");
        map.put("Contenu", "Slim Riahi : Il faut etudier les repercussions de la situation libyenne sur la Tunisie");
        listItem.add(map);
        
        
        
        
        
        map = new HashMap<String, String>();
        map.put("Url", "http://www.mosaiquefm.net/assets/content/jpg/souk-jomla92.jpg");
        map.put("Titre", "Gouvernement");
        map.put("Contenu", "Le marche du gros ouvert exceptionnellement durant la journee du lundi 14 octobre");
        listItem.add(map);
        
        
        
       
        

        map = new HashMap<String, String>();
        map.put("Url", "http://www.mosaiquefm.net/assets/content/jpg/SAMIRCHEFFI16122012.jpg");
        map.put("Titre", "Samir Cheffi");
        map.put("Contenu", " Samir Cheffi : Aucune modification ne sera apportee a la feuille de route du Quartette");
        listItem.add(map);



    }

	@Override
	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
	
	}


}