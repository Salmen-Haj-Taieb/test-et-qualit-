package tn.enis.exercice3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    PasswordValidator passwordValidator;
    @BeforeEach
    void setUp() {
        passwordValidator = new PasswordValidator();
    }

    @AfterEach
    void tearDown() {
        passwordValidator = null;
    }

    @ParameterizedTest
    @CsvSource({"123,false","123456,true","12345678,true","1234567890,true",
            "12345678901,false"})
    void testPasswordLenght(String password,boolean ExpectedVerification){
        assertEquals(ExpectedVerification,passwordValidator.validatePassword(password));
    }

    @ParameterizedTest
    @CsvSource({"123456,true","s12abcd,true","abcdefg,false"})
    void testExistDigit(String password,boolean ExpectedVerification){
        assertEquals(ExpectedVerification,passwordValidator.validatePassword(password));
    }

    @ParameterizedTest
    @CsvSource({"Q123456,true","1234gfde7,false","QWERTYUj1,true"})
    void testExistMajuscule(String password,boolean ExpectedVerification){
        assertEquals(ExpectedVerification,passwordValidator.validatePassword(password));
    }

}