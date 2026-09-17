/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> seen = new HashMap<>();

        for(int i = 0; i < s.length(); i++ ){
            seen.put(s.charAt(i), seen.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++ ){
            seen.put(t.charAt(i), seen.getOrDefault(t.charAt(i), 0) - 1);

            if (seen.get(t.charAt(i)) < 0) {
                return false;
            }
        }

       return true;
    }
}
// @lc code=end

