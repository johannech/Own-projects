package com.johannes;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalcTest {
    StringCalc StringCalc = new StringCalc();

    @Test
    public void add_GivenNoNumbers_ShouldReturn0() {
        int returnNumber = StringCalc.add("");
        assertEquals(0, returnNumber);
    }

    @Test
    public void add_GivenOneNumber_ShouldReturnThatNumber() {
        int returnNumber = StringCalc.add("5");
        assertEquals(5, returnNumber);
    }

    @Test
    public void add_GivenOneOrMultipleNumbers_ShouldReturnSumOfNumbers() {
        int returnNumber = StringCalc.add("1,3");
        assertEquals(4, returnNumber);
    }

    @Test
    public void add_GivenAnUnknownAmountOfNumbers_ShouldReturnSumOfNumbers() {
        int returnNumber = StringCalc.add("1,4,6,9");
        assertEquals(20, returnNumber);
    }

    @Test
    public void add_GivenMultipleNumbersWithNewlines_ShouldReturnSumOfNumbers() {
        int returnNumber = StringCalc.add("1\n4,5");
        assertEquals(10, returnNumber);
    }

    @Test (expected = IllegalArgumentException.class)
    public void add_GivenANegativeNumber_ShouldReturnMinusOneAndThrowException() {
        StringCalc.add("1,2,-1");
    }

    @Test
    public void add_GivenNumbersIncludingANumberBiggerThan1000_ShouldReturnSumAndIgnoreNumberBiggerThan1000() {
        int returnNumber = StringCalc.add("1,4,1001,1000");
        assertEquals(1005, returnNumber);
    }
}