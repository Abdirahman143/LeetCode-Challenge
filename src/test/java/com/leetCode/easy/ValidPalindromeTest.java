package com.leetCode.easy;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ValidPalindromeTest {
    private ValidPalindrome palindrome;

    @BeforeEach
    public void setUp(){
        palindrome = new ValidPalindrome();
    }

    @Test
    @DisplayName("Test case : 1")
    public void testScenarioOne(){
        String input ="A man, a plan, a canal: Panama";
        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    @DisplayName("Test case : 2")
    public void testScenarioThree(){
        String input ="race a car";
        assertFalse(palindrome.isPalindrome(input));
    }
    @Test
    @DisplayName("Test case : 3")
    public void testScenarioTwo(){
        String input =" ";
        assertTrue(palindrome.isPalindrome(input));
    }
}
