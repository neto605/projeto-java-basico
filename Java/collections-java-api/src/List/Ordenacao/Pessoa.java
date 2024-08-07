package List.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

private String nome;
private int idade;
private double altura;


public Pessoa(String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
}

// Getter para o campo nome
public String getNome() {
    return nome;
}

// Getter para o campo idade
public int getIdade() {
    return idade;
}

// Getter para o campo altura
public double getAltura() {
    return altura;
}

public String toString() {
    return "Pessoa{" +
            "nome='" + nome + '\'' +
            ", idade=" + idade +
            ", altura=" + altura +
            '}';
    
}

@Override
public int compareTo(Pessoa p) {


    return Integer.compare(idade, p.getIdade());
}



}

class ComparatorporAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

    

}