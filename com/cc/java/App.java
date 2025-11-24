package com.cc.java;
import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {

        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();

        Konto.getKontoListe().forEach(konto -> output(konto.getKontostand()));

        Konto.verfielfacheKontostand();

        Konto.getKontoListe().forEach(konto -> output(konto.getKontostand()));
    
    }


    private static void output(Object outputData) {
        System.out.println(outputData);
    } 

}