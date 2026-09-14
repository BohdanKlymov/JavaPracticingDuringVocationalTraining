package org.example.September_2026.Week3;

public class MirrorNumber {
//    Aufgabe E3: Spiegelzahl.
//    Die Spiegelzahl einer natürlichen Zahl erhält man, indem man die Ziffern der Zahl in umgekehrter
//    Reihenfolge aufschreibt. Beispielsweise hat 123456 die Spiegelzahl 654321.
//    Schreiben Sie eine rekursive Funktion
//    func spiegelzahl(zahl int) int {...}
//    welche die Spiegelzahl der übergebenen Zahl zurückgibt.
//    Sie dürfen davon ausgehen, dass der Funktion nur natürliche Zahlen übergeben werden, zu denen
//    eine Spiegelzahl existiert (d.h. die nicht mit einer 0 enden).

    public static String MirrorNumBecomesBigger(int inputNum, String mirrorNumber) {
        if (String.valueOf(inputNum).length() == mirrorNumber.length()) {
            return mirrorNumber;
        }
        String inputNumForIndex = String.valueOf(inputNum);

        int index = String.valueOf(inputNum).length() - 1 - mirrorNumber.length();

        mirrorNumber += Character.getNumericValue(inputNumForIndex.charAt(index));

        return MirrorNumBecomesBigger(inputNum, mirrorNumber);
    }


    public static String inputNumBecomesShorter(int inputNum, String mirrorNumber) {
        if (inputNum == 0) {
            return mirrorNumber;
        }
        String inputNumForIndex = String.valueOf(inputNum);

        int index = String.valueOf(inputNum).length() - 1;

        return inputNumBecomesShorter(inputNum / 10, mirrorNumber += Character.getNumericValue(inputNumForIndex.charAt(index)));
    }
}
