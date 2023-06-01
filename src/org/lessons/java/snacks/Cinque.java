package org.lessons.java.snacks;
import java.util.Scanner;
public class Cinque {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){
            Scanner numero = new Scanner(System.in);
            System.out.println("Inserisci un numero");

            int numeroUtente = numero.nextInt();

            if (numeroUtente % 2 == 0) {
                System.out.println("Pari");
            } else {
                System.out.println("Dispari");
            }
        }
    }

}
