package VariaveisExpressoes;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        // 3. Peça ao usuario para digitar tres valores inteiros e imprima a soma deles.

        Scanner sc = new Scanner(System.in);

        System.out.println("indique um numero inteiro:");
        int number = sc.nextInt();

        System.out.println("indique o segundo numero inteiro:");
        int numberTwo = sc.nextInt();

        System.out.println("indique o terceiro numero inteiro:");
        int numberThree = sc.nextInt();

        int soma = ( number + numberTwo + numberThree );

        System.out.println(" a soma dos numeros digitado é: " + soma);

        sc.close();
    }
}
