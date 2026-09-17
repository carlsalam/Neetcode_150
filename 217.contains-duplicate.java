/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(seen.contains(nums[i])){
                return true;
            }
            seen.add(nums[i]);
        }   

        return false;


        // int n = nums.length;
        // for(int i = 0;i< n; i++ ){
        //     for(int j = i+1; j< n; j++)
        //     {
        //         if(nums[i] == nums[j])
        //             {
        //                 return true;
        //             }
        //     }
        // }
        // return false;
    }
}
// @lc code=end

