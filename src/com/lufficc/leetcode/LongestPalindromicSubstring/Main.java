package com.lufficc.leetcode.LongestPalindromicSubstring;

/**
 * Created by lufficc on 2016/10/27.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().longestPalindrome("aasbaa"));
    }

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty() || s.length() == 1)
            return s;
        String maxLengthStr = "";
        for (int i = 0; i < s.length() - 1; i++) {
            String s1 = longest(s, i, i);
            if (s1.length() > maxLengthStr.length())
                maxLengthStr = s1;
            String s2 = longest(s, i, i + 1);
            if (s2.length() > maxLengthStr.length())
                maxLengthStr = s2;

        }
        return maxLengthStr;
    }

    public String longest(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}
