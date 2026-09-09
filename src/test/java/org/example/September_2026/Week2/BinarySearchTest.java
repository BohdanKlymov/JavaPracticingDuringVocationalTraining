package org.example.September_2026.Week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    void Num30ShouldBeUnderIndex5 () {
        int[] arrayOfNums = {5, 10, 15, 20, 25, 30, 35, 40};
        int numToFind = 30;
        int expected = 5;
        int current = BinarySearch.findIndexOfNumberInArray(arrayOfNums,  numToFind);
        assertEquals(expected, current);
    }

    @Test
    void Num10ShouldBeUnderIndex1 () {
        int[] arrayOfNums = {5, 10, 15, 20, 25, 30, 35, 40};
        int numToFind = 10;
        int expected = 1;
        int current = BinarySearch.findIndexOfNumberInArray(arrayOfNums,  numToFind);
        assertEquals(expected, current);
    }
}
