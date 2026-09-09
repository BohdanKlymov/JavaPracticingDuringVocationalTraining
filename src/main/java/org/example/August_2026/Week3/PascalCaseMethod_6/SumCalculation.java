package org.example.August_2026.Week3.PascalCaseMethod_6;

import java.util.ArrayList;

public class SumCalculation {

    public static ArrayList ConvertIntoArrayList(int[]  numbers) {

        ArrayList resultWithIndexes = new ArrayList<>();

        for (int index = 0; index < numbers.length; index++) {

//            Array (number that was calculated, index of the first number in the actual row, amount of numbers used for calculation un row)
//            Saving single number bevor starting calculation because it can be the maximum sum of a contiguous subsequence in an array
            int[] numWithoutAnotherIndexes = new int[]{numbers[index], index, 0};
            resultWithIndexes.add(numWithoutAnotherIndexes);

            int sumOfDigitsInSequence = numbers[index];
            int score = 1;

            for (int numberOfIndexesAdded = index + 1; numberOfIndexesAdded < numbers.length; numberOfIndexesAdded++) {

                sumOfDigitsInSequence += numbers[numberOfIndexesAdded];

                int[] nums2 = new int[]{sumOfDigitsInSequence, index, score};

                resultWithIndexes.add(nums2);
                score++;
            }
        }

        return resultWithIndexes;
    }

    public static int[] FindMaxSum(ArrayList<int[]> sortedSums) {

        int[] max = new int[]{};
        int lastSum = sortedSums.get(0)[0];

        for (int[] sums : sortedSums) {
            if (sums[0] > lastSum) {
                max = sums;

                lastSum = sums[0];
            }
        }
        return max;
    }

    public static int[] CalculateOutput (int[] numbers, int[] max) {

        int[] numbersOfBiggestSum = new int[max[2] + 1];
        int startIndexOfSum = max[1];

        for (int index = 0; index < (max[2] + 1); index++) {
            numbersOfBiggestSum[index] = numbers[startIndexOfSum];
            startIndexOfSum++;
        }


        return numbersOfBiggestSum;
    }
}

