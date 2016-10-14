package com.sim.multipanelayout.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sim.multipanelayout.R;


public class JoueurContent {

	public static List<JoueurItem> ITEMS = new ArrayList<JoueurItem>();

	public static Map<String, JoueurItem> ITEM_MAP = new HashMap<String, JoueurItem>();

	static {
		addItem(new JoueurItem("1", "1","MANUEL NEUER","GOALKEEPER",R.drawable.small_never,R.drawable.big_never,"27 March 1986 in Gelsenkirchen-Buer","Aries","Manu","1.93 m / 92 kg / 47","Single (partner Kathrin)","Technical high school","Football, family, American cars"));
		addItem(new JoueurItem("2", "22","TOM STARKE","GOALKEEPER",R.drawable.small_starke,R.drawable.big_starke,"18 March 1981 in Freital","Pisces","-","1.94 m / 91 kg / 46","Married (partner Melanie, daughter Lina, son Nick)","Grammar school","Tennis, travelling, skiing"));
		addItem(new JoueurItem("3", "4","DANTE","DEFENCE",R.drawable.small_dante,R.drawable.big_dante,"18 October 1983 in Salvador de Bahia (Brazil)","Libra","-","1.88 m / 87 kg / 45","Married (partner Jocelina, daughter Sophia, son Diogo)","Grammar school","Music"));
		addItem(new JoueurItem("4", "5","DANIEL VAN BUYTEN","DEFENCE",R.drawable.small_van_buyten,R.drawable.big_van_buyten,"7 February 1978 in Chimay (Belgium)","Aquarius","The Rock, Tarzan, Dan","1.97 m / 95 kg / 45","Single (partner Celine, daughter Lou-Ann, son Lee-Roy)","Grammar school","Fishing, tennis, watching films"));
		addItem(new JoueurItem("5", "13","RAFINHA","DEFENCE",R.drawable.small_rafinha,R.drawable.big_rafinha,"7 September 1985 in Londrina","Virgo","Rafa","1.72 m / 68 kg / 47","Single (partner Carolina)","Grammar school","Walking, discovering new places"));
		addItem(new JoueurItem("6", "15","JAN KIRCHHOFF","DEFENCE",R.drawable.small_kirchhoff,R.drawable.big_kirchhoff,"1 October 1990 in Frankfurt am Main","Libra","-","1.94 m / 82 kg","-","-","-"));	
		addItem(new JoueurItem("7", "17","JÉRÔME BOATENG","DEFENCE",R.drawable.small_boteng,R.drawable.big_boateng,"3 September 1988 in Berlin","Virgo","Boa","1.92 m / 90 kg","Single (twin daughters Soley and Lamia)","Secondary school","Meeting friends, music, tennis, travelling"));	
		addItem(new JoueurItem("8", "21","PHILIPP LAHM","DEFENCE",R.drawable.small_lahm,R.drawable.big_lahm,"11 November 1983 in Munich","Scorpio","-","1.70 m / 66 kg / 41","Married (partner Claudia, son Julian)","Secondary school","Snooker, tennis, skiing, golf, darts"));		
		addItem(new JoueurItem("9", "26","DIEGO CONTENTO","DEFENCE",R.drawable.small_contento,R.drawable.big_contento,"1 May 1990 in Munich","Taurus","Cento","1.77 m / 74 kg / 43.5","Single (partner Jessica)","Secondary school","Playstation, going for walks with the dogs"));
		addItem(new JoueurItem("10", "28","HOLGER BADSTUBER","DEFENCE",R.drawable.small_badstuber,R.drawable.big_badstuber,"13 March 1989 in Memmingen","Pisces","-","1.90 m / 83 kg / 43,5","Single","Technical high school","Playstation, tennis, basketball"));	
		addItem(new JoueurItem("11", "6","THIAGO"," MIDFIELD",R.drawable.small_thiago,R.drawable.big_thiago,"11 April 1991 in San Pietro Vernotico (Italy)","Aries","Thiago","1.72m / 71kg","Single (partner Julia Vigas)","-","-"));
		addItem(new JoueurItem("12", "7","FRANCK RIBÉRY","MIDFIELD",R.drawable.small_ribery,R.drawable.big_ribery,"7 April 1983 in Boulogne-sur-Mer (France)","Aries","Flagada","1.70 m / 72 kg / 42","Married (partner Wahiba, daughters Hiziya and Shahinez, son Salif)","Secondary modern","Family, tennis, motorbikes"));		
		addItem(new JoueurItem("13", "8","JAVIER MARTÍNEZ","MIDFIELD",R.drawable.small_martinez,R.drawable.big_martinez,"2 September 1988 in Estella (Spain)","Virgo","Javi","1.90 m / 81 kg / 45","Single (partner Maria)","Grammar school","Basketball, cinema, music, meeting friends"));
		addItem(new JoueurItem("14", "10","ARJEN ROBBEN","MIDFIELD",R.drawable.small_robben,R.drawable.big_robben,"23 January 1984 in Bedum (Netherlands)","Aquarius","Boyke","1.80 m / 80 kg / 43","Married (partner Bernadien, sons Luka and Kai, daughter Lynn)","Technical grammar school","Tennis"));
		addItem(new JoueurItem("15", "11","XHERDAN SHAQIRI","MIDFIELD",R.drawable.small_shaqiri,R.drawable.big_shaqiri,"10 October 1991 in Gjilan (former Yugoslavia, now Kosovo)","Libra","Shaq","1.69 m / 72 kg / 41","Single","Technical high school","Family, friends, table tennis, travelling"));
		addItem(new JoueurItem("16", "19","MARIO GÖTZE","MIDFIELD",R.drawable.small_goetze,R.drawable.big_goetze,"3 June 1992 in Memmingen","Gemini","-","1.76 m / 64 kg","","",""));	
		addItem(new JoueurItem("17", "23","MITCHELL WEISER","MIDFIELD",R.drawable.small_weiser,R.drawable.big_weiser,"21 April 1994 in Troisdorf","Taurus","Mitch","1.76 m / 67 kg / 42.5","Single","Secondary school","Friends, chilling, music, basketball, Playstation"));
		addItem(new JoueurItem("18", "27","DAVID ALABA","MIDFIELD",R.drawable.small_alaba,R.drawable.big_alaba,"24 June 1992 in Vienna (Austria)","Cancer","Alabisi","1.80 m / 75 kg / 42.5","Single","Secondary school","Chilling, family, friends"));
		addItem(new JoueurItem("19", "31","BASTIAN SCHWEINSTEIGER","MIDFIELD",R.drawable.small_schweinsteiger,R.drawable.big_schweinsteiger,"1 August 1984 in Kolbermoor","Leo","Basti","1.83 m / 79 kg / 44.5","Single (partner Sarah)","Secondary school","Golf, reading, skiing, basketball"));	
		addItem(new JoueurItem("20", "34","PIERRE-EMILE HOJBJERG","MIDFIELD",R.drawable.small_hojbjerg,R.drawable.big_hojbjerg,"5 August 1995 in Copenhagen, Denmark","Leo","-","-","-","-","-"));
		addItem(new JoueurItem("21", "39","TONI KROOS","MIDFIELD",R.drawable.small_kroos,R.drawable.big_kroos,"4 January 1990 in Greifswald","Capricorn","-","1.82 m / 78 kg / 43","Single (partner Jessica)","Secondary school","My dogs, tennis, poker"));
		addItem(new JoueurItem("22", "9","MARIO MANDZUKIC","FORWARD",R.drawable.small_mandzukic,R.drawable.big_mandzukic,"21 May 1986 in Slavonski Brod (Croatia)","Taurus","Mandzo","1.87 m / 84 kg / 45","Single (partner Ivana)","Secondary school","Tennis"));
		addItem(new JoueurItem("23", "14","CLAUDIO PIZARRO","FORWARD",R.drawable.small_pizarro,R.drawable.big_pizarro,"3 October 1978 in Callao (Peru)","Libra","Pizza","1.84 m / 84 kg / 44","Married (partner Karla, sons Claudio and Gianluca, daughter Antonella)","Grammar school","Cinema, horse racing, golf"));	
		addItem(new JoueurItem("24", "20","PATRICK WEIHRAUCH","FORWARD",R.drawable.small_weihrauch,R.drawable.big_weihrauch,"3 March 1994 in Gräfelfing","Pisces","Olchi","1.81 m / 73 kg / 43","Single","Secondary school","Music, meeting with friends, Playstation"));
		addItem(new JoueurItem("25", "25","THOMAS MÜLLER","FORWARD",R.drawable.small_mueller,R.drawable.big_mueller,"13 September 1989 in Weilheim","Virgo","-","1.86 m / 74 kg / 44","Married (partner Lisa)","Grammar school","Animals, golf, Schafskopf (a Bavarian card game)"));
	}


	private static void addItem(JoueurItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}
	public static class JoueurItem {
		public String id;
		public String number;
		public String name;
		public String poste;
		public int smallPictureId;
		public int bigPictureId;
		public String dateOfBirth;
		public String starSign;
		public String nickName;
		public String heightWeight;
		public String martialStatus;
		public String eduction;
		public String hobbies;

		public JoueurItem(String id, String number, String name, String poste,
				int smallPictureId, int bigPictureId, String dateOfBirth,
				String starSign, String nickName, String heightWeight,
				String martialStatus, String eduction, String hobbies) {
			super();
			this.id = id;
			this.number = number;
			this.name = name;
			this.poste = poste;
			this.smallPictureId = smallPictureId;
			this.bigPictureId = bigPictureId;
			this.dateOfBirth = dateOfBirth;
			this.starSign = starSign;
			this.nickName = nickName;
			this.heightWeight = heightWeight;
			this.martialStatus = martialStatus;
			this.eduction = eduction;
			this.hobbies = hobbies;
		}

		@Override
		public String toString() {
			return name;
		}


	}
}
