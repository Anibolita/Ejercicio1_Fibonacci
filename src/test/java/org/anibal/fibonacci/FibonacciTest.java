package org.anibal.fibonacci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Test cases:
 * fibonacci 0 -> 1 *
 * fibonacci 1 -> 1
 * fibonacci 2 -> 2
 * fibonacci 3 -> 6
 * fibonacci 6 -> 720
 * fibonacci negative number -> raises an exception
 */

class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    private void setup() {fibonacci = new Fibonacci(); }

    @AfterEach
    private void finish() {fibonacci = null;}

    @Test
    public void testComputeReturnZeroIfTheNumberIsZero(){
        int expectedValue = 0;
        int obtinedValue = fibonacci.compute(0);

        assertEquals(expectedValue,obtinedValue);
    }

    @Test
    public void testComputeReturnOneIfTheNumberIsOne(){
        int expectedValue = 1;
        int obtinedValue = fibonacci.compute(1);

        assertEquals(expectedValue,obtinedValue);
    }

    @Test
    public void testComputeReturnOneIfTheNumberIsTwo(){
        int expectedValue = 1;
        int obtinedValue = fibonacci.compute(2);

        assertEquals(expectedValue,obtinedValue);
    }

    @Test
    public void testComputeReturnTwoIfTheNumberIsThree(){
        int expectedValue = 2;
        int obtinedValue = fibonacci.compute(3);

        assertEquals(expectedValue,obtinedValue);
    }


}