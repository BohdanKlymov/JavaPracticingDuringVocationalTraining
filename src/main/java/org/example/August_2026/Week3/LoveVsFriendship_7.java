package org.example.August_2026.Week3;
import java.util.HashMap;
import java.util.Scanner;


public class LoveVsFriendship_7 {
    public void main(String[] args) {

//        If　a = 1, b = 2, c = 3 ... z = 26
//        Then l + o + v + e = 54
//        and f + r + i + e + n + d + s + h + i + p = 108
//        So friendship is twice as strong as love :-)
//
//        Your task is to write a function which calculates the value of a word based off the sum of the alphabet positions of its characters.

        Scanner scanner = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        System.out.print("Print your word and I'll calculate the value of a word: ");
        String input = scanner.nextLine().toLowerCase();

        calculateValueOfWord(input, putValuesForLetters(alphabet));

        scanner.close();
    }

    public HashMap<Character, Integer> putValuesForLetters(String alphabet) {

        HashMap<Character, Integer> valueOfLetters = new HashMap<Character, Integer>();

        for (int index = 0; index < alphabet.length(); index++) {
            valueOfLetters.put(alphabet.charAt(index), index + 1);
        }

        return valueOfLetters;
    }

    static void calculateValueOfWord(String input, HashMap<Character, Integer> putValuesForLetters) {

        int valueOfWord = 0;
        int noValidCharacters = 0;

        for (int index = 0; index < input.length(); index++) {

            if (Character.isLetter(input.charAt(index))) {
                valueOfWord += putValuesForLetters.get(input.charAt(index));
            } else {
                noValidCharacters++;
            }
        }

        System.out.println("This is the value of your word: "  + valueOfWord);
        System.out.println("This is the amount of not valid characters you wrote: "  + noValidCharacters);
    }
}
