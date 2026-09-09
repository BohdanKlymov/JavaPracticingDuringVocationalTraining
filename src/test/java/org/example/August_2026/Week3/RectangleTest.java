package org.example.August_2026.Week3;
import org.example.August_2026.Week3.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    void CalculatingTriangleDiagonal() {
        int inputA = 10;
        int inputB = 15;
        double diagonalExpected = 18.03;
        double current = Rectangle.Diagonal(inputA, inputB);
        assertEquals(diagonalExpected, current, 0.1);
    }
    @Test
    void CalculatingTriangleScope() {
        int inputA = 10;
        int inputB = 15;
        double scopeExpected = 50;
        double current = Rectangle.Scope(inputA, inputB);
        assertEquals(scopeExpected, current);
    }
    @Test
    void CalculatingTriangleArea() {
        int inputA = 10;
        int inputB = 15;
        double AreaExpected = 150;
        double current = Rectangle.Area(inputA, inputB);
        assertEquals(AreaExpected, current);
    }
}
