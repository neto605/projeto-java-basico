package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {


    private List<Pessoa> pessoalist;
    
    
    public OrdenacaoPessoa(){

        this.pessoalist = new ArrayList<>();

    }


    public void AdicionarPessoa(String nome, int idade, double altura){

        pessoalist.add(new Pessoa(nome, idade, altura));


    }
    public List<Pessoa> ordenarPorIdade(){
        
        List<Pessoa> pessoasporidade = new ArrayList<>(pessoalist); 

        Collections.sort(pessoasporidade);
        return pessoasporidade;


    }
    
    public List<Pessoa> odernarPorAltura(){

        List<Pessoa> pessoasporaltura = new ArrayList<>(pessoalist);
        Collections.sort(pessoasporaltura, new ComparatorporAltura());

        return pessoasporaltura;

    }


}
