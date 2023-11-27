import java.lang.String;
public class Aluno extends Pessoa{

    private Curso curso;
    public Aluno(String nome, Escolaridade escolaridade, String nacionalidade, Cidade cidade){
        setNome(nome);
        setNivelTecnico(escolaridade);
        setNaturalidade(nacionalidade);
        setCidade(cidade);
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
