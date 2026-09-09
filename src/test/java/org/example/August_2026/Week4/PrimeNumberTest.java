package org.example.August_2026.Week4;
import org.example.August_2026.Week4.PrimeNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberTest {
    @Test
    void testShouldBePrime7() {
        int input = 7;
        boolean expected = true;
        boolean current = PrimeNumber.checkIfIsPrimeNumber(input);
        assertEquals(expected, current);
    }

    @Test
    void isPrimeNumber13False() {
        int input = 15;
        boolean expected = false;
        boolean current = PrimeNumber.checkIfIsPrimeNumber(input);
        assertEquals(expected, current);
    }

    @Test
    void isPrimeNumber1() {
        int input = 1;
        boolean expected = false;
        boolean current = PrimeNumber.checkIfIsPrimeNumber(input);
        assertEquals(expected, current);
    }
}
