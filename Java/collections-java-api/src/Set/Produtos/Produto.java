package Set.Produtos;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {

    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método para poder consultar produtos em ordem alfabética
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome; // Corrigido o getter para retornar o nome corretamente
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    // Comparator para ordenar por preço
    public static class ComparatorPorPreco implements Comparator<Produto> {
        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }
}
