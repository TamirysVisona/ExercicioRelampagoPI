import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarEscolaridadeCoordenador(){

        Professor professor = new Professor();
        professor.setNivelTecnico(new Escolaridade("Pós graduação"));
        Curso curso = new Curso("Engenharia Computacional", professor);
        assertEquals("Pós graduação", curso.getEscolaridadeCoordenador());
    }

}