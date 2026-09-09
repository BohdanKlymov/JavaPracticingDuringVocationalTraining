package org.example.August_2026.Week3;
import org.example.August_2026.Week3.WeatherStation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WeatherStationTest {
    @Test
    void testTimeCalculation() {
        int input = 5003;
        String expected = "0 Days\n1 Hours\n23 Minutes\n23 Seconds";
        String current = WeatherStation.secondsConvert(input);
        assertEquals(expected,current);
    }

    @Test
    void testTimeCalculation2() {
        int input = 3820;
        String expected = "0 Days\n1 Hours\n3 Minutes\n40 Seconds";
        String current = WeatherStation.secondsConvert(input);
        assertEquals(expected,current);
    }
}
