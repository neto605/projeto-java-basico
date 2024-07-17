package domain;
import java.time.LocalDate;


public class Mentorias extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    // Getters

    public LocalDate getData() {
        return data;
    }

    // Setters
    public void setData(LocalDate data) {
        this.data = data;
    }

    // toString
    @Override
    public String toString() {
        return "Classe{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

   
}
