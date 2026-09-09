package org.example.September_2026.Week2;

public class FibonacciSequence {

//    schreibe zwei Methoden die jeweils einmal das n-te Element der Fibonacci Folge iterativ (also mit Schleife) oder rekursiv  löst.
//    Die Fibonacci Folge ist wie folgt definiert: f(1)=f(2)=1. f(n)=f(n-1)+f(n-2) für n>=3.

    public static int FibonacciSequenceWithLoop(int inputOfCountNumber) {
        int firstNumber = 1;
        int secondNumber = 1;

        for (int countForLoop = 2; countForLoop <= inputOfCountNumber - 1; countForLoop++) {
            int backupNumber = secondNumber;
            secondNumber = firstNumber + secondNumber;
            firstNumber = backupNumber;
        }

        return secondNumber;
    }

    public static int FibonacciSequenceWithRecursiveCall (int count, int firstNumber, int secondNumber) {

        if (count == 2) {
            return secondNumber;
        }

        int backupNumber = secondNumber;
        secondNumber = firstNumber + secondNumber;
        firstNumber = backupNumber;

        return FibonacciSequenceWithRecursiveCall(count - 1, firstNumber, secondNumber);
    }

    public static int FibonacciSequenceWithRecursiveCall2 (int count) {

        if (count == 1 || count == 2) {
            return 1;
        }

        return FibonacciSequenceWithRecursiveCall2(count - 1) + FibonacciSequenceWithRecursiveCall2(count - 2);
    }
}
