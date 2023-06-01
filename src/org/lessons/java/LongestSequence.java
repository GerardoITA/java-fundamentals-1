package org.lessons.java;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class LongestSequence {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Inserisci un numero");

        int numeroUtente = numero.nextInt();

        int[] arrayNumeri = new int[numeroUtente];

        numero.close();

        int limiteRandom = 5;

        for ( int i = 0; i < arrayNumeri.length; i++) {
            Random random = new Random();
            int numRand = random.nextInt(limiteRandom);
            System.out.println(numRand);
            arrayNumeri[i] = numRand;
        }

        System.out.println(Arrays.toString(arrayNumeri));

        int generalCounter = 0;
        int winningNumber = arrayNumeri[0];
        int prevNumber = limiteRandom + 1;

        for ( int i = 0; i < arrayNumeri.length; i++) {
            int localCounter = 0;

            if (arrayNumeri[i] == prevNumber) {
                localCounter++;

            }
            if (localCounter > generalCounter) {
                generalCounter = localCounter;
            }

            prevNumber = arrayNumeri[i];

        };


        System.out.println(generalCounter + " del numero ");


        // enhanced for???? cos'è?
    }



}
