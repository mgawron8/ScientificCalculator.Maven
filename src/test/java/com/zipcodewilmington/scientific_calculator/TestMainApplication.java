package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import com.zipcodewilmington.scientificcalculator.scientificFunctions;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static junit.framework.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    public MainApplication testCoreFunctions = new MainApplication();

    @Test
    public void testFactorial() {
        assertEquals(Double.valueOf(6.0), scientificFunctions.factorialFunction(3.0)); //should be true
        assertEquals(Double.valueOf(10.0), scientificFunctions.factorialFunction(10.0)); //should be false
    }

    @Test
    public void testTrigFunctions() {
        scientificFunctions testSine = new scientificFunctions();

        String input = "sine";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(Double.valueOf(-0.5440211108893698),testSine.trigFunctions(10.0));
    }
    /*@Test
    public void testAddition() {
        assertEquals(Double.valueOf(5.0), testCoreFunctions.basicoperations("+", 2,3));
        assertEquals(Double.valueOf(1000.0), testCoreFunctions.basicoperations("+", 565,435));
    }

    @Test
    public void testSubtraction() {
        assertEquals(Double.valueOf(-5.0), testCoreFunctions.basicoperations("-", -10, 5));
        assertEquals(Double.valueOf(1000.0), testCoreFunctions.basicoperations("-", 2000, 1000));
    }


    @Test
    public void testMultiplication() {
        //test
    }

    @Test
    public void testDivision() {

    }
    */
}
