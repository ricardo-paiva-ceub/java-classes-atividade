// Livro -> Título, Autor, Capítulo, Editora ...

public class Livro {
    private String titulo;
    private Autor autor;
    private String capitulo;
    private String titulo;

    public Livro(String titulo, Autor autor, String capitulo, String titulo1) {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulo = capitulo;
        this.titulo = titulo1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(String capitulo) {
        this.capitulo = capitulo;
    }
}