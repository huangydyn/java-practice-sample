package com.thoughtworks.exercise.generator;

/**
 * Created by yxhuang on 08/06/2017.
 */
public class AsteriskGenerator {

    public static String generateOneAsterisk() {
        return "*";
    }

    public static String generateAsterisksInHorizontalLine(int number) {
        return generateSymbols("*", number);
    }

    public static String generateAsterisksInVerticalLine(int number) {
        return generateSymbols("*\n", number);
    }

    public static String generateRightTriangleAsterisks(int number) {
        StringBuilder builder = new StringBuilder();
        for (int index = 1; index <= number; index++) {
            builder.append(generateAsterisksInHorizontalLine(index));
            builder.append("\n");
        }

        return builder.toString();
    }

    private static String generateSymbols(String symbol, int number) {
        StringBuilder builder = new StringBuilder();
        for (int index = 1; index <= number; index++) {
            builder.append(symbol);
        }
        return builder.toString();
    }
}
