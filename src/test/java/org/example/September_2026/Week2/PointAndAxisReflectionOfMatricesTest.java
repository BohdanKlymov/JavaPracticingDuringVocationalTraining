package org.example.September_2026.Week2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PointAndAxisReflectionOfMatricesTest {

    public static int[][] inputVariable () {

        return new int[][] {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };
    }

    @Test
    void ArrangeNumsHorizontallyFromLargestToSmallest() {
        int[][] input = inputVariable();
        int[][] expected = {
                {11, 21, 31, 41},
                {12, 22, 32, 42},
                {13, 23, 33, 43},
                {14, 24, 34, 44}
        };
        int[][] current = PointAndAxisReflectionOfMatrices.exchangingAnArrayFromTopLeftToBottomRight(input);
        assertTrue(Arrays.deepEquals(expected, current));
    }

}
