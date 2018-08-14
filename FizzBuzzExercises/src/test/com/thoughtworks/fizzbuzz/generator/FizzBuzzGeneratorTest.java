package com.thoughtworks.fizzbuzz.generator;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by yxhuang on 08/06/2017.
 */
public class FizzBuzzGeneratorTest {

    private FizzBuzzGenerator generator;

    @Before
    public void setUp() throws Exception {
        generator = new FizzBuzzGenerator();
    }

    @Test
    public void shouldSuccessReturnFizzBuzzStringList() throws Exception {
        List<String> testResult = generator.generateFizzBuzzStringList(200);
        assertEquals(200, testResult.size());
        assertEquals("1", testResult.get(0));
        assertEquals("Fizz", testResult.get(2));
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenInputNonPositiveNumber() throws Exception {
        generator.generateFizzBuzzStringList(-1);
    }

}