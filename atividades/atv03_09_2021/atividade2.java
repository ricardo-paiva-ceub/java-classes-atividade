//## Atividade 02
//Implemente e execute o ProgramaFor e o ProgramaWhileSorteio.
//Implemente um programa chamado ProgramaForSorteio que é a implementação do ProgramaWhileSorteio usando-se for ao invés de while.

public class ProgramaFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

import java.util.Scanner;

public class ProgramaWhileSorteio {

    public static void main(String[] args) {
        long numero = Math.round(Math.random() * 10);
        long chute;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 10");
        chute = Long.parseLong(leitor.nextLine());

        while (numero != chute) {
            System.out.println("Errou. Tente outra vez. Digite um número entre 1 e 10");
            chute = Long.parseLong(leitor.nextLine());
        }

        System.out.println("Agora sim, você acertou!");
    }
}

import java.util.Scanner;

public class ProgramaForSorteio {

    public static void main(String[] args) {
        long numero = Math.round(Math.random() * 10);
        long chute;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 10");
        chute = Long.parseLong(leitor.nextLine());

        for (int i = 0; i < 1; i = i) {
            System.out.println("Errou. Tente outra vez. Digite um número entre 1 e 10.");
            chute = Long.parseLong(leitor.nextLine());

            if (numero == chute) {
                i++;
            }
        }

        System.out.println("Agora sim, você acertou!");
    }
}