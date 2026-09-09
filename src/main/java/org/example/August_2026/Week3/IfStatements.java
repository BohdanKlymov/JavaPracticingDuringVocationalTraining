package org.example.August_2026.Week3;

public class IfStatements {
    public static void main(String[] args) {


//        Diese Aufgabe beschäftigt sich mit if-Anweisungen. Entwickeln Sie ein Java-Programm, das
//        einen Wert x vom Typ int beim Aufruf übergeben wird und auf folgende Eigenschaften Überprüft:
//        • x = 50
//        • x ist eine ungerade Zahl
//        • x ist ein Vielfaches von 11
//        • x liegt im Intervall von 90 bis 100 (x ∈ [90,100])
//        Lassen Sie das Ergebnis jeder Überprüfung in geeigneter Form ausgeben.

        int x = 50;

        System.out.println("x is 50: " + is50(x));
        System.out.println("x is an odd number: " + oodNumber(x));

        System.out.println("x lies in the interval from 90 to 100: " + interalFrom90And100(x));
    }

    static boolean is50(int x) {
        return x == 50;
    }

    static boolean oodNumber(int x) {
        return x % 2 != 0;
    }

    static boolean multipleOf11(int x) {
        return x % 11 == 0;
    }

    static boolean interalFrom90And100(int x) {
        return 90 <= x && x <= 100;
    }
}
