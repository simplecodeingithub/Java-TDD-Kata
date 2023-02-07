package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsConverterTest {
   @Test
    public void convertoneToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("I",romanNumeralsConverter.convertNumberToRoman(1));
    }
    @Test
    public void convertTwoToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("II",romanNumeralsConverter.convertNumberToRoman(2));
    }

    @Test
    public void convertfourToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("IV",romanNumeralsConverter.convertNumberToRoman(4));
    }
    @Test
    public void convertTenToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("X",romanNumeralsConverter.convertNumberToRoman(10));
    }
    @Test
    public void convertfourtyToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("XL",romanNumeralsConverter.convertNumberToRoman(40));
    }
    @Test
    public void convertfiftyfiveToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("LV",romanNumeralsConverter.convertNumberToRoman(55));
    }
    @Test
    public void convertfiftyToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("L",romanNumeralsConverter.convertNumberToRoman(50));
    }

    @Test
    public void convertNiftyNineToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("XCIX",romanNumeralsConverter.convertNumberToRoman(99));
    }
    @Test
    public void convertHundredToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("C",romanNumeralsConverter.convertNumberToRoman(100));
    }
    @Test
    public void convertfiveHundredToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("D",romanNumeralsConverter.convertNumberToRoman(500));
    }
    @Test
    public void convertThousandToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("M",romanNumeralsConverter.convertNumberToRoman(1000));
    }
    @Test
    public void convertThreeThousandToNumerals(){
        RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
        assertEquals("MMM",romanNumeralsConverter.convertNumberToRoman(3000));
    }

    @Test
    public void InvalidInput()
   {
       try{
           RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
           romanNumeralsConverter.convertNumberToRoman(3500);
           fail("Should have thrown exception");
       }catch (IllegalArgumentException e){
           assertEquals("Input must be between 1 t0 3000",e.getMessage());
       }
   }
    @Test
    public void ConvertForNegativeInput()
    {
        try{
            RomanNumeralsConverter romanNumeralsConverter=new RomanNumeralsConverter();
            romanNumeralsConverter.convertNumberToRoman(-15);
            fail("Should have thrown exception");
        }catch (IllegalArgumentException e){
            assertEquals("Input cannot be negative",e.getMessage());
        }
    }
}
