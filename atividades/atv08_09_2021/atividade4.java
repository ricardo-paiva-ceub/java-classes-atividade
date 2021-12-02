//  Atividade 04
//  Implemente e execute os ProgramaStringCaracteres e ProgramaString, conforme mostrado na aula. Verifique se eles geram o mesmo resultado para entradas iguais.
//  Crie um programa que lê uma String e imprima apenas os caracteres de índice ímpar.

import java.util.Scanner;

public class ProgramaStringCaracteres {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String nome1 = leitor.next();
        char[] caracteres = nome1.toCharArray();
        System.out.println("Inverso:");
        for (int i = caracteres.length - 1; i >= 0; i--) {
            System.out.print(caracteres[i]);
        }
    }
}

import java.util.Scanner;

public class ProgramaString {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String nome1 = leitor.next();
        System.out.println("Inverso:");
        for (int i = nome1.length() - 1; i >= 0; i--) {
            System.out.print(nome1.charAt(i));
        }
    }
}

// Possuem o mesmo resultado para entradas iguais.

import java.util.Scanner;

public class StringCaracteresImpares {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String nome1 = leitor.next();
        char[] caracteres = nome1.toCharArray();
        System.out.println("Ímpares:");

        for (int i = 0; i < caracteres.length; i++) {
            if (i % 2 == 1) {
                System.out.print(caracteres[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < nome1.length(); i++) {
            if (i % 2 == 1) {
                System.out.print(nome1.charAt(i));
            }
        }
        System.out.println();

    }


}