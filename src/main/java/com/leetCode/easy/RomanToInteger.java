package com.leetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> integerMap = new HashMap<>();
        integerMap.put('I',1);
        integerMap.put('V',5);
        integerMap.put('X',10);
        integerMap.put('L',50);
        integerMap.put('C',100);
        integerMap.put('D',500);
        integerMap.put('M',1000);
        int total =0;

        for(int i=0; i<s.length()-1;i++){
            int current = integerMap.get(s.charAt(i));
            int next = integerMap.get(s.charAt(i+1));
            if(current<next){
                total-=current;
            }else{
                total+=current;
            }

        }
        total+=integerMap.get(s.charAt(s.length()-1));
        return total;

    }
}
