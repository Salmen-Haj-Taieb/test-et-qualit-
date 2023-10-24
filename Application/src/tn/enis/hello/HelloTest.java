package tn.enis.hello;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {
    Hello h;
    @BeforeEach
    void setUp() {
        System.out.println("set up");
        h = new Hello();
    }

    @AfterEach
    void tearDown() {
        System.out.println("tear down");
        h=null;
    }

    @Test
    void getMessage() {
        assertEquals("Hello Salmen",h.getMessage("Salmen"));
    }
}