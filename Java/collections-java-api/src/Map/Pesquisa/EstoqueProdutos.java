package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributos

    private Map<Long, Produto> estoqueprodutosMap;

    public EstoqueProdutos(){

        this.estoqueprodutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){

        estoqueprodutosMap.put(cod, new Produto(nome, preco, quantidade));

    }

    public void exibirProdutos(){

        System.out.println(estoqueprodutosMap);


    }


    public double  calcularValorTotalEstoque() {

      double valortotaldoestoque = 0d;


    if (!estoqueprodutosMap.isEmpty()){

        for (Produto p : estoqueprodutosMap.values()){

            valortotaldoestoque += p.getQuantidade() * p.getPreco();

        }
    }

    return valortotaldoestoque;

    }


    public Produto obterProdutoMaisCaro(){

        Produto produtoMaisCaro = null;
        double maiorpreco = Double.MIN_VALUE;

        if (!estoqueprodutosMap.isEmpty()){
        for(Produto p: estoqueprodutosMap.values()){

            if(p.getPreco() > maiorpreco){

            produtoMaisCaro = p;

         }

      }
    }
    return produtoMaisCaro;

    }



    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, " Produto A ", 10, 5.0);
       // estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
       // estoque.adicionarProduto(3L, "Produto C", 2, 15.0);

        estoque.exibirProdutos();
        // System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        // System.out.println("Produto mais  barato: " + estoque.obterProdutoMaisCaro());

    }

    
}
