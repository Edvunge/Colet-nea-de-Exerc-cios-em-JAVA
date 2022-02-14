package VariaveisExpressoes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        // 5. Leia um numero real e imprima a quinta parte deste numero.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("indique um numero real:");
        float number = sc.nextFloat();

        float result =  (number/5) ;

        System.out.printf(" o resultado do quadrado do numero é: %.3f " , result);

        sc.close();
    }
}
