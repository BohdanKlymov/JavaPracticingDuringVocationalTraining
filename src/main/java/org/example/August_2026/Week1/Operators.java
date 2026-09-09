package org.example.August_2026.Week1;

public class Operators {
    public static void main (String[] args) {

//        Schreiben Sie ein Java-Programm, welches drei boolesche Variablen b1, b2 und b3 deklariert.
//
//        Initialisieren die Variablen b1 und b3 mit dem Wert true und die Variable b2 mit dem Wert
//
//        false. Ihr Programm soll die folgenden booleschen Ausdrucke auswerten und ausgeben:
    //        a) b1 und b3 oder b2
    //        b) b1 ist gleich b3 und b1 ist gleich b2
    //        c) b1 oder nicht b2 und nicht b3 oder b2
    //        d) 2 kleiner 1 und nicht b2
    //        e) entweder nicht b2 oder nicht b1 und nicht b3

        System.out.println("Out" + (5 + 5));
        System.out.println(5 + 5 + "Out");

        int five = 5;
        double fiveWithComma = 5;

        int two = 2;
        double twoWithComma = 2;

        System.out.println(fiveWithComma / two);
        System.out.println(five / twoWithComma);

        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(5 / 2.0);
        System.out.println(5.0 / 2.0);

        System.out.println((double) 5 / (double) 2);
        System.out.println( 5 + 0.0);


//        Exercise 1

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;


        System.out.println(b1 && b3 || b2);
        System.out.println(b1 == b3 && b1 == b2);
        System.out.println(b1 || !b2 && !b3 || b2);
        System.out.println(2 < 1 && !b2);
        System.out.println(!b2 || !b1 || !b3);
        System.out.println(!b2^!b1 && b3);
        System.out.println(b1 && b2 || b2 & b3);


//        Exercise 2

//        I can use these variables:
//        1, 3, 6

        byte w = 0;

        for (int i = 0; i <= 128; i++) {
            w++;
        }

        System.out.println(w);

        
    }
}
