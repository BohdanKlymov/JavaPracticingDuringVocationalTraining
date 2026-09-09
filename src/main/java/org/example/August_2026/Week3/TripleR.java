package org.example.August_2026.Week3;

public class TripleR {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println(luckAfterSameArguments(a, b, c));
        System.out.println("The triangle is perpendicular: " + isPerpendicular(a, b, c));
    }

//    Eine Fehlertoleranztechnik namens Triple Redundancy arbeitet so, dass alle sicherheitskritischen Berechnungen jeweils von drei Rechnern durchgerechnet werden.
//    Als Wert der Berechnung wird dann jeweils der Wert ausgegeben, den mindestens zwei der drei Rechner errechnet haben.
//    Schreiben Sie ein Javaprogramm TripleR, das die drei Werte als Kommandozeilenargument übergeben bekommt und entweder als Ergebnis den Mehrheitsentscheid ausgibt
//    oder, falls alle drei Werte unterschiedlich sind, die Warnung Achtung: "Kein eindeutiger
//    Wert!"

    static String luckAfterSameArguments(int a, int b, int c) {

        if (a == b || a == c) {
            return "" + a;
        } else if (b == c) {
            return "" + b;
        }
        return "No clear value!";
    }


//    Schreiben Sie eine Funktion:
//    boolean istRechtwinklig(int x, int y, int z)
//    Der Funktion werden die Seitenlängen eines Dreiecks übergeben. Sie soll genau dann true zurückgeben, wenn ein Dreieck mit diesen Seitenlängen rechtwinklig ist.
//    Anmerkung: Sie müssen nicht überprüfen, ob die übergebenen Seitenlängen ein Dreieck bilden. Dies dürfen Sie voraussetzen.
//    Tipp: Ein Dreieck ist genau dann rechtwinklig, wenn für seine Seitenlängen der Satz des Pythagoras gilt.

    static boolean isPerpendicular(int a, int b, int c) {
        if (a > b && a > c) {
            int result = b^2 + c^2;
            return (a^2) == result;

        } else {
            if (b > a && b > c) {
                int result = a ^ 2 + c ^ 2;
                return (b ^ 2) == result;

            } else {
                if (c > b && c > a) {
                    int result = a ^ 2 + b ^ 2;
                    return (c ^ 2) == result;
                }
            }
        }
        return false;
    }
}
