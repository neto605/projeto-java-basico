package Set.Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {


//atributo
private Set<Convidado> convidadoSet;


// construtor
public ConjuntoConvidados(){

    this.convidadoSet = new HashSet<>();
}


public void adicionarConvidado(String nome, int codigoConvite){

convidadoSet.add(new Convidado(nome, codigoConvite));

}


public void removerConvidadoPorCodigoDoCOnvite(int i){

Convidado convidadospararemover = null;

for(Convidado c : convidadoSet){

    if(c.getcodigoConvite() == i){

        convidadospararemover = c;
        break;

    }
}

convidadoSet.remove(convidadospararemover);
    
}

public int contarConvidados(){

    return convidadoSet.size();

}

public void exibirConvidados(){

    System.out.println(convidadoSet);

}


public static void main(String[] args){

    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();


    conjuntoConvidados.adicionarConvidado("Convidado 1 ", 1234);
    conjuntoConvidados.adicionarConvidado("Convidado 2 ", 1235);
    conjuntoConvidados.adicionarConvidado("Convidado 3 ", 1235);
    conjuntoConvidados.adicionarConvidado("Convidado 4 ", 1236);

    conjuntoConvidados.exibirConvidados();

    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

    conjuntoConvidados.removerConvidadoPorCodigoDoCOnvite(1234);

    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

}




}
    

