/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.tcc;

import javax.faces.event.ActionEvent;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author accurate
 */
public class FormMBTest {
    
    public FormMBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of validar method, of class FormMB.
     */
    @Test
    public void testValidar() {
        System.out.println("validar");
        ActionEvent actionEvent = null;
        FormMB instance = new FormMB();
        instance.validar(actionEvent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class FormMB.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        FormMB instance = new FormMB();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class FormMB.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        FormMB instance = new FormMB();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class FormMB.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        FormMB instance = new FormMB();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class FormMB.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        FormMB instance = new FormMB();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class FormMB.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        FormMB instance = new FormMB();
        String expResult = "";
        String result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class FormMB.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String endereco = "";
        FormMB instance = new FormMB();
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone method, of class FormMB.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        FormMB instance = new FormMB();
        String expResult = "";
        String result = instance.getTelefone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone method, of class FormMB.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String telefone = "";
        FormMB instance = new FormMB();
        instance.setTelefone(telefone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensagemValidacao method, of class FormMB.
     */
    @Test
    public void testGetMensagemValidacao() {
        System.out.println("getMensagemValidacao");
        FormMB instance = new FormMB();
        String expResult = "";
        String result = instance.getMensagemValidacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMensagemValidacao method, of class FormMB.
     */
    @Test
    public void testSetMensagemValidacao() {
        System.out.println("setMensagemValidacao");
        String mensagemValidacao = "";
        FormMB instance = new FormMB();
        instance.setMensagemValidacao(mensagemValidacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
