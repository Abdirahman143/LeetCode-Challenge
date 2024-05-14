package com.leetCode.easy;

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RemoveDuplicatesFromSortedArrayTest {

    public RemoveDuplicatesFromSortedArray sortedArray ;
    @BeforeEach
    public void setUp(){
        sortedArray = new RemoveDuplicatesFromSortedArray();

    }

    @Test
    @Order(1)
    @DisplayName("Test Case: 1")
    public void testScenarioOne(){
        int []input = new int[]{1,1,2};
        int [] expected = new int[]{1,2};
        int k = sortedArray.removeDuplicates(input);
        System.out.println(k);

        //assert
        assertEquals(expected.length,k);


        //
        int[]actual = Arrays.copyOf(input,k);
        assertArrayEquals(expected,actual);


    }

    @Test
    @Order(2)
    @DisplayName("Test Case: 2")
    public void testScenarioTwo(){
        int []input = new int[]{0,0,1,1,1,2,2,3,3,4};
        int [] expected = new int[]{0,1,2,3,4};
        int k = sortedArray.removeDuplicates(input);
        System.out.println(k);

        //assert
        assertEquals(expected.length,k);


        //
        int[]actual = Arrays.copyOf(input,k);
        assertArrayEquals(expected,actual);
    }
}
