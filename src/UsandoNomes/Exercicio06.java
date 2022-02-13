package UsandoNomes;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) throws IOException {

        /*
        6) Ler nome, sexo e idade. Se sexo for feminino e idade menor que
        25. Imprimir o nome da pessoa e a palavra ACEITA. Caso contrario
        imprimir NAO ACEITA.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println(" indique o seu nome: ");
        String nome = sc.nextLine();

        System.out.println(" indique o seu sexo: ");
        char sexo = (char)System.in.read();

        System.out.println(" indique a sua idade: ");
        int idade = sc.nextInt();

        if ( (sexo == 'f') || ( sexo == 'F' ) && idade < 25){
            System.out.printf("%s. ACEITA." , nome);
        } else {
            System.out.println("NAO ACEITA.");
        }

        sc.close();

    }
}
