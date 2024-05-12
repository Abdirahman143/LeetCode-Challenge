package com.leetCode.easy;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LongestCommonPrefixTest {

private LongestCommonPrefix longestCommonPrefix ;

@BeforeEach
    public void setUp(){
    longestCommonPrefix = new LongestCommonPrefix();
}

    @Test
    @DisplayName("Test case : 1")
    @Order(1)
public void testScenarioOne(){
    String input[]={"flower","flow","flight"};
    String expected ="fl";
    String actual = longestCommonPrefix.longestCommonPrefix(input);
    assertEquals(expected,actual);
}
    @Test
    @DisplayName("Test case : 2")
    @Order(2)
    public void testScenarioTwo(){
        String input[]={"dog","racecar","car"};
        String expected ="";
        String actual = longestCommonPrefix.longestCommonPrefix(input);
        assertEquals(expected,actual);
    }

}
