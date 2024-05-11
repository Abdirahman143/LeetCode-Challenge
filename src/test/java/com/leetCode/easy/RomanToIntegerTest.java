package com.leetCode.easy;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RomanToIntegerTest {

    RomanToInteger roman ;


    @BeforeEach
    public void setUp(){
        roman = new RomanToInteger();
    }

    @Test
    @Order(1)
    @DisplayName("Test case : 1")
    public void testScenarioOne(){
        String input ="III";
        int expected =3;
        assertEquals(expected,roman.romanToInt(input));
    }
    @Test
    @Order(2)
    @DisplayName("Test case : 2")
    public void testScenarioTwo(){
        String input ="MCMXCIV";
        int expected =1994;
        assertEquals(expected,roman.romanToInt(input));
    }
    @Test
    @Order(3)
    @DisplayName("Test case : 3")
    public void testScenarioThree(){
        String input ="LVIII";
        int expected =58;
        assertEquals(expected,roman.romanToInt(input));
    }
}
