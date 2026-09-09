package org.example.August_2026.Week3;
import org.example.August_2026.Week3.TripleR;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TripleRTest {
    @Test
    void checkIfTwoSameNumbers() {
        int input1 = 10;
        int input2 = 15;
        int input3 = 13;
        String expected = "No clear value!";
        String current = TripleR.luckAfterSameArguments(input1, input2, input3);
        assertEquals(expected, current);
    }

    @Test
    void checkIfTwoSameNumbers2() {
        int input1 = 15;
        int input2 = 15;
        int input3 = 13;
        String expected = "15";
        String current = TripleR.luckAfterSameArguments(input1, input2, input3);
        assertEquals(expected, current);
    }


    @Test
    void isPerpendicular() {
        int input1 = 3;
        int input2 = 4;
        int input3 = 5;
        boolean expected = true;
        boolean current = TripleR.isPerpendicular(input1, input2, input3);
        assertEquals(expected, current);
        }
    }

