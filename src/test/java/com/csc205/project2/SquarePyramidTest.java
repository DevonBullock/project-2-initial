package com.csc205.project2;
//I copied my SquarePyramid class and prompted gemini " given the above class, create a test class to ensure accuracy. Be sure to test common edge cases" I did have to change a few values in the test to make them accurate.

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquarePyramidTest {

    @Test
    public void testConstructor() {
        SquarePyramid pyramid = new SquarePyramid(3.0, 4.0);
        assertEquals(3.0, pyramid.getHeight());
        assertEquals(4.0, pyramid.getBasewidth());
    }

    @Test
    public void testSlantHeight() {
        SquarePyramid pyramid = new SquarePyramid(3.0, 4.0);
        assertEquals(3.6055, pyramid.slantheight(), 0.001);
    }

    @Test
    public void testSurfaceArea() {
        SquarePyramid pyramid = new SquarePyramid(3.0, 4.0);
        assertEquals(44.844, pyramid.surfaceArea(), 0.001);
    }

    @Test
    public void testVolume() {
        SquarePyramid pyramid = new SquarePyramid(3.0, 4.0);
        assertEquals(16.0, pyramid.volume(), 0.001);
    }

    @Test
    public void testToString() {
        SquarePyramid pyramid = new SquarePyramid(2.0, 3.0);
        assertEquals("SquarePyramid {basewidth=3.0, height=2.0, slant height=2.5, surface area=24.0, volume=6.0}", pyramid.toString());
    }

    @Test
    public void testEdgeCases() {
        // Test with zero values
        SquarePyramid pyramid = new SquarePyramid(0.0, 0.0);
        assertEquals(0.0, pyramid.slantheight(), 0.001);
        assertEquals(0.0, pyramid.surfaceArea(), 0.001);
        assertEquals(0.0, pyramid.volume(), 0.001);
    }
}