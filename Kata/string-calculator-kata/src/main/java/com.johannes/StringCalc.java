package com.johannes;

import java.util.Arrays;

public class StringCalc {
    public int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        }
        String[] splittedNumbers = numbers.split("[,\n]");

        int[] negatives = Arrays.stream(splittedNumbers)
                .mapToInt(number -> Integer.parseInt(number))
                .filter(number -> number <= -1)
                .toArray();

        if (negatives.length >= 1) {
            throw new IllegalArgumentException("Negative numbers not allowed! " + negatives.toString());
        }

        int sum = Arrays.stream(splittedNumbers)
                .mapToInt(number -> Integer.parseInt(number))
                .filter(number -> number <= 1000)
                .sum();

        return sum;

    }
}