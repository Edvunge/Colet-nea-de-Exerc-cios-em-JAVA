package VariaveisExpressoes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
        6. Leia uma velocidade em km/h (quilometros por hora) e apresente-a convertida em m/s
        (metros por segundo). A formula de conversao é : M = K/3,6, sendo K a velocidade em
        km/h e M em m/s.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("indique a velocidade em km/h (quilometros por hora) :");
        float km = sc.nextFloat();

        float i= 3.6f;
        float m = (km /i);

        System.out.printf(" o resultado da conversao em m/s (metros por segundo): %.3f " , m);

        sc.close();
    }
}
