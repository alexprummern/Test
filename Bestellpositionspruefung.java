package com.company.Webshop;

import com.company.Webshop.Artikel;
import com.company.Webshop.Warenkorb;

public class Bestellpositionspruefung{
	
	public static void main(String[] args) {
			for(int i = 0; i <= 100; i++)
			{	
				if(Warenkorb.Artikelmenge[i] = 0)							 	//Abbruch Prüfung für leeren Warenkorb (muss noch mit Array angepasst werden)
					System.out.println("Es wurde ein Fehler erkannt. Prüfen Sie den Warenkorb");	
			}
	}
	public static void pruefungverschiedeneartikel(String[] args) {
		
		//Es dürfen nur 100 Artikel im Warenkorb sein, Menge ist dabei egal
		
		if(Warenkorb.Artikelposition[i] > 100)										//Artikelnummer kann schlecht geprüft werden, es muss eine laufende Nummer geben
			System.out.println("Es wurden zu viele Artikel bestellt. Passen Sie den Warenkorb an");
	}

}


