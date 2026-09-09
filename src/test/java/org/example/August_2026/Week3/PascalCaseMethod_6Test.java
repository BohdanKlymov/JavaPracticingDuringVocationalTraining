package org.example.August_2026.Week3;
import org.example.August_2026.Week3.PascalCaseMethod_6.Result;
import org.junit.jupiter.api.Test;

import static org.example.August_2026.Week3.PascalCaseMethod_6.Main.outputOfResult;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalCaseMethod_6Test {
    @Test
    void FindingTheBiggestSum() {
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int outputInt = 6;
        int[] output = {4, -1, 2, 1};
        Result expected = new Result(outputInt, output);;
        Result current = outputOfResult(input);
        assertEquals(expected, current);
    }

    @Test
    void FindingTheBiggestSum2() {
        int[] input = {6};
        int outputInt = 6;
        int[] output = {6};
        Result expected = new Result(outputInt, output);;
        Result current = outputOfResult(input);
        assertEquals(expected, current);
    }

    @Test
    void FindingTheBiggestSum3() {
        int[] input = {1, 2, 3};
        int outputInt = 6;
        int[] output = {1, 2, 3};
        Result expected = new Result(outputInt, output);;
        Result current = outputOfResult(input);
        assertEquals(expected, current);
    }
}
