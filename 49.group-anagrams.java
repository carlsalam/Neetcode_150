/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            // logique pr sort chq mots du array de string
            char[] letters = strs[i].toCharArray();
            Arrays.sort(letters);
            String word = new String(letters);

            if(!groups.containsKey(word)){
                groups.put(word, new ArrayList<String>());
            }
                groups.get(word).add(strs[i]);

        }

        System.out.println(groups);

        List<List<String>> answer = new ArrayList<>(groups.values());

    
        return answer;
    }
}
// @lc code=end

