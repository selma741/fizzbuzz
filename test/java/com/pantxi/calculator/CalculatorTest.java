package com.pantxi.calculator;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*; // Import des assertions JUnit
import org.junit.jupiter.api.Test;               // Import des annotations JUnit
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    // Méthode pour additionner deux nombres
    public int add(int opG, int opD) {
        return opG + opD;
    }

    // Méthode pour diviser deux nombres
    public int divide(int opG, int opD) {
        if (opD == 0) { // Vérifie si le diviseur est zéro
            throw new ArithmeticException("Impossible de diviser par zéro.");
        }
        return opG / opD;
    }

    @Test
        public void testAdd() {
            CalculatorTest calc = new CalculatorTest();

            // Test 1 : Addition normale
            assertEquals(5, calc.add(2, 3), "2 + 3 doit être égal à 5");

            // Test 2 : Addition avec zéro
            assertEquals(0, calc.add(0, 0), "0 + 0 doit être égal à 0");

            // Test 3 : Addition de nombres négatifs
            assertEquals(-3, calc.add(-1, -2), "-1 + -2 doit être égal à -3");
        }

    @Test
    public void testDivide() {
        CalculatorTest calc = new CalculatorTest();

        // Test 1 : Division normale
        assertEquals(2, calc.divide(6, 3), "6 / 3 doit être égal à 2");

        // Test 2 : Division par zéro (doit lever une exception)
        assertThrows(ArithmeticException.class, () -> calc.divide(1, 0), "Division par zéro doit lever une exception");

        // Test 3 : Division de zéro
        assertEquals(0, calc.divide(0, 3), "0 / 3 doit être égal à 0");
    }
}
