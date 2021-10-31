package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    @Test
    public void testAddition() {
        MainApplication testCoreFunctions = new MainApplication();
        assertEquals(Double.valueOf(5.0), testCoreFunctions.basicoperations(2,3));
        assertEquals(Double.valueOf(1000.0), testCoreFunctions.basicoperations(565,435));
        assertEquals(Double.valueOf(1.0), testCoreFunctions.basicoperations(0.6,0.4));
    }

    @Test
    public void testSubtraction() {

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
