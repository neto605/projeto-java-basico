package List.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {


private List<Tarefa> tarefaList;
 //atributo

public ListaTarefa() {

    this.tarefaList = new ArrayList<>();

}

public void adicionarTarefa (String descricao){
    tarefaList.add(new Tarefa(descricao));

}

public void removerTarefa (String descricao){
    List<Tarefa> tarefaspararemover = new ArrayList<>();
    for (Tarefa t : tarefaList) {
        if(t.getDescricao().equalsIgnoreCase(descricao)){
            tarefaspararemover.add(t);
        }

    }
    tarefaList.removeAll(tarefaspararemover);
}

public int obteNumeroTotalTarefas(){
    return tarefaList.size();

}

public void obterDescricoesTarefas() {

    System.out.println(tarefaList);

}

public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();

    System.out.println("O número toral de elementos na lista e: "  +  listaTarefa.obteNumeroTotalTarefas());

    listaTarefa.adicionarTarefa( "Tarefa 1");
    listaTarefa.adicionarTarefa( "Tarefa 2");
    listaTarefa.adicionarTarefa( "Tarefa 3");

    listaTarefa.removerTarefa("Tarefa 1");
    System.out.println("O número toral de elementos na lista e: "  +  listaTarefa.obteNumeroTotalTarefas());

    listaTarefa.obterDescricoesTarefas();

}

}
