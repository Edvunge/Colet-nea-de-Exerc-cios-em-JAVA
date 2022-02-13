package UsandoNomes;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        /*
        8) Receber do teclado um nome e imprimir tantas vezes quantos
        forem seus caracteres.
        */

        Scanner sc = new Scanner(System.in);

        int x, tamanho;

        System.out.println(" indique o seu nome: ");
        String nome = sc.nextLine();

        tamanho = nome.length();

        for (x = 1; x <= tamanho; x++){
            System.out.printf(" %s ", nome);
        }

        sc.close();
    }
}
