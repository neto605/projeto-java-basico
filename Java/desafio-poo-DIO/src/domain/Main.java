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

       // System.out.println(curso1);
        //System.out.println(curso2);

        Mentorias mentoria = new Mentorias();

        mentoria.setTitulo("Mentoria para pessoas burras");
        mentoria.setDescricao("Isso é uma mentoria");
        mentoria.setData(LocalDate.now());

        //System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos incritos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("Conteudos incritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("XP" + devCamila.calcularTotalXP());

        System.out.println("------");


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos incritos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("Conteudos incritos João" + devJoao.getConteudosInscritos());
        System.out.println("XP" + devJoao.calcularTotalXP());





        





    


        

    }
  
    
}
