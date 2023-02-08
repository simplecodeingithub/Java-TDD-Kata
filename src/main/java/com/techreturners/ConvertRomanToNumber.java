package com.techreturners;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanToNumber {
    private static Map<Character, Integer> roman_map = new HashMap<>();
    static {
        roman_map.put('I',1);
        roman_map.put('V',5);
        roman_map.put('X',10);
        roman_map.put('C',100);
        roman_map.put('D',500);
        roman_map.put('M',1000);

    }
    public static int romanToInt(String str){
        if(str == null || str.length()==0){
            throw new IllegalArgumentException("Input cannot be negative");
        }
      int result=0;
      for(int i=0;i<str.length();i++){
          int curr = roman_map.get(str.charAt(i));//get the integer value for the current character
          int next=i+1< str.length() ? roman_map.get(str.charAt(i+1)):0;//get the integer value for the next char or set it to 0 if there is no next char
          if(curr>=next){
              result +=curr;
          }else{
              result -=curr;
          }
      }
      return result;
    }

}
