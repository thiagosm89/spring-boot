package packages.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PessoaInsertionDTOTest {

    @Test
    public void testeIgualdadeEntidade(){
        PessoaInsertionDTO pessoaInsertionDTO = new PessoaInsertionDTO();
        pessoaInsertionDTO.setNome("a");

        PessoaInsertionDTO pessoaInsertionDTO1 = new PessoaInsertionDTO();
        pessoaInsertionDTO1.setNome("a");

        assertEquals(true, pessoaInsertionDTO.equals(pessoaInsertionDTO1));
    }
}