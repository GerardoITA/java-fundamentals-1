package org.lessons.java.snacks;
import java.util.Scanner;
import java.util.Arrays;
public class Quattro {

    public static void main(String[] args) {

        String[] invitati = new String[]{"Paolo", "Pietro", "Poldo", "Pasquale"};

        Scanner nome = new Scanner(System.in);
        System.out.println("Inserisci un nome");

        String nomeUtente = nome.next();

        int counter = 0;
        for (String nomeLista : invitati) {
            if (nomeUtente.toLowerCase().equals(nomeLista.toLowerCase())) {

                counter++;

                break;
            }
        }
        if (counter > 0) {
            System.out.println("Sei invitato");
        } else {
            System.out.println("Non sei invitato");
        }

    }
}
