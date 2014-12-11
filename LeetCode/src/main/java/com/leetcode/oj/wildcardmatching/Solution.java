package com.leetcode.oj.wildcardmatching;

public class Solution {
    public boolean isMatch(String s, String p) {
        if ("*".equals(p)) {
            return true;
        }

        int L = s.length();
        int N = p.length();
        boolean [][] result = new boolean[N + 1][L + 1];

        result[0][0] = true;
        for (int i = 1; i < L; ++i) {
            result[0][i] = false;
        }

        int index = 0;
        for (int i = 0; i < N; ++i) {
            char c = p.charAt(i);
            boolean find = false;
            for (int j = index; j < L; ++j) {
                if (c == '?' || c == s.charAt(index)) {
                    if (result[i][index] == true) {
                        result[i + 1][index + 1] = true;
                    }
                    if (!find) {
                        find = true;
                        index++;
                    }
                } else if (c == '*') {
                    result[i + 1][j + 1] = true;
                }
            }
        }

        return result[N][L];
    }
}
