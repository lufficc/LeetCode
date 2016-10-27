package com.lufficc.leetcode.LongestSubstringWithoutRepeatingCharacters;

/**
 * Created by lufficc on 2016/10/23.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print(new Main().lengthOfLongestSubstring("aab"));
    }

    /**
     * Given a string, find the length of the longest substring without repeating characters.

     Examples:

     Given "abcabcbb", the answer is "abc", which the length is 3.

     Given "bbbbb", the answer is "b", with the length of 1.

     Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

     Subscribe to see which companies asked this question
     */

    public int lengthOfLongestSubstring(String s) {
        int begin = 0, max = 0, i = 0;
        boolean[] set = new boolean[1 << 8];
        for (char c : s.toCharArray()) {
            while (set[c]) set[s.charAt(begin++)] = false;
            set[c] = true;
            max = Math.max(max, ++i - begin);
        }

        return max;
    }
}
