package org.example.September_2026.Week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MirrorNumberTest {

    @Test
    void mirrorNumberOf13579ShouldBe97531() {
        int input = 13579;
        String expected = "97531";
        String current = MirrorNumber.MirrorNumBecomesBigger(input, "");
        assertEquals(expected, current);
    }

    @Test
    void mirrorNumberOf2ShouldBe2() {
        int input = 2;
        String expected = "2";
        String current = MirrorNumber.MirrorNumBecomesBigger(input, "");
        assertEquals(expected, current);
    }

    @Test
    void mirrorNumberOf6892ShouldBe2986() {
        int input = 6892;
        String expected = "2986";
        String current = MirrorNumber.inputNumBecomesShorter(input, "");
        assertEquals(expected, current);
    }

    @Test
    void mirrorNumberOf8ShouldBe8() {
        int input = 8;
        String expected = "8";
        String current = MirrorNumber.inputNumBecomesShorter(input, "");
        assertEquals(expected, current);
    }
}
