package com.company.Webshop;

import com.company.Webshop.Artikel;
import com.company.Webshop.Bestellung;
import com.company.Webshop.Kunde;

public class Test {

    public static void main(String[] args) {
        //10 Artikel anlegen
        Artikel artikel1 = new Artikel("Der Heimweg", 978342628, 22.99);
        Artikel artikel2 = new Artikel("Anette, ein Heldinnenepos",978395757,22.00);
        Artikel artikel3 = new Artikel("Funkenmord",978355008,22.00);
        Artikel artikel4 = new Artikel("Kingsbridge. Der Morgen einer neuen Zeit.",978378572,36.00);
        Artikel artikel5 = new Artikel("Männer in Kamelhaarmänteln",978344626,22.00);
        Artikel artikel6 = new Artikel("Hamster im hinteren Stromgebiet",978346200,24.00);
        Artikel artikel7 = new Artikel("QualityLand 2.0",978355020,19.00);
        Artikel artikel8 = new Artikel("Der Gesang der Flusskrebse",978344626,19.00);
        Artikel artikel9 = new Artikel("Und die Welt war jung",978346340,22.00);
        Artikel artikel10 = new Artikel("Ada",978355020,24.00);


        Kunde kunde1 = new Kunde(567983, "Erich", "Kästner",
                "Appellhofplatz 1, 50667 Köln", "Appellhofplatz 1, 50667 Köln");

        Kunde kunde2 = new Kunde(432876,"Heinz","Erhardt",
                "An Fürthenrode 9, 52511 Geilenkirchen","An Fürthenrode 9, 52511 Geilenkirchen");



        Bestellung bestellung1 = new Bestellung();
        bestellung1.setPreisDerBestellung(35);
        bestellung1.berechnungVersandkosten();
        bestellung1.getVersandKosten();
        System.out.println(bestellung1.getVersandKosten());

        bestellung1.sendeBestellbestätigung();
    }






}
