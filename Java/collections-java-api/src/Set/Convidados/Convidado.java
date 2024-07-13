package Set.Convidados;

import java.util.Objects;

public class Convidado {

    private String nome;
    private int codigoConvite;


    public Convidado (String nome, int codigoConvite){

        this.nome = nome;
        this.codigoConvite = codigoConvite;

    }

    public String getNome(){

       return nome;

    }

    
    public int getcodigoConvite(){

        return codigoConvite;
 
     }
 


 @Override 

 public boolean equals (Object o ){
    if (this == o ) return true;
    if(!(o instanceof Convidado convidado)) return false;
    return getcodigoConvite() == convidado.getcodigoConvite();
 }

 @Override
 public int hashCode(){
 return Objects.hash(getcodigoConvite());
 }


 //to string

 public String toString() {


    return "Convidado{" + "nome'" + nome + '\'' + ", codigoconvite= " + codigoConvite + '}';



 }




    
}
