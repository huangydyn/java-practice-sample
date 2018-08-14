package com.thoughtworks.exercise.calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by yxhuang on 08/06/2017.
 */
public class PrimeFactorCalculator {

    public static List<Integer> getPrimeFactor(int number) {
        if (number <= 0) {
            return Collections.emptyList();
        }

        List<Integer> primeFactors = new ArrayList<>();

        for (int index = 2; index < number; index++) {
            if (canBeExactDivided(number, index) && isPrimeNumber(index)) {
                primeFactors.add(index);
            }
        }
        return primeFactors;
    }

    private static boolean canBeExactDivided(int number, int dividingNumber) {
        return number % dividingNumber == 0;
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }

        for (int index = 2; index < number / 2; index++) {
            if (canBeExactDivided(number, index)) {
                return false;
            }
        }
        return true;
    }

}
