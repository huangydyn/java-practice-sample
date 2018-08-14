package com.thoughtworks.exercise;

import static com.thoughtworks.exercise.calculator.PrimeFactorCalculator.getPrimeFactor;

public class Processor {

    public static void main(String[] args) {
        processPrintPrimeFactorOf1();
        processPrintPrimeFactorOf30();
    }

    private static void processPrintPrimeFactorOf1() {
        System.out.println("print prime factor of number 0");
        System.out.println(getPrimeFactor(1));
        System.out.println("******************************");
    }

    private static void processPrintPrimeFactorOf30() {
        System.out.println("print prime factor of number 30");
        System.out.println(getPrimeFactor(30));
        System.out.println("******************************");
    }
}
