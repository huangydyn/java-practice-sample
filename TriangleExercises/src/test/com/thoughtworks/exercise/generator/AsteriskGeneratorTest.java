package com.thoughtworks.exercise.generator;

import org.junit.Test;

import static com.thoughtworks.exercise.generator.AsteriskGenerator.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by yxhuang on 08/06/2017.
 */
public class AsteriskGeneratorTest {

    @Test
    public void shouldReturnOneAsterisk() throws Exception {
        assertEquals("*", generateOneAsterisk());
    }

    @Test
    public void shouldReturnNAsterisksInHorizontalLineWhenInputNInGenerateAsterisksInHorizontalLine() throws Exception {
        assertEquals("***", generateAsterisksInHorizontalLine(3));
    }

    @Test
    public void shouldReturnEmptyStringWhenInputNegativeNumberInGenerateAsterisksInHorizontalLine() throws Exception {
        assertEquals("", generateAsterisksInHorizontalLine(-1));
    }

    @Test
    public void shouldReturnNAsterisksInVerticalLineWhenInputNInGenerateAsterisksInVerticalLine() throws Exception {
        assertEquals("*\n*\n*\n", generateAsterisksInVerticalLine(3));
    }

    @Test
    public void shouldReturnEmptyStringWhenInputNegativeNumberInGenerateAsterisksInVerticalLine() throws Exception {
        assertEquals("", generateAsterisksInVerticalLine(-1));
    }

    @Test
    public void shouldReturnRightTriangleAsterisksWhenInputNInGenerateRightTriangleAsterisks() throws Exception {
        assertEquals("*\n**\n***\n", generateRightTriangleAsterisks(3));
    }

    @Test
    public void shouldReturnEmptyStringWhenInputNegativeNumberInInGenerateRightTriangleAsterisks() throws Exception {
        assertEquals("", generateRightTriangleAsterisks(-1));
    }
}