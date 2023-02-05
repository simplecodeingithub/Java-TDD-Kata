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
    @Test
    public void convertThreeToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("III",romanNumeralsConverter.convert(3));
    }
    @Test
    public void convertfourToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("IV",romanNumeralsConverter.convert(4));
    }
    @Test
    public void convertTenToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("X",romanNumeralsConverter.convert(10));
    }
}
