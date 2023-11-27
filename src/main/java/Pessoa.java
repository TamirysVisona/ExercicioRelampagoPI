import java.lang.String;
public class Pessoa {

    private String nome, naturalidade;
    private Escolaridade nivelTecnico;
    private Cidade cidade;
    private Cidade cidadeEstudo;

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public Escolaridade getNivelTecnico() {
        return this.nivelTecnico;
    }

    public void setNivelTecnico(Escolaridade nivelTecnico) {
        this.nivelTecnico = nivelTecnico;
    }

    public void setNaturalidade(String naturalidade){
        this.naturalidade = naturalidade;
    }

    public String getNaturalidade(){
        return this.naturalidade;
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Cidade getCidadeEstudo() {
        return this.cidadeEstudo;
    }

    public void setCidadeEstudo(Cidade cidadeEstudo) {
        this.cidadeEstudo = cidadeEstudo;
    }
}
