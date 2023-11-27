import java.lang.String;
public class Professor extends Pessoa {

    private Escola escola;
    private String contratacao;

    private Curso curso;

    public String getContratacao() {
        return this.contratacao;
    }

    public Escola getEscola() {
        return this.escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setContratacao(int contratacao) {
        switch (contratacao){
            case 1:
                this.contratacao = "Ensino Fundamental";
                break;
            case 2:
                this.contratacao = "Ensino Medio";
                break;
            case 3:
                this.contratacao = "Ensino Superior";
                break;
            default:
                throw new IllegalArgumentException("Funcao invalida!");
        }
    }
}
