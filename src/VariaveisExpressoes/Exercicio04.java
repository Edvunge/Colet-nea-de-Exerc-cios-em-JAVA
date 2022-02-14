package VariaveisExpressoes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        // 4. Leia um numero real e imprima o resultado do quadrado desse numero.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("indique um numero real:");
        float number = sc.nextFloat();

        float result = ( number * number );

        System.out.println(" o resultado do quadrado do numero é: " + result);

        sc.close();
    }
}
