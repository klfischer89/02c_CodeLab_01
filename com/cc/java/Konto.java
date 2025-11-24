package com.cc.java;

import java.util.ArrayList;
import java.util.List;

public class Konto {

    private int kontostand = 10000;
    private static List<Konto> kontoListe = new ArrayList<>();

    public Konto(int kontostand) {
        this.kontostand = kontostand;
        kontoListe.add(this);
    }

    public Konto() {
        kontoListe.add(this);
    }

    public int getKontostand() {
        return kontostand;
    }

    public static List<Konto> getKontoListe() {
        return kontoListe;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    } 

    public static List<Konto> verfielfacheKontostand(){

        for (int i = 0; i < kontoListe.size(); i++) {
            if (i!=kontoListe.size()-1) {
                kontoListe.get(i).setKontostand(kontoListe.get(i).getKontostand()*(i+2));
            } else {
                kontoListe.get(i).setKontostand(kontoListe.get(i).getKontostand()*10);
            }
        }

        return kontoListe;
    }

}
