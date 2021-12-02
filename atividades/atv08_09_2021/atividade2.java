// ## Atividade 02
// Implemente e execute o ProgramaEqualsUpperCase, conforme mostrado na aula. Verifique o resultado ao digitar os mesmos textos, variando apenas a questão de letras maiúsculas e minúsculas.
// Altere a implementação do programa para transformar os dois textos para letras minúsculas. Verifique se o programa continua executando corretamente.

import java.util.Scanner;

public class ProgramaEqualsUpperCase {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro nome:");
        String nome1 = leitor.next();
        System.out.println("Digite o segundo nome:");
        String nome2 = leitor.next();
        nome1 = nome1.toUpperCase();
        nome2 = nome2.toUpperCase();
        if (nome1.equals(nome2)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }
        System.out.println(nome1);
        System.out.println(nome2);
    }
}

// Neste caso, o programa não diferencia entre as letras maiúsculas e minúscuals, mesmo após a alteração da String para constar apenas minúsculas.