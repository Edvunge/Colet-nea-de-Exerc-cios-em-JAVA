package UsandoNumerosCalculandoMédias;

import java.util.Scanner;

public class Exercicio0_15 {
    public static void main(String[] args) {
        /*
        15) Ler 2 numeros inteiros e soma-los. Se a soma for maior que 10,
        mostrar o resultado da soma.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println(" digite um numero inteiro: ");
        int numberOne = scanner.nextInt();

        System.out.println(" digite o segundo numero inteiro: ");
        int numberTwo = scanner.nextInt();

        double soma = numberOne + numberTwo;

        if(soma > 10){
            System.out.println("a soma é:  " + soma);
        }

        scanner.close();

    }
}
