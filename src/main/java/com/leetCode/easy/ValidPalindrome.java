package com.leetCode.easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String formattedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int left =0;
        int right=formattedString.length()-1;
        while(left<right){
            if(formattedString.charAt(left)!=formattedString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
