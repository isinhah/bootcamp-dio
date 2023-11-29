package src.list_interface.PesquisaEmList;

public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    //get
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return titulo + ", " + autor + ", " +
                " ano de publicacao:  " + anoPublicacao;
    }
}
