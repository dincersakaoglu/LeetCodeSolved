package com.dangercode.leetcodesolved;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;

/**
 * Given an array of integers, return indices of the two numbers such that
 * they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and
 * you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] firstIntArray = new int[]{2,7,11,15};
        int firstTarget = 9;
        System.out.println(Arrays.toString(ts.twoSum(firstIntArray, firstTarget)));

    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> foundSet = new HashMap<>();

        return IntStream.range(0, nums.length)
                .mapToObj(i -> {
                    Integer now = nums[i];
                    Integer lookingFor = target - now;
                    if (foundSet.containsKey(lookingFor)) {
                        return new int[]{foundSet.get(lookingFor), i};
                    } else {
                        foundSet.put(now, i);
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .findFirst()
                .orElse(new int[2]);
    }




//  public int[] twoSum(int[] nums,int target){
//      Map<Integer,Integer> foundSet = new HashMap<>();
//
//      int[] returns = new int[2];
//
//      for(int i = 0 ; i< nums.length;i++){
//          Integer now = nums[i];
//          Integer lookingFor = target-now;
//          if(foundSet.containsKey(lookingFor)){
//              returns[0]= foundSet.get(lookingFor);
//              returns[1] = i;
//              return returns;
//          }
//          else{
//              foundSet.put(now,i);
//          }
//      }
//        return returns;
//
//  }

}
