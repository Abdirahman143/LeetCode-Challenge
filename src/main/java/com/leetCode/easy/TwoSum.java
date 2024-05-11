package com.leetCode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 *input
 * output
 * logic/pseudo code
 * 1. create map
 * 2. loop
 * 3. declare var hold current element
 * 4. I get the diff between target and each element
 * 5. check if the map key contains the element
 * if it contains then return the index, compliment index
 * if not then push the key to the map for subsequent checks
 * test
 * run you test
 *
 *
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer>addTarget =new HashMap<>();
        for(int i=0 ; i<nums.length; i++){
            int current =nums[i];
            int compliment = target-current;
            if(addTarget.containsKey(compliment)){
                return new int[]{i,addTarget.get(compliment)};
            }
            addTarget.put(current,i);
        }
        return new int[]{};
    }





}
