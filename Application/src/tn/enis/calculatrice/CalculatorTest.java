package tn.enis.calculatrice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    @DisplayName("Tester evaluate ")
    void testevaluate() {
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }

    @Test
    @DisplayName("Tester add ")
    public void add() {
        assertEquals(10, calculator.add(5, 5));
    }
    @Test
    @DisplayName("Tester add ")
    void multiply(){
        assertEquals(4,calculator.multiply(2,2));
    }
    @Test
    @DisplayName("Tester devide ")
    void devide() throws Exception {
        assertEquals(4,calculator.devide(8,2));
    }
    @Test
    @DisplayName("Tester devide by zero ")
    void devideByZero(){
        assertThrows(ArithmeticException.class,()->calculator.devide(5,0),"Devision par zero");
    }
    @Test
    @DisplayName("Tester devide by zero message ")
    void exceptionTesting(){
        Exception exception = assertThrows(ArithmeticException.class,()->calculator.devide(5,0));
        assertEquals("/ by zero",exception.getMessage());
    }
    @RepeatedTest(value = 10,name="repeat method")
    @DisplayName("a repeated test")
    void testAddRepeated(){
        assertEquals(11,calculator.add(5,6));
    }

}
