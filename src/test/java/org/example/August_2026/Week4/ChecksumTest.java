package org.example.August_2026.Week4;

import org.example.August_2026.Week4.Checksum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ChecksumTest {

    @ParameterizedTest
    @CsvSource({"143, 8", "0, 0", "23, 5"})
    void checksumTest(int input, int expected) {
        int current = Checksum.calculateChecksum(input);
        assertEquals(expected, current);
    }
}
