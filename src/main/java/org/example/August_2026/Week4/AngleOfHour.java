package org.example.August_2026.Week4;

public class AngleOfHour {
    public static void main(String[] args) {

//        Schreiben Sie ein Programm, das eine Uhrzeit (Stunde 0 bis 23, Minute 0 bis 59) Parameter übergeben bekommt und den Winkel
//        des Stunden- und Minutenzeigers zu dieser Uhrzeit ausgibt. Die Winkel sind 0°, wenn die Zeiger oben
//        stehen, also um 0 und 12 Uhr.

        int hours = Integer.parseInt(args[0]);
        int minutes = Integer.parseInt(args[0]);

        System.out.println(passTheAngleOfTheHourHand(hours, minutes));
    }

    public static String passTheAngleOfTheHourHand(int hours, int minutes) {
        if (hours < 0 || 24 < hours) {
            return "Wrong input statements";
        } else { if (hours == 24) {
                hours = 0;
            }
        }

        if (minutes < 0 || 60 < minutes) {
            return "Wrong input statements";
        } else { if (minutes == 60) {
                hours++;
                minutes = 0;
            }
        }

        int sanitizedHours = (hours > 12) ? hours - 12 : hours;

        final int hourHandsDegreesProMinute = 2;
        final int hourHandsDegreesProHour = 30;
        final int minutesHandsDegreesProMinute = 6;

        double hoursAngle = (double) minutes / hourHandsDegreesProMinute + sanitizedHours * hourHandsDegreesProHour;
        double minutesAngle = minutes * minutesHandsDegreesProMinute;

        return "The hours angle is: " + hoursAngle + ". The minutes angle is: " + minutesAngle;
    }

    public static String passTheAngleOfTheHourHandPhilip(int hours, int minutes) {

        final int hourHandsDegreesProMinute = 2;
        final int minutesHandsDegreesProMinute = 6;

        int totalMinutes = hours * 60 + minutes;

        int hoursAngle = (totalMinutes * hourHandsDegreesProMinute) % 360;
        int minutesAngle = (totalMinutes * minutesHandsDegreesProMinute) % 360;



        return "The hours angle is: " + hoursAngle + ". The minutes angle is: " + minutesAngle;
    }
}
