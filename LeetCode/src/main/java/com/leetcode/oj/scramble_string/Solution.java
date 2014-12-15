package com.leetcode.oj.scramble_string;

import java.util.Arrays;


public class Solution {
    public boolean isScramble(String s1, String s2) {
        int N = s1.length();
        if (N != s2.length()) {
            return false;
        } else if (s1.equals(s2)) {
            return true;
        }
        
        for (int i = 1; i < N ; ++i) {
            String x1 = s1.substring(0, i);
            String x2 = s1.substring(i);
            
            String x3 = s2.substring(0, i);
            String x4 = s2.substring(N - i);
            if (isSimilar(x1, x3)) {
                String x5 = s2.substring(i);
                return (isScramble(x1, x3) && isScramble(x2, x5));
            } else if (isSimilar(x1, x4)){
                String x5 = s2.substring(0, N - i);
                return (isScramble(x1, x4) && isScramble(x2, x5));
            }
        }
        
        return false;
    }
    public boolean isSimilar(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        if (c1.length != c2.length) {
            return false;
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; ++i) {
            if (c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    }
}
