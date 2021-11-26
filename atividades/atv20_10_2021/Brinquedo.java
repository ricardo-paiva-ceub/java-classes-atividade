// ## Atividade 02
// Implemente em Java a classe Brinquedo apresentada na figura_atividade2_polimorfismo a seguir, aplicando o polimorfismo de sobrecarga nos métodos apontados pelas setas. Em seguida, escreva um método main que cria diferentes brinquedos fazendo chamadas para seus diferentes métodos construtores e chamando diferentes métodos velocidade().

public class Brinquedo {
    private String nome;
    private double velocidade;
    private double aceleracao;

    public Brinquedo() {
        this.nome = "Brinquedo genérico";
        this.velocidade = 0;
        this.aceleracao = 0;
    }

    public Brinquedo(String nome) {
        this.nome = nome;
        this.velocidade = 0;
        this.aceleracao = 0;
    }

    public String getNome() {
        return nome;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void mover() {
        System.out.println("Brinquedo " + this.getNome() + " movido a uma velocidade de " + this.getVelocidade() + " e a uma aceleração de " + this.getAceleracao() + ".");
    }

    void velocidade(int vel) {
        this.velocidade = (double)vel;
    }

    void velocidade(double vel) {
        this.velocidade = vel;
    }

    void velocidade(float vel, double ac) {
        this.velocidade = (double)vel;
        this.aceleracao = ac;
    }

    public static void main(String[] args) {
        Brinquedo hotWeels = new Brinquedo("Hot Weels");
        Brinquedo generico = new Brinquedo();
        Brinquedo batMovel = new Brinquedo("Bat Móvel");

        hotWeels.velocidade(11.5);
        hotWeels.mover();
        generico.velocidade(10.5f, 2.0);
        generico.mover();
        batMovel.velocidade(20);
        batMovel.mover();

    }
}
