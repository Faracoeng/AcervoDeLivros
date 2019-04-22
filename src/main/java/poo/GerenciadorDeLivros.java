package poo;

import java.util.ArrayList;

public class GerenciadorDeLivros {

    //Atributos
    private static ArrayList<Livro> listagemDeLivros = new ArrayList<>();

    //Métodos
    public GerenciadorDeLivros(){
        this.listagemDeLivros = new ArrayList<>();
    }

    //Retornar a lista
    public static ArrayList<Livro> retornaLista(){
        return listagemDeLivros;
    }
    // Adicionar um objeto livro na lista
    public void add(Livro book){
        listagemDeLivros.add(book);
    }
    //lista os dados de todos os livros
    public String listar(){
        String saida = "";
        for(Livro l : listagemDeLivros  ){

        }
    return saida;
    }

}
