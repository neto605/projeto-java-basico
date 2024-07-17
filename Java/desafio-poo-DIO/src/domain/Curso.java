package domain;

public class Curso extends Conteudo{

    private int cargaHoraria;
    public String setDescricao;

    
    @Override
    public double calcularXP() {
        
        return XP_PADRAO * cargaHoraria;
    }

    // Getter

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    // Setters

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // toString
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao()+ '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
