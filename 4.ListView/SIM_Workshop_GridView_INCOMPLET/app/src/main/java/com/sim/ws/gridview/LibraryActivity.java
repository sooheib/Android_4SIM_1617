package com.sim.ws.gridview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class LibraryActivity extends Activity {

	// Déclarations
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
		/** TODO 1 - Ajouter un Listener sur les items de la liste qui retourne le label de l'item **/

		// Cr�ation de la ArrayList qui nous permettra de remplire la listView
		ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();

		/** TODO 2 - On d�clare la HashMap qui contiendra les informations pour un item (titre, img) et on l'utilise pour remplir la list  **/
		/** TODO 3 - Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sents dans notre list (listItem) dans la vue affichage item  **/
		/** TODO 4 -On attribut � notre listView l'adapter que l'on vient de le cr�er  **/

		/** GRIDVIEW
		/** TODO 5 - D�clarer la GRIDVIEW et Ajouter un Listener sur les items de la GridView qui retourne le label de l'item  **/
		/** TODO 6 - On attribut � notre Gridview le m�me adapter de la liste view **/
		/** TODO 7 - Appel de la m�thode on ... pour attribuer le Layout appropri� d�s le lancement **/
	}
	
	/** TODO 8 - Impl�menter la m�thode on... 
	 *     pour afficher ListView en mode Portrait et GridView en Mode Landscape**/
	

}
