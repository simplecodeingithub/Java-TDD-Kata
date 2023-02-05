package com.techreturners;

public class RomanNumeralsConverter {
    public String convert(int arabicnumber) {
        String[] symbol={"M","D","X","IV","III","I",};
        int[] values={1000,500,10,4,3,1};
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
