package poo;

import java.util.ArrayList;
import java.util.List;

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
        int i = 0;
        String saida = "";
        for(Livro l : listagemDeLivros  ){
            saida += "\n --> Livro N° "+ (i++) + "\n";
            saida += l.toString() + "\n";

        }
    return saida;
    }
    //Pesquisar por genero
    public int pesquisar(String genero){
        int qtd = 0;
        for(Livro l: listagemDeLivros){
            if(l.getGenero().equalsIgnoreCase(genero)){
                qtd++;
            }

        }
        return qtd;
    }

}
