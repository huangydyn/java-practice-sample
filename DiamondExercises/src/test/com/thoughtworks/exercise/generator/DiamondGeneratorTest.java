package com.thoughtworks.exercise.generator;

import org.junit.Test;

import static com.thoughtworks.exercise.generator.DiamondGenerator.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by yxhuang on 08/06/2017.
 */
public class DiamondGeneratorTest {

    @Test
    public void shouldGetNLineIsoscelesTriangleForN() throws Exception {
        assertEquals("  *  \n *** \n*****\n", generateIsoscelesTriangle(3));
    }

    @Test
    public void shouldGetCorrectCenterDiamond() throws Exception {
        assertEquals("  *  \n *** \n*****\n *** \n  *  \n", generateCenterDiamond(3));
    }

    @Test
    public void shouldGetCorrectCenterDiamondWithName() throws Exception {
        assertEquals("  *  \n *** \nBill\n *** \n  *  \n", generateCenterDiamondWithName(3, "Bill"));
    }

}