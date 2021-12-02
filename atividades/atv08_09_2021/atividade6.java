// ## Atividade 06
// Implemente e execute o ProgramaSubstring, conforme mostrado na aula. Relate o comportamento do mesmo quando o usuário digita um texto começando com João e outros começando com outro nome.
// Altere o ProgramaSubstring, removendo a verificação de que o nome possui pelo menos 4 caracteres. Rode o programa e relate seu comportamento quando o usuário digita textos com menos de 4 caracteres.

import java.util.Scanner;

public class ProgramaSubstring {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome completo:");
        String nome = leitor.nextLine();
        if (nome.length() >= 4 && nome.substring(0, 4).equalsIgnoreCase("João")) {
            System.out.println("Olá João!");
        } else {
            System.out.println("Epa, você não é João!");
        }
    }
}

// Quando digita um texto começando com João, o programa dá as boas vindas. Quando o nome não contém João, ele diz que não sou João.
// Quando retiro a verificação de que o nome possui menos que quatro caracteres, ocorre uma exceção, pois não posso retirar uma substring que seja maior que a própria String da qual está sendo retirada.