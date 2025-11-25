package com.cc.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();

        Konto.getKontoListe().forEach(konto -> output(konto.getKontostand()));

        Konto.verfielfacheKontostand(provideUserInput());

        Konto.getKontoListe().forEach(konto -> output(konto.getKontostand()));
    
    }

    private static void output(Object outputData) {
        System.out.println(outputData);
    } 

    private static List<Integer> provideUserInput(){

        List<Integer> multiplierList = new ArrayList<>();
        int multiplier;

        String question = "Um wie viel soll folgendes Konto erhöht werden, Konto ";

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            output(question + (i+1) + "? ");
            multiplier = input.nextInt();
            multiplierList.add(multiplier);
        }

        input.close();

        return multiplierList;
    }

}