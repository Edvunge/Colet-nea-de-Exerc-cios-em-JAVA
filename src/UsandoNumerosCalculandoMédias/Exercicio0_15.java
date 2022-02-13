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
        double numberOne = scanner.nextDouble();

        System.out.println(" digite o segundo numero inteiro: ");
        double numberTwo = scanner.nextDouble();

        double soma = numberOne + numberTwo;

        if(soma > 10){
            System.out.println("a soma é:  " + soma);
        }

        scanner.close();
    }
}
