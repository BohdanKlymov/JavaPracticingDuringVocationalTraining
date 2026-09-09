package org.example.August_2026.Week3.PascalCaseMethod_6;

import java.util.Arrays;
import java.util.Objects;

public class Result {
    int maxSum;
    int[] arrayOutput;

    public Result(int maxSum, int[] arrayOutput) {
        this.maxSum = maxSum;
        this.arrayOutput = arrayOutput;
    }

    @Override
    public String toString() {
        return maxSum + "\nSum of: " + Arrays.toString(arrayOutput);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return maxSum == result.maxSum && Objects.deepEquals(arrayOutput, result.arrayOutput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSum, Arrays.hashCode(arrayOutput));
    }
}
