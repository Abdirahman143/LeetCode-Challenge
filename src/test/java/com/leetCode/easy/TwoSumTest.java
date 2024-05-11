package com.leetCode.easy;

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TwoSumTest {

       private  TwoSum solution ;
       private int target1 =9;
       private int target2 =6;
       private int arr1[]=new int[]{2,7,11,15};
       private int arr2[]=new int[]{3,2,4};
       private  int arr3[]=new int[]{3,3};
            @BeforeEach
        public void setUp(){
            solution  = new TwoSum();

        }


    @Test
    @Order(1)
    @DisplayName("TC: 1")
    public void testScenarioOne() {
        assertArrayEquals(new int[]{1, 0}, solution.twoSum(arr1, target1),
                "The indices of the elements that add up to 9 should be [1, 0].");

        }

    @Test
    @Order(2)
    @DisplayName("TC:2 ")
    public void testScenarioTwo() {
                int[]expected =new int[]{1,2};
                int[] actual =solution.twoSum(arr2,target1);
                assertFalse(Arrays.equals(expected,actual));
    }

    @Test
    @Order(3)
    @DisplayName("TC:3")
    public void testScenarioThree(){
                int [] expected =new int[]{0,1};
                int [] actual = solution.twoSum(arr3,target2);
                assertArrayEquals(expected,actual);
    }



        }
