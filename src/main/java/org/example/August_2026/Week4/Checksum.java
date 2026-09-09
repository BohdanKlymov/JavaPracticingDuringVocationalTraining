package org.example.August_2026.Week4;

public class Checksum {

//        Schreiben Sie ein Java Programm, das die Quersumme einer positiven ganzen Zahl berechnet.
//        Die Quersumme der Zahl 143 ist beispielsweise 8 (= 1 + 4 + 3). Die Zahl wird als Kommandozeilenargument übergeben.
//        Hinweis: An die einzelnen Ziffern einer Zahl können Sie mit Hilfe der Operatoren % und / kommen. 143 % 10 ist beispielsweise 3.

    public static int calculateChecksum(int input) {

        int resultOfChecksum = 0;

        for (int remainingDigits = input; remainingDigits != 0; remainingDigits /= 10) {

            resultOfChecksum += remainingDigits % 10;
        }
        return  resultOfChecksum;
    }
}
