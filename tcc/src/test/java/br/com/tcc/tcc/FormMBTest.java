package br.com.tcc.tcc;

import org.junit.Test;
import static org.junit.Assert.*;

public class FormMBTest {

    public FormMBTest() {
    }

    @Test
    public void testValidarSucesso() {
        FormMB formMB = new FormMB();

        formMB.setNome("Teste");
        formMB.setEmail("teste@teste.com");
        formMB.setEndereco("Endereço");
        formMB.setTelefone("(99)99999-9999");

        formMB.validar();

        assertEquals(formMB.getMensagemValidacao(), "Cadastro realizado com sucesso!");
    }

    @Test
    public void testValidarFalha() {
        FormMB formMB = new FormMB();

        formMB.validar();

        assertEquals(formMB.getMensagemValidacao(), "Campos obrigatórios não informados.");
    }
}
