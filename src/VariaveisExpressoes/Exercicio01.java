package VariaveisExpressoes;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // 1. Faça um programa que leia um numero inteiro e o imprima.

        Scanner sc = new Scanner(System.in);

        System.out.println("indique um numero inteiro:");
        int number = sc.nextInt();


        System.out.println("o numero digitado é: " + number);

        sc.close();
    }
}
