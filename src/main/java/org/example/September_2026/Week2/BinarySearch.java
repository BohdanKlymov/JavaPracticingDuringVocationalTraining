package org.example.September_2026.Week2;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

//    Aufgabe: Bestimme in einen der größte sortierten Array mit Zahlen ohne doppelte Zahlen den Index einer gesuchten Zahl:
//    Sprich für das array [1,2,3,4] ist der Index der Zahl 2 die 1 für [1,5,10,20] ist der Index der Zahl 10 die 2.

    public static int findIndexOfNumberInArray(int[] numsArray,  int numToFind) {
        return findIndexOfNumberInArray (numsArray, 0, numsArray.length, numToFind);
    }

    private static int findIndexOfNumberInArray(int[] numsArray, int startIndex, int endIndex, int numToFind) {

        int index = (int) (((long) startIndex + endIndex) / 2);

        if (numsArray[index] == numToFind) {
            return index;
        }

        if (numsArray[index] < numToFind) {

            startIndex = index;

            return findIndexOfNumberInArray(numsArray, startIndex, endIndex, numToFind);
        } else {

            endIndex = index;

            return findIndexOfNumberInArray(numsArray, startIndex, endIndex, numToFind);
        }

    }
}