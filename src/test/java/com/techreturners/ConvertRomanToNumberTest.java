package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertRomanToNumberTest {
    @Test
    public void RomanItooneTest(){
        ConvertRomanToNumber convertNumberToRoman=new ConvertRomanToNumber();
        assertEquals(1,convertNumberToRoman.romanToInt("I"));
    }
    @Test
    public void RomantoTenTest(){
        ConvertRomanToNumber convertNumberToRoman=new ConvertRomanToNumber();
        assertEquals(10,convertNumberToRoman.romanToInt("X"));
    }
    @Test
    public void RomantoNintyTest(){
        ConvertRomanToNumber convertNumberToRoman=new ConvertRomanToNumber();
        assertEquals(90,convertNumberToRoman.romanToInt("XC"));
    }
}
