package com.company;
import java.util.*;

/**
 * Created by hongruzh on 1/24/17.
 */
public class Leetcode448_findAll {

    public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> result = new ArrayList<Integer>();

    for(int i=0;i<nums.length;i++){
        if(nums[nums[i]-1]!=nums[i]){
            swap(nums,nums[i]-1,i);
            i--;//这个i--非常重要
        }
    }
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=i+1) result.add(i+1);
    }
    return result;
}

    public void swap(int[] nums,int i,int j){

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
