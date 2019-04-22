package poo;

public class Livro {
    //Atributos
    private String titulo;
    private String autor;
    private String genero;
    private int isbn;
    private float preco;
    //Métodos

    public Livro(){ }
    public Livro(String titulo, String autor, String genero, int isbn, float preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.isbn = isbn;
        this.preco = preco;
    }
}
