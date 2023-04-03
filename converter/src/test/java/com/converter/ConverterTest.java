package com.converter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ConverterTest {
    @Test
    public void test4() {
        int number = 4;
        String expected = "IV";
        String actual = converter.toRoman(number);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test5() {
        int number = 5;
        String expected = "V";
        String actual = converter.toRoman(number);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test6() {
        int number = 6;
        String expected = "VI";
        String actual = converter.toRoman(number);
        assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        int number = 9;
        String expected = "IX";
        String actual = converter.toRoman(number);
        assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        int number = 10;
        String expected = "X";
        String actual = converter.toRoman(number);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test47() {
        int number = 47;
        String expected = "XLVII";
        String actual = converter.toRoman(number);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test789() {
        int number = 789;
        String expected = "DCCLXXXIX";
        String actual = converter.toRoman(number);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test3000() {
        int number = 3000;
        String expected = "MMM";
        String actual = converter.toRoman(number);
        assertEquals(expected, actual);
    }

    @Test
    public void test4000() {
        int number = 4000;
        String expected = "Invalid input";
        String actual = converter.toRoman(number);
        assertEquals(expected, actual);
    }
}