package Labirinto;

public class Labirinto {

    private static final char PAREDE_VERTICAL = '█';
    private static final char PAREDE_HORIZONTAL = '█';
    private static final char PAREDE_INTERNA = '█';
    private static final char VAZIO = ' ';
    private static final char TAMANHO = 20;
    private static final double PROBABILIDADE = 0.75;
    private static final char INICIO = 'I';
    private static final char DESTINO = 'D';
    private static int linhaInicio;
    private static int colunaInicio;
    private static final char CAMINHO = '.';
    private static final char SEM_SAIDA = 'x';
    private static char[][] tabuleiro;

    public static int gerarNumero(int minimo, int maximo) {
        int valor = (int) Math.round(Math.random() * (maximo - minimo));

        return minimo + valor;
    }

    public static void inicializarMatriz() {

        int i, j;

        for (i = 0; i < TAMANHO; i++) {
            tabuleiro[i][0] = PAREDE_VERTICAL;
            tabuleiro[i][TAMANHO - 1] = PAREDE_VERTICAL;
            tabuleiro[0][i] = PAREDE_HORIZONTAL;
            tabuleiro[TAMANHO - 1][i] = PAREDE_HORIZONTAL;
        }

        for (i = 1; i < TAMANHO - 1; i++) {
            for (j = 1; j < TAMANHO - 1; j++) {
                if (Math.random() > PROBABILIDADE) {
                    tabuleiro[i][j] = PAREDE_INTERNA;
                } else {
                    tabuleiro[i][j] = VAZIO;
                }
            }
        }

        // Início
        linhaInicio = gerarNumero(1, TAMANHO / 2 - 1);
        colunaInicio = gerarNumero(1, TAMANHO / 2 - 1);
        tabuleiro[linhaInicio][colunaInicio] = INICIO;

        // Fim
        int linhaDestino = gerarNumero(TAMANHO / 2, TAMANHO - 2);
        int colunaDestino = gerarNumero(TAMANHO / 2, TAMANHO - 2);
        tabuleiro[linhaDestino][colunaDestino] = DESTINO;

    }

    public static void imprimir() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                System.out.print(tabuleiro[i][j]);
            }

            System.out.println();

        }

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static boolean buscarCaminho(int linhaAtual, int colunaAtual) {
        int proximaLinha;
        int proximaColuna;
        boolean achou = false;


        // Tentar acima
        proximaLinha = linhaAtual - 1;
        proximaColuna = colunaAtual;
        achou = tentarCaminho(proximaLinha, proximaColuna);

        if (achou) {
            return achou;
        }

        // Tentar abaixo
        proximaLinha = linhaAtual + 1;
        proximaColuna = colunaAtual;
        achou = tentarCaminho(proximaLinha, proximaColuna);

        if (achou) {
            return achou;
        }

        // Tentar à esquerda
        proximaLinha = linhaAtual;
        proximaColuna = colunaAtual - 1;
        achou = tentarCaminho(proximaLinha, proximaColuna);

        if (achou) {
            return achou;
        }

        // Tentar à direita
        proximaLinha = linhaAtual;
        proximaColuna = colunaAtual + 1;
        achou = tentarCaminho(proximaLinha, proximaColuna);

        if (achou) {
            return achou;
        }

        return achou;
    }

    private static boolean tentarCaminho(int proximaLinha, int proximaColuna) {
        boolean achou = false;

        if (tabuleiro[proximaLinha][proximaColuna] == DESTINO) {
            achou = true;
            return achou;
        } else if (posicaoVazia(proximaLinha, proximaColuna)) {
            // Assinalar o caminho
            tabuleiro[proximaLinha][proximaColuna] = CAMINHO;
            imprimir();
            achou = buscarCaminho(proximaLinha, proximaColuna);

            if (!achou) {
                tabuleiro[proximaLinha][proximaColuna] = SEM_SAIDA;
                imprimir();
            }

        }



        return achou;
    }

    public static boolean posicaoVazia(int linha, int coluna) {
        boolean vazio = false;

        if (linha >= 0 && coluna >= 0 && linha < TAMANHO && coluna < TAMANHO) {
            vazio = (tabuleiro[linha][coluna] == VAZIO);
        }

        return vazio;
    }

    public static void main(String[] Arg) {

        tabuleiro = new char[TAMANHO][TAMANHO];
        inicializarMatriz();
        imprimir();

        System.out.println("\n ** PROCURANDO SOLUÇÃO.. **");
        boolean achou = buscarCaminho(linhaInicio, colunaInicio);
        if (achou) {
            System.out.println("CAMINHO ENCONTRADO!");
        } else {
            System.out.println("Não há caminho possível!");
        }

    }

}