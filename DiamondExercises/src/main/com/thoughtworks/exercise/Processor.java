package com.thoughtworks.exercise;

import static com.thoughtworks.exercise.generator.DiamondGenerator.*;

public class Processor {

    public static void main(String[] args) {
        processPrintIsoscelesTriangle();
        processPrintCenterDiamond();
        processPrintCenterDiamondWithName();
    }

    private static void processPrintIsoscelesTriangle() {
        System.out.println("print Isosceles Triangle");
        System.out.println(generateIsoscelesTriangle(3));
    }

    private static void processPrintCenterDiamond() {
        System.out.println("print center diamond");
        System.out.println(generateCenterDiamond(3));
    }

    private static void processPrintCenterDiamondWithName() {
        System.out.println("print center diamond with name");
        System.out.println(generateCenterDiamondWithName(3, "Bill"));
    }
}
