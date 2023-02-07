package com.techreturners;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsConverter {

    private static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(3000, "MMM");
        map.put(2450, "MMCDL");
        map.put(2000, "MM");
        map.put(1950, "MCML");
        map.put(1000, "M");
        map.put(950, "CML");
        map.put(500, "D");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(2, "II");
        map.put(1, "I");

    }
    public String convertNumberToRoman(int arabicnumber) {
        if (arabicnumber < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }
        if (arabicnumber < 1 || arabicnumber > 3000) {
            throw new IllegalArgumentException("Input must be between 1 t0 3000");
        }

        StringBuilder result = new StringBuilder();
        int[] values = {3000, 2450, 2000, 1950, 1000, 950, 500, 100, 90, 50, 40, 10,9, 5, 4, 2, 1};
        for (int i = 0; i < values.length; i++) {
            while (arabicnumber >= values[i]) {
                result.append(map.get(values[i]));
                arabicnumber -= values[i];
            }
        }
        return result.toString();
    }
}
