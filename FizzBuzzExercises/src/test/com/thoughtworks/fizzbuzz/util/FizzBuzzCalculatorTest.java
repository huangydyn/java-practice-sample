package com.thoughtworks.fizzbuzz.util;

import org.junit.Test;

import static com.thoughtworks.fizzbuzz.util.FizzBuzzCalculator.parseNumber;
import static org.junit.Assert.assertEquals;


/**
 * Created by yxhuang on 08/06/2017.
 */
public class FizzBuzzCalculatorTest {

    @Test
    public void shouldReturnNumberForNormalNumber() throws Exception {
        assertEquals("1", parseNumber(1));
    }

    @Test
    public void shouldReturnFizzWhenExactDiv3() throws Exception {
        assertEquals("Fizz", parseNumber(3));
        assertEquals("Fizz", parseNumber(6));
    }

    @Test
    public void shouldReturnBuzzWhenExactDiv5() throws Exception {
        assertEquals("Buzz", parseNumber(5));
        assertEquals("Buzz", parseNumber(10));
    }

    @Test
    public void shouldReturnFizzBuzzWhenExactDiv3And5() throws Exception {
        assertEquals("FizzBuzz", parseNumber(15));
        assertEquals("FizzBuzz", parseNumber(30));
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionFor0() throws Exception {
        parseNumber(0);
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionForNegetiveNumber() throws Exception {
        parseNumber(-6);
    }
}
