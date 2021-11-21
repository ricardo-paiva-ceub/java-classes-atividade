package atv2_abstratas;

class Triangulo extends FiguraAbstrata {
    public Triangulo() {
        super(3);
    }

    public void desenha() {
        System.out.println("\uD83D\uDD3A");
    }
}