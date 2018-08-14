package com.thoughtworks.exercise.generator;

import static com.thoughtworks.exercise.util.SymbolUtil.*;

/**
 * Created by yxhuang on 08/06/2017.
 */
public class DiamondGenerator {

    public static String generateIsoscelesTriangle(int number) {
        StringBuilder builder = new StringBuilder();
        int lineLength = getNumberInArithmeticProgression(number);

        appendIsoscelesTriangleWithLineLength(builder, number, lineLength);

        return builder.toString();
    }

    public static String generateCenterDiamond(int number) {
        StringBuilder builder = new StringBuilder();
        int lineLength = getNumberInArithmeticProgression(number);

        builder.append(generateIsoscelesTriangle(number));
        appendReversedIsoscelesTriangleWithLineLength(builder, number - 1, lineLength);

        return builder.toString();
    }

    public static String generateCenterDiamondWithName(int number, String name) {
        StringBuilder builder = new StringBuilder();
        int lineLength = getNumberInArithmeticProgression(number);

        appendIsoscelesTriangleWithLineLength(builder, number - 1, lineLength);
        appendNameInLine(builder, name);
        appendReversedIsoscelesTriangleWithLineLength(builder, number - 1, lineLength);

        return builder.toString();
    }

    private static void appendNameInLine(StringBuilder builder, String name) {
        builder.append(name);
        shiftLine(builder);
    }

    private static void appendIsoscelesTriangleWithLineLength(StringBuilder builder, int number, int lineLength) {
        for (int index = 1; index <= number; index++) {
            appendCenterAsterisksInLine(builder, index, lineLength);
        }
    }

    private static void appendReversedIsoscelesTriangleWithLineLength(StringBuilder builder, int number, int lineLength) {
        for (int index = 1; index <= number; index++) {
            appendCenterAsterisksInLine(builder, number - index + 1, lineLength);
        }
    }
}
