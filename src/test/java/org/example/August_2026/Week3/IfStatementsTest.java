package org.example.August_2026.Week3;

import org.example.August_2026.Week3.IfStatements;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IfStatementsTest {
    @Test
    void isX50() {
        int input = 50;
        boolean expected = true;
        boolean current = IfStatements.is50(input);
        assertEquals(expected, current);
    }
    @Test
    void isX502() {
        int input = 30;
        boolean expected = false;
        boolean current = IfStatements.is50(input);
        assertEquals(expected, current);
    }

    @Test
    void isOddNumber() {
        int input = 0;
        boolean expected = false;
        boolean current = IfStatements.oodNumber(input);
        assertEquals(expected, current);
    }
    @Test
    void isMultipleOf11() {
        int input = 11;
        boolean expected = true;
        boolean current = IfStatements.multipleOf11(input);
        assertEquals(expected, current);
    }

    @Test
    void isBetween90And100() {
        int input = 94;
        boolean expected = true;
        boolean current = IfStatements.interalFrom90And100(input);
        assertEquals(expected, current);
    }

}
