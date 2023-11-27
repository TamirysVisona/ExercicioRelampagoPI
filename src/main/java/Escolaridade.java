import java.lang.String;
public class Escolaridade {
    private String escolaridade;

    public Escolaridade(String escolaridade){
        this.setEscolaridade(escolaridade);
    }
    public String getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        if(escolaridade == null){
            throw new IllegalArgumentException("Escolaridade invalida!");
        }

        this.escolaridade = escolaridade;
    }
}
