package Map.Pesquisa;

public class Produto {

    //atributos

    private String nome;
    private Double preco;
    private int quantidade;

    public Produto(String nome, Double preco, int quantidade){

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }


    public String getnome(){

        return nome;
    }


    public Double getPreco(){

        return preco;

    }

    public int getQuantidade(){

        return quantidade;
    }


    public String toString(){

        return nome + preco + quantidade;

    }
    
}
