package org.lessons.java;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Biglietto {
    /*
    Consegna: Il programma dovrà chiedere all’utente il numero (intero) di chilometri che vuole percorrere e l’età del passeggero (numero intero). Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
    il prezzo del biglietto è definito in base ai km (0.21 € al km)
    va applicato uno sconto del 20% per i minorenni
    va applicato uno sconto del 40% per gli over 65
    Per chiedere informazioni all’utente sarà necessario usare la classe java.util.Scanner, come visto in classe stamattina.
    Bonus: formattare il risultato con un numero limitato di decimali utilizzando la classe DecimalFormat
    */
    public static void main(String[] args) {

        Scanner km = new Scanner(System.in);
        System.out.println("Inserisci i km da percorrere");

        int kmUtente = km.nextInt();

        Scanner eta = new Scanner(System.in);
        System.out.println("Inserisci la tua età");

        int etaUtente = eta.nextInt();
        double prezzoKm = 0.21;
        double prezzoBase = ( kmUtente * prezzoKm );

        double sconto = 0;
        if ( etaUtente < 18) {
            sconto = 0.20;
        }
        if ( etaUtente > 65 ) {
            sconto = 0.40;
        }

        double prezzoFinale;

        prezzoFinale = prezzoBase * ( 1 - sconto);

        DecimalFormat dueDecimali;
        dueDecimali = new DecimalFormat("0.00€");

        System.out.println("Il prezzo del biglietto è " + dueDecimali.format(prezzoFinale));
    }
}
