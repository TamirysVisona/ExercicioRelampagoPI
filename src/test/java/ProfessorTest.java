import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarEscolaridade(){
        Professor professor = new Professor();
        professor.setNivelTecnico(new Escolaridade("Pós graduação"));
        assertEquals("Pós graduação", professor.getNivelTecnico().getEscolaridade());
    }

    @Test
    void deveRetornarErro(){
        Professor professor = new Professor();
        try {
            professor.setNivelTecnico(new Escolaridade(null));
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Escolaridade invalida!", e.getMessage());
        }

    }

    @Test
    void deveRetornarCidadeOrigem(){
        Professor professor = new Professor();
        professor.setCidade(new Cidade("Juiz de Fora", new Estado("Minas Gerais")));
        assertEquals("Juiz de Fora", professor.getCidade().getNomeCidade());
    }

    @Test
    void deveRetornarFuncaoEF(){
        Professor professor = new Professor();
        professor.setContratacao(1);
        assertEquals("Ensino Fundamental", professor.getContratacao());
    }

    @Test
    void deveRetornarFuncaoEM(){
        Professor professor = new Professor();
        professor.setContratacao(2);
        assertEquals("Ensino Medio", professor.getContratacao());
    }

    @Test
    void deveRetornarFuncaoES(){
        Professor professor = new Professor();
        professor.setContratacao(3);
        assertEquals("Ensino Superior", professor.getContratacao());
    }

    @Test
    void deveRetornarFuncaoErro(){
        Professor professor = new Professor();
        try{
            professor.setContratacao(0);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Funcao invalida!", e.getMessage());
        }
    }

    @Test
    void deveRetornarDiretor(){
        Professor professorDiretor = new Professor();
        professorDiretor.setNome("Ana");
        Escola escola = new Escola(professorDiretor);

        Professor professor = new Professor();
        professor.setEscola(escola);

        assertEquals("Ana", professor.getEscola().getDiretor().getNome());
    }

    @Test
    void deveRetornarCoordenador(){
        Professor professorCoordenador = new Professor();
        professorCoordenador.setNome("Ruy");

        Curso curso = new Curso("Engenharia Computacional", professorCoordenador);

        Professor professor = new Professor();
        professor.setCurso(curso);

        assertEquals("Ruy", professor.getCurso().getCoordenador().getNome());
    }

}