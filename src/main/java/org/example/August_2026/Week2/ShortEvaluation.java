package org.example.August_2026.Week2;

public class ShortEvaluation {
    public static void main(String[] args) {

        boolean c = aIsTrue() && bIsFalse();

        System.out.println(a);
        System.out.println(b);

        a = 0;
        b = 0;

        c =  bIsFalse() && aIsTrue();

        System.out.println(a);
        System.out.println(b);

        a = 0;
        b = 0;

        c =  bIsFalse() & aIsTrue();

        System.out.println(a);
        System.out.println(b);
    }

    static boolean aIsTrue() {

        a++;

        return true;
    }

    static boolean bIsFalse() {

        b++;

        return false;
    }

    static int a = 0;
    static int b = 0;
}
