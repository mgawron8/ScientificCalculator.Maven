package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    public MainApplication testCoreFunctions = new MainApplication();

    @Test
    public void testAddition() {
        assertEquals(Double.valueOf(5.0), testCoreFunctions.basicoperations("+", 2,3));
        assertEquals(Double.valueOf(1000.0), testCoreFunctions.basicoperations("+", 565,435));
    }

    @Test
    public void testSubtraction() {
        assertEquals(Double.valueOf(5.0), testCoreFunctions.basicoperations(2,3));
        assertEquals(Double.valueOf(1000.0), testCoreFunctions.basicoperations(565,435));
    }

    @Test
    public void testMultiplication() {

    }

    @Test
    public void testDivision() {

    }

    @Test
    public void
}
