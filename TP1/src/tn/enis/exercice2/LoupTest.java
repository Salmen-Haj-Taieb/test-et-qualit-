package tn.enis.exercice2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LoupTest {
    Loup loup;
    @BeforeEach
    void setUp() {
        loup = new Loup();
    }

    @AfterEach
    void tearDown() {
        loup = null;
    }

    @Test
    void testPositionInitialeAuNord(){
        assertEquals(Orientation.Nord,loup.getPosition());
    }

   @Test
    void TourneruneFois(){
       loup.tounrner();
       assertEquals(Orientation.Est,loup.getPosition());
       loup.tounrner();
       assertEquals(Orientation.Sud,loup.getPosition());
       loup.tounrner();
       assertEquals(Orientation.Ouest,loup.getPosition());
       loup.tounrner();
       assertEquals(Orientation.Nord,loup.getPosition());
    }
}