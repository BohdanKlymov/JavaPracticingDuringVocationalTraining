package org.example.Week4;

public class ForAndWhileLoopsTasks {
    public static void main(String[] args) {

//        In dieser Aufgabe beschäftigen wir uns mit for- und while-Schleifen.
//        a) Schreiben sie ein Programm, dass die Zahlen von 1 bis 100 aufaddiert und das Ergebnis
//        ausgibt! Nutzen Sie in Ihrem Programm eine for-Schleife (und keine Gaußsche Summenformal ;-) ).
//        b) Schreiben Sie ein Java-Programm, welches eine naturliche Zahl n beim Aufruf übergeben bekommt
//        und anschließend die Fakultät der Zahl n (geschrieben n!) berechnet und ausgibt.
//        Die Fakultät einer Zahl ist folgendermaßen definiert:
//        n! = 1 falls n = 0, 1 ∗ 2 ∗ . . . ∗ n sonst
//        Nutzen Sie in Ihrem Programm erneut eine for-Schleife.

        int input = 5;

        System.out.println("The sum of the numbers from 1 to 100: " + loopFrom1To100());

    }

    public static int loopFrom1To100() {
        int result = 0;

        for (int index = 1; index < 101; index++) {
            result += index;
        }

        return result;
    }

    // f(n) = 1*2*3*...*n-1*n
    public static int calculationOfFakultaet(int input) {
        int result = 1;

        for (int i = 1; i <= input; i++) {
            result *= i;
        }
        return result;
    }

    // f(n) = 1 if n = 1, sonst f(n-1)*n
    public static int calculationOfFakultaetRec(int n) {
        if(n==1){
            return 1;
        }
        else{
            return n* calculationOfFakultaetRec(n-1);
        }
    }
    
}
