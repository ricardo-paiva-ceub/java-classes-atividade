public class Main {
    public static void main(String[] args) {
        Trator trator = new Trator();
        Robo robo = new Robo();

        ControleRemoto controleRemoto = new ControleRemoto();

        controleRemoto.ligar(trator);
        controleRemoto.ligar(robo);
    }
}