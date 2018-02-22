package br.com.tcc.tcc;

import javax.faces.event.ActionEvent;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FormMBTest {

    public FormMBTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testValidarSucesso() {
        ActionEvent actionEvent = null;
        FormMB formMB = new FormMB();
        
        formMB.setNome("Teste");
        formMB.setEmail("teste@teste.com");
        formMB.setEndereco("Endereço");
        formMB.setTelefone("(99)99999-9999");
        
        formMB.validar(actionEvent);
        
        assertEquals(formMB.getMensagemValidacao(), "Cadastro realizado com sucesso!");
    }

    @Test
    public void testValidarFalha() {
        ActionEvent actionEvent = null;
        FormMB formMB = new FormMB();
        formMB.validar(actionEvent);
        
        assertEquals(formMB.getMensagemValidacao(), "Campos obrigatórios não informados.");
    }
}
