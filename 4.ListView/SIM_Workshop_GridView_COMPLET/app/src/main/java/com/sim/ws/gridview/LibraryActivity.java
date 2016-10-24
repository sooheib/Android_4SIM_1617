package com.sim.ws.gridview;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class LibraryActivity extends Activity {

	GridView gridView;
	ListView listview;

	static final String[] EBOOKS = new String[] { "The Dead Women",
			"Plaint Jan", "The One You Love", "SERIAL", "TITANIC Conspiracy",
			"Murderous Relations", "For Sale in Palm", "SUDDEN DEATH",
			"SOUL Identity", "Husband For Margaret", "No TIME LEFT",
			"The Bridge", "VIRAL LOOP", "REWORK", "Unix Philosophy",
			"Saving Money", "After Friday Night", "Training Kit",
			"Best American Series", "Network+" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.library);

		// LISTVIEW
		listview = (ListView) findViewById(R.id.listview);
		// TODO 1 - Ajouter un Listener sur les items de la liste qui retourne le label de l'item
		listview.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				Toast.makeText(getApplicationContext(),
						((TextView) v.findViewById(R.id.item_label)).getText(),
						Toast.LENGTH_SHORT).show();

			}
		});

		// Création de la ArrayList qui nous permettra de remplir la listView
		ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();
		// TODO 2 - On d�clare la HashMap qui contiendra les informations pour un item (titre, img)
				 // et on l'utilise pour remplir la list
		HashMap<String, String> map;
		for (int i = 0; i < EBOOKS.length; i++) {
			map = new HashMap<String, String>();
			map.put("titre", EBOOKS[i]);
			map.put("img", String.valueOf(R.drawable.ebook01 + i));
			listItem.add(map);
		}
		// TODO 3 - Cr�ation d'un SimpleAdapter qui se chargera de mettre les items
		// pr�sent dans notre list (listItem) dans la vue affichageitem
		SimpleAdapter mSchedule = new SimpleAdapter(this.getBaseContext(),
				listItem, R.layout.ebook_layout,
				new String[] { "img", "titre" }, new int[] { R.id.item_image,
						R.id.item_label });

		// TODO 4 -On attribut � notre listView l'adapter que l'on vient de le cr�er
		listview.setAdapter(mSchedule);
		
		// TODO 5 - GRIDVIEW
		gridView = (GridView) findViewById(R.id.gridView1);
		// gridView.setAdapter(new ImageAdapter(this, EBOOKS));
		gridView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				Toast.makeText(getApplicationContext(),
						((TextView) v.findViewById(R.id.item_label)).getText(),
						Toast.LENGTH_SHORT).show();

			}
		});

		// TODO 6 - On attribut � notre Gridview le m�me adapter de la liste view
		gridView.setAdapter(mSchedule);
		
		// TODO 7 - Appel de la m�thode pour attribuer le Layout appropri� d�s le
				// lancement
				onConfigurationChanged(this.getResources().getConfiguration());
				
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);

		if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
			listview.setVisibility(View.VISIBLE);
			gridView.setVisibility(View.GONE);
		}

		else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
			listview.setVisibility(View.GONE);
			gridView.setVisibility(View.VISIBLE);
		}
	}
}
