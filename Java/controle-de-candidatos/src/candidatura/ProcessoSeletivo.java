package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{
    public static void main(String[] args) {
        System.out.println("ALGORITMO DE PROCESSO SELETIVO");
        selecaoCandidatos();


        

    }


    static void imprirmirSelecionados(){

        String [] candidatosSelecionado = {};


        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento:");

        for (int indice =0; indice < candidatosSelecionado.length; indice++) {

            System.out.println("O candidado de número" + indice+1 +  "é" + candidatosSelecionado[indice]);

        }

        for (String candidato : candidatosSelecionado){
            System.out.println("O candidato selecionado foi" + candidato);

        }


    }


    static void selecaoCandidatos(){

        String [] candidatos = {"FELIPE",  "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.00;
        

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length  ) {
            String candidato = candidatos[candidatosAtual];
            double SalarioPretendido = valorPretendido(); // R$1925,00
            System.out.println(" O candidato(a) " + candidato + " solicitou esse valor de salário " + SalarioPretendido);

            if (salarioBase >= SalarioPretendido) {

                System.out.println(" O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados ++;

                
            }
            
            candidatosAtual ++; //fora do if, mas dentro do while

        }
    
    }

        static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
        
    }
    

    static void entrandoEmcontato(String candidato){
        int tentativasRealizadas =1;
        boolean atendeu = false;
        boolean continuartentando = true;

        do{

            atendeu = atender();
            continuartentando = !atendeu;

            if(continuartentando)
                tentativasRealizadas ++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuartentando && tentativasRealizadas <3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + "NA"+ tentativasRealizadas + "TENTATIVA");
        else
        System.out.println("NÃO CONSEGUIMOS CONTATO COM" + candidato + ", NÚMERO MÁXIMO TENTATIVAS " +  tentativasRealizadas);


    }

    static boolean atender(){

        return new Random().nextInt(3)==1;
    }

}
