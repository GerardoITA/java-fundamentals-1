package org.lessons.java.snacks;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        Scanner numeroUno = new Scanner(System.in);
        System.out.println("Inserisci un numero");

        int numeroUnoUtente = numeroUno.nextInt();

        Scanner numeroDue = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numeroDueUtente = numeroDue.nextInt();

        if ( numeroUnoUtente > numeroDueUtente ) {
            System.out.println(numeroUnoUtente);
            System.out.println(numeroDueUtente);
        } else {
            System.out.println(numeroUnoUtente);
            System.out.println(numeroDueUtente);
        }
    }
}
