package Map.OpercoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //atributo;

    private Map<String, Integer> agendacontatomap;



    public AgendaContatos(){

        this.agendacontatomap = new HashMap<>();

    }

    public void AdicionarContato(String nome, Integer telefone){
        agendacontatomap.put(nome, telefone);
    }


    //não precisa percorrrer os dados com uma "for" pois o Map já contém os valores.

    public void RemoverContato(String nome){

        if(agendacontatomap.isEmpty()){
            agendacontatomap.remove(nome);


        }

    }

    public void exibirContatos(){

        System.out.println(agendacontatomap);

    }


    public Integer pesquisarPornome(String nome){

        Integer numeroPorNome = null;

        if(!agendacontatomap.isEmpty()){

           numeroPorNome =  agendacontatomap.get(nome);

        }

        return numeroPorNome;

    }
    
    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.AdicionarContato("Camila", 123456);
        agendaContatos.AdicionarContato("Camila", 5656);
        agendaContatos.AdicionarContato("Camila Cavalcante", 111111);
        agendaContatos.AdicionarContato("Camila DIO", 654987);
        agendaContatos.AdicionarContato("Maria Silva", 111111);
        agendaContatos.AdicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        //agendaContatos.RemoverContato("Maria Silva");
       // agendaContatos.exibirContatos();

       //System.out.println("O numero é " + agendaContato.pesquisarPornome("Camila DIO"));


    }

}
