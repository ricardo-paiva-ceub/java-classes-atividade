// # Atividade 02
// Rode o exemplo mostrado em ProgramaLeitorTeclado2.
// Escreva um programa que leia 3 frases digitadas pelo usuário, que entram através do teclado, e que as imprima na tela na ordem inversa de entrada.
// Escreva um programa que lê o nome de um aluno, o nome de uma disciplina e as notas de 4 provas realizadas nela. Calcule e apresente na tela a média aritimética alcançada por essas notas. Imprima essa informação através de uma mensagem que informe também o nome do aluno e da disciplina cursada.

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MediaDisciplina {
    private Scanner scanner = new Scanner(System.in);
    private String nomeAluno;
    private String nomeDisciplina;
    private double notaMencao1;
    private double notaMencao2;
    private double notaMencao3;
    private double notaMencao4;

    public String associaString(String elemento) throws RuntimeException {
        String stringObtida;

        while (true) {
            try {
                System.out.println("Digite o nome " + elemento + ".");

                stringObtida = scanner.nextLine();

                if (stringObtida.isBlank()) {
                    throw new RuntimeException();
                } else {
                    break;
                }

            } catch (RuntimeException ex) {
                System.out.println("Digite um nome válido! Não pode ser em branco!");
            }
        }

        System.out.println("Nome " + elemento + " recebido com sucesso." + "(" + stringObtida + ")");
        return stringObtida;
    }

    public double associaDouble(String elemento) throws NumberFormatException {
        double doubleObtida = 0.0;
        String resultadoScanner = "";

        while (true) {
            try {
                System.out.println("Digite a nota " + elemento + ".");

                resultadoScanner = scanner.nextLine();
                doubleObtida = Double.parseDouble(resultadoScanner);
                break;

            } catch (Exception ex) {
                System.out.println("Digite um valor decimal válido para a nota!");
                System.out.println("Valor lido:" + resultadoScanner);
            }
        }

        System.out.println("Nota " + elemento + " recebida com sucesso." + " (" + doubleObtida + ")");
        return doubleObtida;
    }

    public double obterMediaNotas() {
        return (this.notaMencao1 + this.notaMencao2 + this.notaMencao3 + this.notaMencao4)/4;
    }

    public void mostrarResultadoFinal() {
        System.out.println("O aluno " + this.nomeAluno + " cursou a disciplina " + this.nomeDisciplina + " e obteve a média final " + this.obterMediaNotas());
    }

    public static void main(String[] args) {
        MediaDisciplina mediaDisciplina = new MediaDisciplina();
        mediaDisciplina.nomeDisciplina = mediaDisciplina.associaString("da disciplina");
        mediaDisciplina.nomeAluno = mediaDisciplina.associaString("do aluno");
        mediaDisciplina.notaMencao1 = mediaDisciplina.associaDouble("da 1a menção");
        mediaDisciplina.notaMencao2 = mediaDisciplina.associaDouble("da 2a menção");
        mediaDisciplina.notaMencao3 = mediaDisciplina.associaDouble("da 3a menção");
        mediaDisciplina.notaMencao4 = mediaDisciplina.associaDouble("da 4a menção");

        mediaDisciplina.mostrarResultadoFinal();
    }
}