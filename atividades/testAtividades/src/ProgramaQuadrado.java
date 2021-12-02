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

