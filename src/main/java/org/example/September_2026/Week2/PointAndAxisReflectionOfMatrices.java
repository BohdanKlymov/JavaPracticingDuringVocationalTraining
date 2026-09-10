package org.example.September_2026.Week2;

public class PointAndAxisReflectionOfMatrices {
//    Aufgabe 6 : Punkt- und Achsenspiegelung von Matrizen
//
//    Lernziele:
//            1. Programmierung mit 2-dimensionalen Arrays
//            2. korrekte Schleifenabbrüche
//
//    gegeben ist ein Java-Programm, das ein 2-dimensionales Array wie folgt mit
//    Zahlen auffüllt und anschließend am Bildschirm ausgibt.
//
//              11   12   13   14
//              21   22   23   24
//              31   32   33   34
//              41   42   43   44
//
//              !! Das Auffüllen des Arrays (1. Teil des Programms) und die Ausgabe
//!! des Arrays (3. Teil des Programms) sollen Sie unverändert übernehmen!
//
//    Sie sollen nur einen mittleren Teil einfügen, der im 2-dimensionalen Array
//    die Zahlen vertauscht. Kopieren Sie sich für jede der Teilaufgaben 24.1-24.3
//    wieder das unten stehende Programm.
//    Ihr Programm soll die Zahlen der Matrix wirklich vertauschen, sie nicht nur
//    neu berechnen!
//
//            6.1: (schwieriger) Ergänzen Sie das gegebene Programm so, dass es die Matrix an ihrem
//    Mittelpunkt spiegelt (Punktspiegelung). Die gewünschte Ausgabe ist:
//
//            44   43   42   41
//            34   33   32   31
//            24   23   22   21
//            14   13   12   11
//
//            6.2: Ergänzen Sie das gegebene Programm so, dass es die Matrix an der Achse
//    von links oben nach rechts unten spiegelt. Die gewünschte Ausgabe ist:
//
//            11   21   31   41
//            12   22   32   42
//            13   23   33   43
//            14   24   34   44
//
//            6.3: Ergänzen Sie das gegebene Programm so, dass es die Matrix an der Achse
//    von rechts oben nach links unten spiegelt. Die gewünschte Ausgabe ist:
//
//            44   34   24   14
//            43   33   23   13
//            42   32   22   12
//            41   31   21   11
//
//            6.4.: Verändern Sie alle 3 Teilprogramme so,
//    dass sie auch für 5x5-Matritzen funktionieren.
//    Kontrollieren Sie beim Testen insbesondere die mittlere Zeile
//    bzw. Spalte der Ausgabe.
//*/


//    Ergänzen Sie das gegebene Programm so, dass es die Matrix an der Achse
//    von links oben nach rechts unten spiegelt.
    public static int[][] exchangingAnArrayFromTopLeftToBottomRight(int[][] twoDimensionalArray) {

        for (int row = 0; row < 4; row++) {
            for (int index = row + 1; index < 4; index++) {
                int savedNumberForDuplication;

                savedNumberForDuplication = twoDimensionalArray[row][index];

                twoDimensionalArray[row][index] = twoDimensionalArray[index][row];
                twoDimensionalArray[index][row] = savedNumberForDuplication;

            }
        }

        return twoDimensionalArray;
    }

//    Ergänzen Sie das gegebene Programm so, dass es die Matrix an der Achse
//    von rechts oben nach links unten spiegelt. Die gewünschte Ausgabe ist:

}
