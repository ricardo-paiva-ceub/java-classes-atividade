//## Atividade 01
//Implemente o ProgramaForAsterisco mostrado e indique qual a resposta produzida pelo programa.
//Implemente o ProgramaFor2 mostrado anteriormente e indique qual a resposta produzida pelo programa. Comente em cima da quantidade de vezes em que o laço dentro do programa é executado.
//Implemente e execute o ProgramaForInfinito. Relate o que acontece e como você para a execução do programa.
//Implemente um programa que realiza um laço infinito e que, em cada laço, mostre a quantidade de vezes que ele já foi executado.

public class ProgramaforAsterisco {
    public static void main(String[] args) {
        String texto = "*";

        for (int i = 1; i <= 10; i++) {
            System.out.println(texto);
            texto = texto + "*";
        }
    }
}

// Saída do programa:
// *
// **
// ***
// ****
// *****
// ******
// *******
// ********
// *********
// **********

public class ProgramaFor2 {
    public static void main(String[] args) {
        String texto = "*";

        for (int i = 10; i < 10; i++) {
            System.out.println(texto);
            texto = texto + "*";
        }
    }
}

// Não há saída para este programa, pois ele não atendeu à condição de continuidade definida no laço for. Logo, nada dentro do bloco For é executado.

public class ProgramaForInfinito {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i = i) {
            System.out.println("Olá");
        }
    }
}

// O programa vai mostrar a frase "Olá" infinitamente.
public class ProgramaForInfinito2 {
    public static void main(String[] args) {
        int contador = 0;

        while(true) {
            contador++;
            System.out.println(contador);
        }
    }
}
