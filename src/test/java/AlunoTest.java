import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarEstadoOrigemAluno(){
        Aluno aluno = new Aluno("Ana", new Escolaridade("Graduação"), "Mineira", new Cidade("Juiz de Fora",
                new Estado("Minas Gerais")));
        assertEquals("Minas Gerais", aluno.getCidade().getEstado().getNomeEstado());
    }

    @Test
    void deveRetornarEstadoEstudo(){
        Aluno aluno = new Aluno("Ana", new Escolaridade("Graduação"), "Mineira", new Cidade("Juiz de Fora",
                new Estado("Minas Gerais")));
        aluno.setCidadeEstudo(new Cidade("Rio de Janeiro", new Estado("Rio de Janeiro")));
        assertEquals("Minas Gerais", aluno.getCidade().getEstado().getNomeEstado());
    }

    @Test
    void deveRetornarCoordenadorCursoAluno(){
        Professor professor = new Professor();
        professor.setNome("Marco");

        Curso curso = new Curso("Engenharia Computacional", professor);
        curso.setCoordenador(professor);

        Aluno aluno = new Aluno("Ana", new Escolaridade("Graduação"), "Mineira", new Cidade("Juiz de Fora",
                new Estado("Minas Gerais")));
        aluno.setCurso(curso);

        assertEquals("Marco", aluno.getCurso().getCoordenador().getNome());
    }
}