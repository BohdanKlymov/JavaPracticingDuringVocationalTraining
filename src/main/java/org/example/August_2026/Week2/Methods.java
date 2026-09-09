package org.example.August_2026.Week2;

public class Methods {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        System.out.println(scrage(a));
        System.out.println(fac(a));
    }

    static int scrage (int length) {
        return length * length;
    }

    static int fac (int ent) {
        if (ent == 1) {
            return 1;
        }
        return ent * fac(ent - 1);
    }
}
