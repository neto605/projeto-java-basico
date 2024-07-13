package Map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() { 
        
        this.eventosMap = new HashMap<>();
    
    }


    public void adicionarEvento(LocalDate data, String nome, String atracao){

        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);

    }

    public void exibirAgenda(){

        Map<LocalDate, Evento> eventosMap = new TreeMap<>();

    }

    public static void main(String[] args) {
        
        AgendaEventos agendaEventos = new AgendaEventos();

    }
    
}
