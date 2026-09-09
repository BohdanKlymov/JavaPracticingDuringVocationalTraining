package org.example.August_2026.Week4;

public class Chessboard {

            /* Aufgabe 1: Schachbrett (Java-Programm ausführen und debuggen)

        Lernziele:
        1. Nutzung des Debugers üben;
        2. üben, selbständig Fehler zu finden

        1.1: Kopieren Sie dieses Programm in Ihr eclipse-System, korregiere Syntax Fehler, übersetze es
               und lassen es dort laufen.

        1.2: Überwachen Sie im Debugger die Variablen
             Linie und Reihe, führen Sie das Programm schrittweise aus.
             Was ändert sich jeweils (Variablenwerte,Consoleausgabe,...) und warum?

        1.3: Verändern Sie das Programm so, dass es ein 4x4 Schachbrett ausgibt,
             außerdem soll der Zeilenabstand um 1 Zeile und der Spaltenabstand um
             3 Zeichen vergrößert werden.

        1.4: Verwenden Sie while-Schleifen statt for-schleifen

        1.5: Verwenden Sie do-while-Schleifen statt while-schleifen

        */

    public static void main( String[] args ) {
        char line;
        int row;

        System.out.println("for loop variant: \n");

        for (row = 4; row >= 1; row--) {

            for (line = 'A'; line <= 'D'; line++)
            System.out.print("    " + line + row);
            System.out.println();
            System.out.println();

        }

        System.out.println("while loop variant: \n");

        row = 4;

        while (row >= 1) {

            line = 'A';

            while (line <= 'D') {
                System.out.print("    " + line + row);
                line++;
            }

            System.out.println();
            System.out.println();

            row--;
        }

        System.out.println("do-while loop variant: \n");

        row = 4;

        do {
            line = 'A';

            while (line <= 'D') {
                System.out.print("    " + line + row);
                line++;
            }

            System.out.println();
            System.out.println();

            row--;
        }
        while (row >= 1);
    }

}
