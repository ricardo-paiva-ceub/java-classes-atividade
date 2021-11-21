public class Main {

    public static void main(String[] args) {
        PodeVotar pessoa1 = new PodeVotar(18, "Rogério");
        PodeVotar pessoa2 = new PodeVotar(16, "Roberval");
        PodeVotar pessoa3 = new PodeVotar(25, "Adelena");

        try {
            pessoa1.podeVotar();
            pessoa2.podeVotar();
            pessoa3.podeVotar();
            System.out.println("Caso de sucesso! Todos podem votar.");
        } catch (ExcecaoNaoPodeVotar ex) {
            System.out.println("Alguma das pessoas citadas tem menos de 18 anos e NÃO PODE votar.");
            System.out.println("Caso de falha.");
        } finally {
            System.out.println("Programa finalizado.");
        }
    }
}
