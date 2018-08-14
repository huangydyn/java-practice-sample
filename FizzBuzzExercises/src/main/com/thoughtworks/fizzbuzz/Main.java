package com.thoughtworks.fizzbuzz;

import com.thoughtworks.fizzbuzz.generator.FizzBuzzGenerator;

import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(FizzBuzzGenerator.class.getName());

    public static void main(String[] args) {
        FizzBuzzGenerator generator = new FizzBuzzGenerator();
        try {
            generator.generateFizzBuzzStringList(100).forEach(System.out::println);
        } catch (Exception e) {
            logger.info("wrong input for FizzBuzzGenerator");
        }
    }
}
