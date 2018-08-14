package com.thoughtworks.fizzbuzz.util;

import java.util.logging.Logger;

/**
 * Created by yxhuang on 08/06/2017.
 */
public class FizzBuzzCalculator {

    private static final Logger logger = Logger.getLogger(FizzBuzzCalculator.class.getName());


    public static String parseNumber(int number) throws Exception {
        examineInputNumber(number);
        return getFinalString(number, applyRule(number));
    }

    private static void examineInputNumber(int number) throws Exception {
        if (number <= 0) {
            logger.info("the number input is unreasonable");
            throw new Exception("the number input is unreasonable");
        }
    }

    private static String applyRule(int number) {
        String result = "";
        if (canBeExactDivided(number, 3)) {
            result += "Fizz";
        }
        if (canBeExactDivided(number, 5)) {
            result += "Buzz";
        }

        return result;
    }

    private static String getFinalString(int number, String result) {
        if (result.isEmpty()) {
            return String.valueOf(number);
        } else {
            return result;
        }
    }

    private static boolean canBeExactDivided(int number, int specialNumber) {
        return number % specialNumber == 0;
    }
}
