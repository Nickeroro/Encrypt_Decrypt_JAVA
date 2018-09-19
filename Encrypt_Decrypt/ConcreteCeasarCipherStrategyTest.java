package Encrypt_Decrypt;

//Methodes de tests, --> ConcreteCeasarCipherStrategy --> Alt+Entrée --> Create Test

import static org.junit.jupiter.api.Assertions.*;

class ConcreteCeasarCipherStrategyTest {

    ConcreteCeasarCipherStrategy c;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.c = new ConcreteCeasarCipherStrategy(2);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void encipher() {
        assertEquals("cdefg", this.c.encipher("abcde"));
    }

    @org.junit.jupiter.api.Test
    void decipher() {
    }

}

