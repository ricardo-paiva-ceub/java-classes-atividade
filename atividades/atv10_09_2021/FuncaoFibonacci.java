// # Atividade 01
// Implemente uma versão iterativa para a função de Fibonacci.
// Descreva, com suas palavras, qual implementação foi mais fácil de se utilizar.

public class FuncaoFibonacci {

    public static int retornaValorSequenciaFibonacci(int posicaoSequencia) {
        if (posicaoSequencia == 2) {
            return 1;
        } else if (posicaoSequencia == 1) {
            return 0;
        }

        return retornaValorSequenciaFibonacci(posicaoSequencia - 1) + retornaValorSequenciaFibonacci(posicaoSequencia - 2);

    }


    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        }

        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(retornaValorSequenciaFibonacci(10));
    }
}