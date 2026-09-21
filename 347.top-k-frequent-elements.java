/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


class Solution {
    public int[] topKFrequent(int[] nums, int k) {        
        // 1 count frequencies
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!count.containsKey(nums[i])) {
                count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            }
            else {
                count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            }
        }

        // 2 bucket : index = freq
        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (int num : count.keySet()) {
            int freq = count.get(num);

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }
        
        // 3 start from hihest freq. basically go through bucket backwards
        int[] answer = new int[k];
        int j = 0;

        for (int freq = nums.length; freq >= 1; freq--) {
            if (buckets[freq] != null) {
                for (int num : buckets[freq]) {
                    answer[j++] = num;

                    if (j == k) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}
// @lc code=end

