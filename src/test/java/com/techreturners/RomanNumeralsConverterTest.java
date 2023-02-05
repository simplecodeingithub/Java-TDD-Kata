package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {
   @Test
    public void convertoneToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("I",romanNumeralsConverter.convert(1));
    }
    @Test
    public void convertTwoToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("II",romanNumeralsConverter.convert(2));
    }
}
