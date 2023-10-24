package tn.enis.leap_year;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
    LeapYear leapYear;
    @BeforeEach
    void setUp() {
        leapYear = new LeapYear();
    }

    @AfterEach
    void tearDown() {
        leapYear = null;
    }

    @Test
    @DisplayName("Tester isLeapyear ")
    void isLeapyear(){
        assertTrue(leapYear.isLeapyear(2000));
        assertFalse(leapYear.isLeapyear(2001));
        assertFalse(leapYear.isLeapyear(1900));
        assertTrue(leapYear.isLeapyear(2020));
    }
    @ParameterizedTest
    @CsvSource({"2000,true","2020,true","1991,false","1900,false"})
    void isLeapyear(int year , boolean oracle){
        assertEquals(oracle,leapYear.isLeapyear(year));
    }
}