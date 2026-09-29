/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int num = numbers[left] + numbers[right];

            if (num == target) {
                return new int[]{left + 1, right + 1};
            }

            if (num > target) {
                right--;
            } else {
                left++;
            }
        }


        return new int[]{0, 0};
    }
}
// @lc code=end

