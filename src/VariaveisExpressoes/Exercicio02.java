package VariaveisExpressoes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
        2. Faça um programa que leia um numero real e o imprima.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("indique um numero real:");
        float number = sc.nextFloat();


        System.out.println("o numero digitado é: " + number);

        sc.close();
    }
}
