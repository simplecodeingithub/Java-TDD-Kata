package com.techreturners;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanToNumber {
    private static Map<Character, Integer> roman_map = new HashMap<>();
    static {
        roman_map.put('I',1);
        roman_map.put('V',5);
        roman_map.put('X',10);
        roman_map.put('D',500);
    }

    public static int romanToInt(String roman){
      int result=0;
      for(int i=0;i<roman.length();i++){
          int value = roman_map.get(roman.charAt(i));
          if(i +1<roman.length() && roman_map.get(roman.charAt(i+1))>value){
              result -=value;
          }else{
              result +=value;
          }
      }
      return result;
    }

}
