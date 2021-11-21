package atv2_abstratas;

class Triangulo extends FiguraAbstrata {
    public Triangulo() {
        super(4);
    }

    public void desenha() {
        System.out.println("⬛");
    }
}