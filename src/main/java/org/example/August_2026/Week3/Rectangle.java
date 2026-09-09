package org.example.August_2026.Week3;

public class Rectangle {
    public static void main(String[] args) {

//        Schreiben Sie ein Java-Programm Rechteck.java,
//        das die Länge der Diagonalen sowie Umfang und Flächeninhalt eines Rechtecks berechnet und in geeigneter Form ausgibt.
//        Die zwei Seitenlängen des Rechtecks sollen vom Terminal eingelesen werden.

        if (args.length == 0) {
            return;
        }

        double a;
        double b;



        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
        } catch (NumberFormatException numberFormatException){
            return;
        }

        Diagonal(a, b);
        Scope(a, b);
        Area(a, b);
    }

//    static void Diagonal(double a, double b) {
//        double d = Math.sqrt((a * a) + (b * b));
//        System.out.printf("Diagonale: " + "%.2f", d);
//    }
    static double Diagonal(double a, double b) {
        double d = Math.sqrt((a * a) + (b * b));
        return d;
    }

    static double Scope(double a, double b) {
        double u = 2 * (a + b);
        return u;
    }

    static double Area(double a, double b) {
        double aF = a * b;
        return aF;
    }
}
