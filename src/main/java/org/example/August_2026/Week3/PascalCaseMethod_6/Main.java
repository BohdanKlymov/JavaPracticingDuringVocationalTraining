package org.example.August_2026.Week3.PascalCaseMethod_6;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main() {

//        The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:

        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        if (numbers.length == 0) {
            return;
        }

        System.out.println(outputOfResult(numbers));

    }

    public static Result outputOfResult(int[] numbers) {
        ArrayList sortedSums = new ArrayList<int[]>(SumCalculation.ConvertIntoArrayList(numbers));

//        The example of how ArrayList compares dates
        System.out.println(Arrays.deepToString(sortedSums.toArray()));

        int[] max = SumCalculation.FindMaxSum(sortedSums);


        int[] maxSum = SumCalculation.FindMaxSum(sortedSums);
        int[] arrayOutput = SumCalculation.CalculateOutput(numbers, max);

        Result result = new Result(maxSum[0], arrayOutput);

        return result;
    }
}
