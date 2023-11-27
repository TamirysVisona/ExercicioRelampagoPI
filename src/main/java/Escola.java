import java.lang.String;
public class Escola {

    private Professor diretor;

    public Escola (Professor diretor){
        this.diretor = diretor;
    }
    public Professor getDiretor() {
        return this.diretor;
    }

    public void setDiretor(Professor diretor) {
        this.diretor = diretor;
    }

    public String getEscolaridadeCoordenador(){
        return diretor.getNivelTecnico().getEscolaridade();
    }
}
