package domain;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        //iniciando um curso 
        Curso curso1 = new Curso();
        curso1.setTitulo("Bosque de Maribor");
        curso1.setDescricao("Acelera a regeneração de Pontos de Adrenalina. 0.15 pontos por 30 segundos.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Poção trovoada melhorada");
        curso2.setDescricao("Aumenta o poder de ataque em 30% por 60 segundos.");
        curso2.setCargaHoraria(8);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentorias mentoria = new Mentorias();

        mentoria.setTitulo("Mentoria para pessoas burras");
        mentoria.setDescricao("Isso é uma mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

    


        

    }
  
    
}
