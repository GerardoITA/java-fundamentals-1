package org.lessons.java.snacks;
import java.util.Scanner;
public class Due {

    public static void main(String[] args) {

        Scanner parolaUno = new Scanner(System.in);
        System.out.println("Inserisci un parola");

        String parolaUnoUtente = parolaUno.next();

        Scanner parolaDue = new Scanner(System.in);
        System.out.println("Inserisci un parola");

        String parolaDueUtente = parolaDue.next();

        char[] parolaUnoArray = parolaUnoUtente.toCharArray();
        char[] parolaDueArray = parolaDueUtente.toCharArray();

        if ( parolaUnoArray.length > parolaDueArray.length ) {
            System.out.println(parolaUnoUtente);
            System.out.println(parolaDueUtente);
        } else {
            System.out.println(parolaDueUtente);
            System.out.println(parolaUnoUtente);
        }





    }
}
