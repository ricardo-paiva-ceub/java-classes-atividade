// ## Atividade 05
// Implemente e execute o ProgramaStringPosicaoChar, conforme mostrado na aula. Relate o comportamento do mesmo quando o usuário digita um texto contendo vários pontos.

import java.util.Scanner;

public class ProgramaStringPosicaoChar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String nome1 = leitor.nextLine();
        char ponto = '.';
        int inicio = 0;
        int posicao = nome1.indexOf(ponto);
        System.out.println("Existe ponto nas posições: ");

        while (inicio < nome1.length() && posicao != -1) {
            System.out.println(posicao);
            inicio = posicao + 1;
            posicao = nome1.indexOf(ponto, inicio);
        }
    }
}

// Quando o usuário digita um texto contendo vários pontos, o programa acima irá imprimir a posição de todos eles.