package org.example.August_2026.Week3;

public class WeatherStation {
    public static void main(String[] args) {

//        Eine Wetterstation auf der Nordseeinsel Juist übermittelt die Werte für die Regendauer des
//        Tages in Sekunden an das Wetteramt. Schreiben Sie ein Programm, das eine Umrechnung von
//        Sekunden in Tage, Stunden, Minuten und Sekunden vornimmt. Zum Beispiel sind 3820 sec =
//        0 Tage, 1 Stunde (= 3600 sec), 3 Minuten (= 180 sec) und 40 Sekunden. Der Sekundenbetrag
//        soll als Kommandozeilenargument übergeben werden. Das Ergebnis der Umrechnung soll
//        ausgegeben werden

        if (args.length == 0) {
            return;
        }

        int number;

        try {
            number = Integer.parseInt(args[0]);
        } catch (NumberFormatException numberFormatException){
            return;
        }

        System.out.println(secondsConvert(number));
    }

    static String secondsConvert(int number) {
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        days = number / 86400;
        number = number % 86400;

        hours = number / 3600;
        number = number % 3600;

        minutes = number / 60;
        number = number % 60;

        if (number > 0) {
            seconds += number;
        }

        String output = days + " Days\n" + hours + " Hours\n" + minutes + " Minutes\n" + seconds + " Seconds";
        return output;
    }
}
