package org.example.August_2026.Week4;

public class PrimeNumber {
    public static void main(String[] args) {

//        Schreiben Sie ein Java-Programm, welches eine natürliche Zahl p vom Terminal einliest und
//        anschließend überprüft, ob p eine Primzahl ist. Überlegen Sie sich hierfür zunächst, welche
//        Eigenschaften eine Primzahl hat und wie Sie die notwendige Überprüfung in Java mit Hilfe
//        einer while-Schleife realisieren können.

        int p = 7;
    }

    public static boolean checkIfIsPrimeNumber(int p) {

        if (p <= 1) {
            return false;
        }

        double divisor = p - 1;
        while (divisor > 1) {

            if (p / divisor % 1 == 0) {
                return false;
            }
            divisor--;
        }
        return true;

    }
}
