import java.lang.String;
public class Curso {
    private String nomeCurso;
    private Professor coordenador;

    public Curso (String nomeCurso, Professor coordenador){
        this.nomeCurso = nomeCurso;
        this.coordenador = coordenador;
    }
    public Professor getCoordenador() {
        return this.coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public String getEscolaridadeCoordenador(){
        return coordenador.getNivelTecnico().getEscolaridade();
    }
}
