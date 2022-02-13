package UsandoNomes;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        // 5)Ler nome, endereço, telefone e imprimir


        Scanner sc = new Scanner(System.in);

        System.out.println(" Ler nome: ");
        String nome = sc.nextLine();

        System.out.println(" indique o seu endereço: ");
        String endereço = sc.nextLine();

        System.out.println(" indique o seu numero de telefone: ");
        int telefone = sc.nextInt();


        System.out.println(" o seu nome é " + nome);
        System.out.println(" o seu endereço é " + endereço);
        System.out.println(" o seu numero de tel: " + telefone);

        sc.close();
    }
}
