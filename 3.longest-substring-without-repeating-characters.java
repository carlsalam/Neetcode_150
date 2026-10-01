/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;

        int answer = 0;
        int windowLength = 0;

        HashSet<Character> seen = new HashSet<>();

        while (right < s.length()) {
            char c = s.charAt(right);
            if (!seen.contains(c)) {
                seen.add(c);
                right++;
                windowLength = seen.size();
                
                // if (windowLength > answer) {
                //     answer = windowLength;
                // }

                answer = Math.max(answer, windowLength);

            } else {
                seen.remove(s.charAt(left));
                left++;
            }
        }

        return answer;
    }
}
// @lc code=end

