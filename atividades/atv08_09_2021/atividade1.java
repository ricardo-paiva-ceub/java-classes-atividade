// ## Atividade 01
// Implemente e execute o ProgramaEquals, conforme mostrado na aula. Verifique o resultado ao digitar textos iguais e textos diferentes.
// Comente o que acontece na execução do ProgramaEquals quando você passa dois textos com mesmas letras, porém com alguma diferença de letras entre maiúscula e minúscula.


import java.util.Scanner;

public class ProgramaEquals {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro nome:");
        String nome1 = leitor.nextLine();
        System.out.println("Digite o segundo nome:");
        String nome2 = leitor.nextLine();
        if (nome1.equals(nome2)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }
    }
}

// Se eu digitar as mesmas palavras, mas com diferenças entre de maiúsculas ou minúsculas, o programa acusa que as Strings são falsas, isto porque o método .equals é case-sensitive.