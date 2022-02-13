package UsandoNomes;


import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        // 7) Digite um nome , calcule e mostre quantas letras tem.

        Scanner sc = new Scanner(System.in);

        /*
        System.out.println(" indique o seu nome: ");
        String nome = sc.nextLine();

        System.out.println(" contem  " + nome.length() + " letras ");
        */

        int x, tam;


        System.out.println(" indique o seu nome: ");
        String nome = sc.nextLine();

        tam = nome.length();

        for (x = 1; x <= tam; x++){
            System.out.printf(" %s ", nome);
         }

        sc.close();
    }
}
