package UsandoNumerosCalculandoMédias;

import java.util.Scanner;

public class Exercicio0_14 {
    public static void main(String[] args) {
        /*
        14) Ler um numero e se for maior que 20 imprimir a metade desse
        numero.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println(" digite um numero inteiro: ");
        double number = scanner.nextDouble();

        double metadeNumber = number / 2;

        if(number > 20){
            System.out.println("a metade é:  " + metadeNumber);
        }

        scanner.close();
    }
}
