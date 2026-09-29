/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int answ = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int currHeight = Math.min(height[left], height[right]);
            int currLength = (right - left);

            int water = currHeight * currLength;

            if (water > answ) {
                answ = water;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return answ;
    }
}
// @lc code=end

