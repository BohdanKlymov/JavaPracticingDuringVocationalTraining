package org.example.August_2026.Week4;

import org.example.August_2026.Week4.LongestPalindrome;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeTest {

    @ParameterizedTest
    @CsvSource({"The lil Ganster, lil", "banana, anana"})
    void checksumTest(String input, String expected) {
        String current = LongestPalindrome.findLongestPalindrome(input);
        assertEquals(expected, current);
    }

    @Test
    void testInputTestWithOutputEmpty() {
        String input = "test";
        String expected = "";
        String actual = LongestPalindrome.findLongestPalindrome(input);
        assertEquals(expected, actual);
    }
}
