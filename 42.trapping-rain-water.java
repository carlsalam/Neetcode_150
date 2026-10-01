/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int answer = 0;

        int left = 0;
        int right = height.length - 1;

        int currentTallestLeft = height[left];
        int currentTallestRight = height[right];

        while (left < right) {

            if (currentTallestLeft <= currentTallestRight) {

                if (height[left + 1] >= currentTallestLeft) {
                    currentTallestLeft = height[left + 1];
                } else {
                    answer += (currentTallestLeft - height[left + 1]);
                }
                left++;

            } else {

                if (height[right - 1] >= currentTallestRight) {
                    currentTallestRight = height[right - 1];
                } else {
                    answer += (currentTallestRight - height[right - 1]);
                }
                right--;

            }
        }

        return answer;
    }
}
// @lc code=end

