package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List <Livro> livroList;

    
public CatalogoLivros() { 
    
    this.livroList = new ArrayList<>();

}

public void adicionarLivro(String titulo,  String autor, int anoPublicacao){

 livroList.add(new Livro(titulo, autor, anoPublicacao));

}

public List<Livro> pesquisarPorAutor (String autor){

List <Livro> livrosPorAutor = new ArrayList<>();        
    if(!livroList.isEmpty()){

        for(Livro l : livroList){

                if(l.getAutor().equalsIgnoreCase(autor)){

                    livrosPorAutor.add(l);
                }

        }

    }
    return livrosPorAutor;
}

public List<Livro> pesquisaporIntervaloAnos (int anoIncial, int anoFinal ){

    List<Livro> livrosporIntervaloano = new ArrayList<>();

    if(!livroList.isEmpty()){

        for(Livro l : livroList){

                if(l.getAnoPublicacao() >= anoIncial && l.getAnoPublicacao() <= anoFinal){

                    livrosporIntervaloano.add(l);
                
                }

        }

    }
    return livrosporIntervaloano;



}



public Livro pesquisarporTitulo(String titulo) {

    Livro livroPorTitulo  = null;

    if(!livroList.isEmpty()){

        for(Livro l : livroList){

            if (l.getTitulo().equalsIgnoreCase(titulo)){

                 livroPorTitulo =l;

                    break;
            }


        }


    }
    return livroPorTitulo;

}

public static void main(String[] args){
    CatalogoLivros catalogoLivros = new CatalogoLivros();

    catalogoLivros.adicionarLivro( "Livro 1", "Autor 1", 2020);
    catalogoLivros.adicionarLivro( "Livro 2", "Autor 2", 2021);
    catalogoLivros.adicionarLivro( "Livro 3", "Autor 3", 2022);
    catalogoLivros.adicionarLivro( "Livro 4", "Autor 4", 2023);
    catalogoLivros.adicionarLivro( "Livro 5", "Autor 5", 2024);


    System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
}

}


