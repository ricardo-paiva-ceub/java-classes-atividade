public class Autor {
    private String nome;
    private Date dataNascimento;
    private String paisResidencia;

    public Autor(String nome, Date dataNascimento, String paisResidencia) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.paisResidencia = paisResidencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPaisResidencia() {
        return paisResidencia;
    }

    public void setPaisResidencia(String paisResidencia) {
        this.paisResidencia = paisResidencia;
    }
}