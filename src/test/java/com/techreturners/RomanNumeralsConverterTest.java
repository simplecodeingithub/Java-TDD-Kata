package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    @Test
    public void convertfourtyToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("XL",romanNumeralsConverter.convert(40));
    }
    @Test
    public void convertfiftyToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("L",romanNumeralsConverter.convert(50));
    }
    @Test
    public void convertHundredToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("C",romanNumeralsConverter.convert(100));
    }
    @Test
    public void convertfiveHundredToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("D",romanNumeralsConverter.convert(500));
    }
    @Test
    public void convertThousandToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("M",romanNumeralsConverter.convert(1000));
    }

    @Test
    public void InvalidInput()
   {
       try{
           RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
           romanNumeralsConverter.convert(2500);
           fail("Should have thrown exception");
       }catch (IllegalArgumentException e){
           assertEquals("Input must be between 1 t0 1000",e.getMessage());
       }
   }
    @Test
    public void ConvertForNegativeInput()
    {
        try{
            RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
            romanNumeralsConverter.convert(-1);
            fail("Should have thrown exception");
        }catch (IllegalArgumentException e){
            assertEquals("Input must be between 1 t0 1000",e.getMessage());
        }
    }
}
