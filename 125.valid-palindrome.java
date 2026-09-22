/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;

        String newS = s.toLowerCase();

        while (left < right) {
            if (!Character.isLetterOrDigit(newS.charAt(left))) {
                left++;
                continue;
            } 
            if (!Character.isLetterOrDigit(newS.charAt(right))) {
                right--;
                continue;
            } 
            if (newS.charAt(left) != newS.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
// @lc code=end

