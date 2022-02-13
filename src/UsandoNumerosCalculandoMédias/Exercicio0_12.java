package UsandoNumerosCalculandoMédias;

import java.util.Scanner;

public class Exercicio0_12 {
    public static void main(String[] args) {
        /*
        12) Ler uma temperatura em graus Celsius e transformá-la em graus
        Fahrenheit.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a temperatura em fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double conversao = fahrenheit * 1.8 + 32;

        System.out.printf("valor em celsius: %.3f " , conversao);

        scanner.close();
    }
}
