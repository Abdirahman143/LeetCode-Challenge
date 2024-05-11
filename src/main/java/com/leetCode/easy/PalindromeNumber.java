package com.leetCode.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int original =x;
        int reversed =0;

        while(original!=0){
            int lastDigit =original%10;
            reversed =reversed*10+lastDigit;
            original/=10;
        }
        return x==reversed;
    }

}
