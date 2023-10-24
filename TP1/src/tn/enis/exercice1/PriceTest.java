package tn.enis.exercice1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceTest {
    Price price;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        price = new Price();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        price = null;
    }

    @Test
    void testgetTTCprice(){
        assertEquals(119f,price.getTTCprice(100f));
    }
}