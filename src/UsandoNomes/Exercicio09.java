package UsandoNomes;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        /*
        9) Receber do teclado uma mensagem e imprimir quantas letras A, E,
        I, O, U tem esta mensagem. Considerar minúscula e maiúscula. A
        função em portugol que acessa letra por letra de uma palavra é
        strlem(variavel,x). (x é a posição da letra na frase)
        */
        int x,tam;
        int ca,ce,ci,co,cu;


        ca = ce = ci = co = cu = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println(" indique o seu nome: ");
        char nome = (char)System.in.read();

        tam = nome.length();
        for (x=1; x <= tam-1; x++)
        {
            if (nome[x] == 'a' || nome[x] == 'A') {
                ca++;
            } else
                if (nome[x] == 'e' || nome[x] == 'E') {
                ce++;
                } else
                    if (nome[x] == 'i' || nome[x] == 'I'){
                    ci++;
                        } else
                            if (nome[x] == 'o' || nome[x] == 'O') {
                                co++;
                            } else
                                if (nome[x] == 'u' || nome[x] == 'U') {
                                    cu++;
                            }
        }

        System.out.printf("\n\nA frase tem:\n");
        System.out.printf("\n%d letra a",ca);
        System.out.printf("\n%d letra e",ce);
        System.out.printf("\n%d letra i",ci);
        System.out.printf("\n%d letra o",co);
        System.out.printf("\n%d letra u",cu);
    }
}
