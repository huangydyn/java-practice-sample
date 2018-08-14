package com.thoughtworks.exercise;

import static com.thoughtworks.exercise.generator.AsteriskGenerator.*;

public class Processor {

    public static void main(String[] args) {
        printOneAsterisk();
        printAsterisksInHorizontalLine();
        printAsterisksInVerticalLine();
        printAsterisksAsRightTriangle();
    }

    private static void printOneAsterisk() {
        System.out.println("print One Asterisk");
        System.out.println(generateOneAsterisk());
    }

    private static void printAsterisksInHorizontalLine() {
        System.out.println("print N Asterisks in horizontal line");
        System.out.println(generateAsterisksInHorizontalLine(3));
    }

    private static void printAsterisksInVerticalLine() {
        System.out.println("print N Asterisks in vertical line");
        System.out.println(generateAsterisksInVerticalLine(3));
    }

    private static void printAsterisksAsRightTriangle() {
        System.out.println("print Asterisks as a Right Triangle");
        System.out.println(generateRightTriangleAsterisks(3));
    }
}
