//## Atividade 03
//        Implemente e execute os programas ProgramaWhileSorteio2 e ProgramaDoWhileSorteio.
//        Crie um programa que leia um número e que imprima o seu valor ao quadrado. Caso o quadrado desse número seja igual a 0 (zero), o programa deve sair.

import java.util.Scanner;

public class ProgramaWhileSorteio2 {

    public static void main(String[] args) {
        long numero = Math.round(Math.random() * 10);
        long chute = -1;
        Scanner leitor = new Scanner(System.in);

        while (numero != chute) {
            System.out.println("Digite um número entre 1 e 10:");
            chute = Long.parseLong(leitor.nextLine());

            if (chute != numero) {
                System.out.println("Errou. Tente outra vez.");
            }
        }

        System.out.println("Agora sim, você acertou!");
    }
}

import java.util.Scanner;

public class ProgramaDoWhileSorteio {

    public static void main(String[] args) {
        long numero = Math.round(Math.random() * 10);
        long chute;
        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println("Digite um número entre 1 e 10:");
            chute = Long.parseLong(leitor.nextLine());

            if (chute != numero) {
                System.out.println("Errou. Tente outra vez.");
            }
        }  while (numero != chute);

        System.out.println("Agora sim, você acertou!");
    }
}

import java.util.Scanner;

public class ProgramaQuadrado {

    public static void main(String[] args) {
        double numerolido;
        double quadrado;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número, para ver o seu quadrado. O programa terminará quando o quadrado do número foi igual a zero.");

        do {
            numerolido = Double.parseDouble(leitor.nextLine());
            quadrado = Math.pow(numerolido, 2);

            System.out.println(String.format("O quadrado do número digitado é: %s.", quadrado));
            if (quadrado != 0) {
                System.out.println("Digite outro número.");
            }

        }  while (quadrado != 0);

        System.out.println("Programa encerrado.");
    }
}