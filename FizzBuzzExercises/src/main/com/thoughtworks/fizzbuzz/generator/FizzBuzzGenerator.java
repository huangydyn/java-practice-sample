package com.thoughtworks.fizzbuzz.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static com.thoughtworks.fizzbuzz.util.FizzBuzzCalculator.parseNumber;

/**
 * Created by yxhuang on 08/06/2017.
 */
public class FizzBuzzGenerator {

    private static final Logger logger = Logger.getLogger(FizzBuzzGenerator.class.getName());

    public List<String> generateFizzBuzzStringList(int maxNumber) throws Exception {
        examineMaxNumber(maxNumber);

        return parseNumberInLoop(maxNumber);
    }

    private List<String> parseNumberInLoop(int maxNumber) {
        List<String> result = new ArrayList<>();
        try {
            for (int index = 1; index <= maxNumber; index++) {
                result.add(parseNumber(index));
            }
        } catch (Exception e) {
            return null;
        }
        return result;
    }

    private void examineMaxNumber(int maxNumber) throws Exception {
        if (maxNumber <= 0) {
            logger.info("the input maxNumber is unreasonable for the reason of less than 0");
            throw new Exception("the input maxNumber is unreasonable for the reason of less than 0");
        }
    }
}
