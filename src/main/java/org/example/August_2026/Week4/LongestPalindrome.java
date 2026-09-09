package org.example.August_2026.Week4;

import java.util.*;

public class LongestPalindrome {
//    Write a Java program that takes a string and finds the longest contiguous substring that reads the same forwards and backwards.
//      Beispiel:
//          input = racecarcrash
//          output = racecar

    public static String findLongestPalindrome(String input) {

        input = input.toLowerCase(Locale.ROOT);
        input = input.replace(" ", "");

        List<String> palindromesInWord = new ArrayList<String>() {};


        for (int startIndex = 0; startIndex < input.length() - 1; startIndex++) {

            for (int lastIndexToAdd = startIndex + 1; lastIndexToAdd <= input.length() - 1; lastIndexToAdd++) {

                String textToProofPalindrome = input.substring(startIndex, lastIndexToAdd + 1);

                String backwardWord = "";
                for (int index = textToProofPalindrome.length() - 1; index >= 0; index--) {
                    backwardWord += textToProofPalindrome.charAt(index);
                }

                if (textToProofPalindrome.equals(backwardWord)) {
                    palindromesInWord.add(textToProofPalindrome);
                }
            }
        }

        if (palindromesInWord.isEmpty()) {
            return "";
        }

        return Collections.max(palindromesInWord, Comparator.comparingInt(String::length));
    }

}


