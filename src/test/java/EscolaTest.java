import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarEscolaridadeDiretor(){
        Professor professor = new Professor();
        professor.setNivelTecnico(new Escolaridade("Pos graduação"));
        Escola escola = new Escola(new Professor());
        escola.setDiretor(professor);
        assertEquals("Pos graduação", escola.getEscolaridadeCoordenador());
    }

}