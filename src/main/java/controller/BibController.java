package controller;

/**
 * 
 * @author ellyn
 *
 * Klasse zur Kontrolle der Aufnahme, des L�schens und Bearbeitens
 * von Buechern in der Bibliothek
 * 
 */
public class BibController {

	public void aufnehmenInBib() {
		/*
		 * neues Buch erstellen
		 * 		Parameter aus den textfeldern der View
		 * 
		 * Buch an DB uebergeben
		 */
	}
	
	public void loeschenAusBib(int buchID) {
		/* 
		 * Buch mit ID suchen und aus DB entfernen
		 * 
		 * AlarmFenster --> wirklich l�schen?
		 * 		best�tigen lassen
		 * 
		 */
	}
	
	public void titelBearbeiten(int buchID) {
		/*
		 * Parameter der Txtfelder aus View vergleichen
		 * mit Parametern in DB
		 * --> �nderungen �bernehmen
		 */
	}
	
	public boolean pruefenObInBestand(int buchID) {
		boolean isInBib = true;
		/*
		 * buch in DB suchen und istInBib �berpr�fen
		 * wenn da --> true
		 * wenn nicht da --> false
		 */
		
		return isInBib;
	}
	
	public int findeBuchID(String[] txtFelder) {
		int buchID = 0;
		/*
		 * Array auswerten und einzelnen Variablen zuordnen
		 * diese als Suchparameter in DB verwenden
		 * buchID zur�ckgeben
		 */
		
		return buchID;
	}
	
	
	
}
