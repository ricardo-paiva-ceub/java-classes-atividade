package atv2_abstratas;

public abstract class FiguraAbstrata {
    protected int numeroLados;
    protected String nome;

    public FiguraAbstrata(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}