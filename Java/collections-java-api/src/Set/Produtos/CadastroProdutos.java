package Set.Produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import Set.Produtos.Produto.ComparatorPorPreco;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    // Criação de um TreeSet por nome, organizado
    public Set<Produto> exibirProdutoPorNome() {
        return new TreeSet<>(produtoSet);
    }

    // Método para exibir os produtos por preço, organizado
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

public class TesteCadastroProdutos {

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto(1, "Produto A", 10.0, 5);
        cadastro.adicionarProduto(2, "Produto B", 15.0, 3);
        cadastro.adicionarProduto(3, "Produto C", 7.5, 10);
        cadastro.adicionarProduto(4, "Produto D", 12.0, 7);

        System.out.println("Produtos ordenados por nome:");
        for (Produto p : cadastro.exibirProdutoPorNome()) {
            System.out.println(p);
        }

        System.out.println("\nProdutos ordenados por preço:");
        for (Produto p : cadastro.exibirProdutosPorPreco()) {
            System.out.println(p);
        }
    }
}

}

