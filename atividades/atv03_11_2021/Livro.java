public class Livro {
    private String tituloLivro;
    private String autorLivro;
    private String generoLivro;
    public static String[] generosLivros = {"Ficção", "Ciências Naturais", "Literatura", "Ciências Humanas"};

    public Livro(String tituloLivro, String autorLivro, int indexGeneroLivro) {
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.generoLivro = generosLivros[indexGeneroLivro];
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getGeneroLivro() {
        return generoLivro;
    }

    public void setGeneroLivro(int newIndexGeneroLivro) {
        this.generoLivro = generosLivros[newIndexGeneroLivro];
    }
}
