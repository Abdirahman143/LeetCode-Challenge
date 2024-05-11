package com.leetCode.easy;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PalindromeNumberTest {
   private PalindromeNumber test;

   @BeforeEach
   public void setUp(){
       test=new PalindromeNumber();
   }

   @Test
   @DisplayName("Test Case: 1")
   public void testScenarioOne(){
       int number =121;
       assertTrue(test.isPalindrome(number));
   }

    @Test
    @DisplayName("Test Case: 2")
    public void testScenarioTwo(){
        int number =10;
        assertFalse(test.isPalindrome(number));
    }
    @Test
    @DisplayName("Test Case: 3")
    public void testScenarioThree(){
        int number =-121;
        assertFalse(test.isPalindrome(number));
    }

}
