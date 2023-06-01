package org.lessons.java.snacks;
import java.util.Scanner;
import java.util.Arrays;

public class Tre {
    public static void main(String[] args) {

        int n = 10;
        int[] arrayNumeri = new int[n];
        int somma = 0;
        Scanner numero = new Scanner(System.in);
        for (int i = 0; i < n; i++) {

            System.out.println("Inserisci un numero");

            int numeroUtente = numero.nextInt();

            arrayNumeri[i] = numeroUtente;

            somma += numeroUtente;

        }
        System.out.println(Arrays.toString(arrayNumeri));
        System.out.println("Somma = " + somma);

        numero.close();
    }
}
