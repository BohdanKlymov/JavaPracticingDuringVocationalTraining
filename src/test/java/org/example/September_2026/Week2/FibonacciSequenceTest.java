package org.example.September_2026.Week2;

import org.example.August_2026.Week4.LongestPalindrome;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciSequenceTest {

    @ParameterizedTest
    @CsvSource({"10, 55", "3, 2", "2, 1", "30, 832040"})
    void FibonacciSequenceWithLoop(int inputOfCountNumber, int expected) {
        int current = FibonacciSequence.FibonacciSequenceWithLoop(inputOfCountNumber);
        assertEquals(expected, current);
    }

    @ParameterizedTest
    @CsvSource({"10, 1, 1, 55", "3, 1, 1, 2", "2, 1, 1, 1", "30, 1, 1, 832040"})
    void FibonacciSequenceWithRecursiveCall(int input, int firstNumber, int secondNumber, int expected) {
        int current = FibonacciSequence.FibonacciSequenceWithRecursiveCall(input, firstNumber, secondNumber);
        assertEquals(expected, current);
    }

    @ParameterizedTest
    @CsvSource({"10, 55", "3, 2", "2, 1", "30, 832040"})
    void FibonacciSequenceWithRecursiveCall2(int input,  int expected) {
        int current = FibonacciSequence.FibonacciSequenceWithRecursiveCall2(input);
        assertEquals(expected, current);
    }

}
