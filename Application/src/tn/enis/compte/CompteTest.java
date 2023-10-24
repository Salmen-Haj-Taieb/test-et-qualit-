package tn.enis.compte;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompteTest {
    Compte compte;
    @BeforeEach
    void setUp(){
        compte = new Compte("11122337",200);
    }
    @AfterEach
    void tearDown(){
        compte = null;
    }

    @Test
    void testGetCin(){
        assertEquals("11122337",compte.getCin());
    }
    @Test
    void testDeposer(){
        compte.deposer(100);
        assertEquals(300,compte.getSolde());
    }
    //les method de test ne changent pas l'objet initialle
    @Test
    void testRetirer(){
        compte.retirer(150);
        assertEquals(50,compte.getSolde());
    }
    //les method de test ne changent pas l'objet initialle
    //testGetSolde() returns le solde initialle : 200
    @Test
    void testGetSolde(){
        assertEquals(200,compte.getSolde());
    }
}
