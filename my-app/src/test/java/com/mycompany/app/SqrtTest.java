package com.mycompany.app;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {

    @Test
    public void testAverageMidValues() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(5.0, sqrt.average(4.0, 6.0));
    }

    @Test
    public void testAverageNegativeValues() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(-5.0, sqrt.average(-4.0, -6.0));
    }

    @Test
    public void testGoodTrue() {
        Sqrt sqrt = new Sqrt(0);
        assertTrue(sqrt.good(2.0, 4.0));
    }

    @Test
    public void testGoodFalse() {
        Sqrt sqrt = new Sqrt(0);
        assertFalse(sqrt.good(1.0, 4.0));
    }

    @Test
    public void testImproveTypicalCase() {
        Sqrt sqrt = new Sqrt(0);
        double result = sqrt.improve(1.0, 4.0);
        assertEquals(2.5, result);
    }

    @Test
    public void testImproveConvergesToRoot() {
        Sqrt sqrt = new Sqrt(0);
        double guess = 1.0;
        double improved = sqrt.improve(guess, 9.0);
        assertTrue(improved > guess && improved < 9.0);
    }

    @Test
    public void testIterSqrtForSquare() {
        Sqrt sqrt = new Sqrt(0);
        double result = sqrt.iter(1.0, 25.0);
        assertEquals(5.0, result, 0.00001);
    }

    @Test
    public void testIterSqrtForNonSquare() {
        Sqrt sqrt = new Sqrt(0);
        double result = sqrt.iter(1.0, 2.0);
        assertEquals(Math.sqrt(2.0), result, 0.00001);
    }

    @Test
    public void testCalcWithSquare() {
        Sqrt sqrt = new Sqrt(36.0);
        double result = sqrt.calc();
        assertEquals(6.0, result, 0.00001);
    }

    @Test
    public void testCalcWithNonSquare() {
        Sqrt sqrt = new Sqrt(7.0);
        double result = sqrt.calc();
        assertEquals(Math.sqrt(7.0), result, 0.00001);
    }
}
