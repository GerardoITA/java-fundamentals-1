package org.lessons.java.snacks;
import java.util.Scanner;
public class Sei {

    public static void main(String[] args) {


        Scanner n = new Scanner(System.in);
        System.out.println("Quanti numeri?");
        int nUtente = n.nextInt();

        for (int i = 1; i < nUtente; i++) {
            System.out.println(i * i);
        }

    }
}
