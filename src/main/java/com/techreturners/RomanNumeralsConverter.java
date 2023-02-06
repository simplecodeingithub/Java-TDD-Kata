package com.techreturners;

public class RomanNumeralsConverter {
    public String convert(int arabicnumber) {
        if(arabicnumber < 1 || arabicnumber > 1000){
            throw new IllegalArgumentException("Input must be between 1 t0 1000");
        }
        if(arabicnumber < 0){
            throw new IllegalArgumentException("Input cannot be negative");
        }

        String[] symbol={"M","D","C","L","XL","X","IV","III","II","I"};
        int[] values={1000,500,100,50,40,10,4,3,2,1};

        StringBuilder result=new StringBuilder();
        for(int i=0;i<values.length;i++){
            while (arabicnumber>=values[i]){
                result.append(symbol[i]);
                arabicnumber -= values[i];
            }
        }
        return result.toString();
    }
}
