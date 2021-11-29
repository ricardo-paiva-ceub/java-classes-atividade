//# Atividade 01
//        Escreva e rode o código do exemplo ProgramaPrintln, no qual mostramos como imprimir valores na tela. Adicione a ele os comandos mostrados para imprimir caracteres especiais, como o de barra invertida e de aspas duplas.
//        Faça um programa que imprima a mensagem Meu nome é "Nome Sobrenome", onde nome e sobrenome são os seus dados pessoais.
//        Crie um programa para calcular e imprimir a área de um retângulo de lados 20 e 30.

import java.util.Scanner;

public class NomeSobrenome {
    private Scanner scanner = new Scanner(System.in);
    public String nome;
    public String sobrenome;

    public String associaNome() throws RuntimeException {
        System.out.println("Digite seu nome.");
        String nome;

        while(true) {
            try {
                if (scanner.hasNext()) {
                    nome = scanner.next();

                    if (nome.equals("")) {
                        throw new RuntimeException();
                    } else {
                        break;
                    }
                }
            } catch (RuntimeException ex) {
                System.out.println("O nome digitado não pode ser vazio.");
            }
        }

        System.out.println("Nome recebido com sucesso.");
        return nome;
    }

    public String associaSobrenome() throws RuntimeException {
        System.out.println("Digite seu sobrenome.");
        String sobrenome;

        while(true) {
            try {
                if (scanner.hasNext()) {
                    sobrenome = scanner.next();

                    if (sobrenome.equals("")) {
                        throw new RuntimeException();
                    } else {
                        break;
                    }
                }
            } catch (RuntimeException ex) {
                System.out.println("O nome digitado não pode ser vazio.");
            }
        }

        System.out.println("Sobrenome recebido com sucesso.");
        return sobrenome;
    }

    public void mostraNomeSobrenome() {
        System.out.println("Seu nome completo é **** " + this.nome + " " + this.sobrenome + " ****.");
    }

    public static void main(String[] args) {
        NomeSobrenome nomeSobrenome = new NomeSobrenome();
        nomeSobrenome.nome = nomeSobrenome.associaNome();
        nomeSobrenome.sobrenome = nomeSobrenome.associaSobrenome();
        nomeSobrenome.mostraNomeSobrenome();
    }

}