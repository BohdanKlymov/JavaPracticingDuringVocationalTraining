package org.example.August_2026.Week4;
import org.example.August_2026.Week4.AngleOfHour;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AngleOfHourTest {
    @Test
    void angle_6H_And_30M() {
        int hours = 6;
        int minutes = 30;
        String expected = "The hours angle is: 195.0. The minutes angle is: 180.0";
        String current = AngleOfHour.passTheAngleOfTheHourHand(hours, minutes);
        assertEquals(expected, current);
    }

    @Test
    void angle_11H_And_47M() {
        int hours = 11;
        int minutes = 47;
        String expected = "The hours angle is: 353.5. The minutes angle is: 282.0";
        String current = AngleOfHour.passTheAngleOfTheHourHand(hours, minutes);
        assertEquals(expected, current);
    }

    @Test
    void angle_22H() {
        int hours = 22;
        int minutes = 0;
        String expected = "The hours angle is: 300.0. The minutes angle is: 0.0";
        String current = AngleOfHour.passTheAngleOfTheHourHand(hours, minutes);
        assertEquals(expected, current);
    }

    @Test
    void angle_60M() {
        int hours = 0;
        int minutes = 60;
        String expected = "The hours angle is: 30.0. The minutes angle is: 0.0";
        String current = AngleOfHour.passTheAngleOfTheHourHand(hours, minutes);
        assertEquals(expected, current);
    }

    @Test
    void wrongInputStatements() {
        int hours = -1;
        int minutes = 80;
        String expected = "Wrong input statements";
        String current = AngleOfHour.passTheAngleOfTheHourHand(hours, minutes);
        assertEquals(expected, current);
    }
}
