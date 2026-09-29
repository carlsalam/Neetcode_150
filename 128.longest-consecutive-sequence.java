/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int answer = 1;
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(!seen.contains(nums[i])){
                seen.add(nums[i]);
            }
        }

        for (Integer integer : seen) {
            if (!seen.contains(integer - 1)) {
                int current = integer;
                int length = 1; 
                while (seen.contains(current + 1)) {
                    current++;
                    length++;
                }

                if (answer < length) {
                    answer = length;
                }
            }
        }

        return answer;
    }
}
// @lc code=end

