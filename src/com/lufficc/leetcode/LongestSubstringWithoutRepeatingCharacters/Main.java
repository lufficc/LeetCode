package com.lufficc.leetcode.LongestSubstringWithoutRepeatingCharacters;

/**
 * Created by lufficc on 2016/10/23.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print(new Main().lengthOfLongestSubstring("aab"));
    }

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
