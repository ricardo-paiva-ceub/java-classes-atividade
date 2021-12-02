// ## Atividade 03
// Implemente e execute o ProgramaEqualsIgnoreCase, conforme mostrado na aula. Verifique o resultado ao digitar os mesmos textos, variando apenas a questão de letras maiúsculas e minúsculas.

import java.util.Scanner;

public class ProgramaEqualsIgnoreCase {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro nome:");
        String nome1 = leitor.next();
        System.out.println("Digite o segundo nome:");
        String nome2 = leitor.next();
        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }
    }

}

// Neste caso, o programa não diferencia entre as letras maiúsculas e minúscuals, mesmo após a alteração da String para constar apenas minúsculas.