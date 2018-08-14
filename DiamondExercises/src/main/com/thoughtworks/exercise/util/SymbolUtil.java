package com.thoughtworks.exercise.util;

/**
 * Created by yxhuang on 09/06/2017.
 */
public class SymbolUtil {
    public static void appendCenterAsterisksInLine(StringBuilder builder, int asterisksNumber, int lineLength) {
        int blankNumber = lineLength - getNumberInArithmeticProgression(asterisksNumber);

        appendSymbols(builder, " ", blankNumber / 2);
        appendSymbols(builder, "*", getNumberInArithmeticProgression(asterisksNumber));
        appendSymbols(builder, " ", blankNumber / 2);
        shiftLine(builder);
    }

    public static int getNumberInArithmeticProgression(int index) {
        return 2 * index - 1;
    }

    public static void shiftLine(StringBuilder builder) {
        builder.append("\n");
    }

    private static void appendSymbols(StringBuilder builder, String symbol, int number) {
        for (int index = 1; index <= number; index++) {
            builder.append(symbol);
        }
    }
}
