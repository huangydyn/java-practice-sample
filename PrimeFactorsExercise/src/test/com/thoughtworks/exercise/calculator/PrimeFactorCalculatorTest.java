package com.thoughtworks.exercise.calculator;

import org.junit.Test;

import java.util.List;

import static com.thoughtworks.exercise.calculator.PrimeFactorCalculator.getPrimeFactor;
import static org.junit.Assert.assertEquals;

/**
 * Created by yxhuang on 08/06/2017.
 */
public class PrimeFactorCalculatorTest {

    @Test
    public void shouldReturnEmpyuListWhenInputNegetiveNumber() {
        assertEquals(0, getPrimeFactor(-3).size());

    }

    @Test
    public void shouldReturnEmptyListWhenInput1() {
        assertEquals(0, getPrimeFactor(1).size());
    }

    @Test
    public void shouldReturn2And3WhenInput6() {
        List result = getPrimeFactor(6);
        assertEquals(2, result.size());
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
    }

    @Test
    public void shouldReturn2And3And5WhenInput30() {
        List result = getPrimeFactor(30);
        assertEquals(3, result.size());
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(5, result.get(2));
    }
}