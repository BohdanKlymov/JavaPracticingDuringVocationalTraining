package org.example.September_2026.Week2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PointAndAxisReflectionOfMatricesTest {

    public static int[][] inputVariable4x4() {

        return new int[][] {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };
    }

    public static int[][] inputVariable5x5() {

        return new int[][] {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55}
        };
    }

    @Test
    void ArrangeNumsFromTopLeftToBottomRight() {
        int[][] input = inputVariable4x4();
        int[][] expected = {
                {11, 21, 31, 41},
                {12, 22, 32, 42},
                {13, 23, 33, 43},
                {14, 24, 34, 44}
        };
        int[][] current = PointAndAxisReflectionOfMatrices.exchangingAnArrayFromTopLeftToBottomRight(input);

//        System.out.println(Arrays.deepToString(current));

        assertTrue(Arrays.deepEquals(expected, current));
    }

    @Test
    void ArrangeNumsFromTopLeftToBottomRight5x5() {
        int[][] input = inputVariable5x5();
        int[][] expected = {
                {11, 21, 31, 41, 51},
                {12, 22, 32, 42, 52},
                {13, 23, 33, 43, 53},
                {14, 24, 34, 44, 54},
                {15, 25, 35, 45, 55}
        };
        int[][] current = PointAndAxisReflectionOfMatrices.exchangingAnArrayFromTopLeftToBottomRight(input);

//        System.out.println(Arrays.deepToString(current));

        assertTrue(Arrays.deepEquals(expected, current));
    }

    @Test
    void ArrangeNumsFromTopRightToBottomLeft() {
        int[][] input = inputVariable4x4();
        int[][] expected = {
                {44, 34, 24, 14},
                {43, 33, 23, 13},
                {42, 32, 22, 12},
                {41, 31, 21, 11}
        };
        int[][] current = PointAndAxisReflectionOfMatrices.exchangingAnArrayFromTopRightToBottomLeft(input);

//        System.out.println(Arrays.deepToString(current));

        assertTrue(Arrays.deepEquals(expected, current));
    }

    @Test
    void ArrangeNumsFromTopRightToBottomLeft5x5() {
        int[][] input = inputVariable5x5();
        int[][] expected = {
                {55, 45, 35, 25, 15},
                {54, 44, 34, 24, 14},
                {53, 43, 33, 23, 13},
                {52, 42, 32, 22, 12},
                {51, 41, 31, 21, 11}
        };
        int[][] current = PointAndAxisReflectionOfMatrices.exchangingAnArrayFromTopRightToBottomLeft(input);

//        System.out.println(Arrays.deepToString(current));

        assertTrue(Arrays.deepEquals(expected, current));
    }

    @Test
    void ArrangeNumsAcrossItsCenter() {
        int[][] input = inputVariable4x4();
        int[][] expected = {
                {44, 43, 42, 41},
                {34, 33, 32, 31},
                {24, 23, 22, 21},
                {14, 13, 12, 11}
        };
        int[][] current = PointAndAxisReflectionOfMatrices.exchangingAnArrayAcrossItsCenter(input);

//        System.out.println(Arrays.deepToString(current));

        assertTrue(Arrays.deepEquals(expected, current));
    }

    @Test
    void ArrangeNumsAcrossItsCenter5x5() {
        int[][] input = inputVariable5x5();
        int[][] expected = {
                {55, 54, 53, 52, 51},
                {45, 44, 43, 42, 41},
                {35, 34, 33, 32, 31},
                {25, 24, 23, 22, 21},
                {15, 14, 13, 12, 11}
        };
        int[][] current = PointAndAxisReflectionOfMatrices.exchangingAnArrayAcrossItsCenter(input);

//        System.out.println(Arrays.deepToString(current));

        assertTrue(Arrays.deepEquals(expected, current));
    }

}
