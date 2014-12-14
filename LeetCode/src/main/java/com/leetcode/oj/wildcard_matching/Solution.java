package com.leetcode.oj.wildcard_matching;

public class Solution {
    public boolean isMatch(String s, String p) {
        if ("*".equals(p)) {
            return true;
        }

        int L = s.length();
        int N = p.length();

        int patternWithoutStar = N;
        for (int i = 0; i < N; ++i) {
            if (p.charAt(i) == '*') {
                patternWithoutStar--;
            }
        }
        if (patternWithoutStar > L) {
            return false;
        }

        boolean[][] result = new boolean[N + 1][L + 1];

        result[0][0] = true;
        for (int i = 1; i < L; ++i) {
            result[0][i] = false;
        }

        int index = 0;
        for (int i = 0; i < N; ++i) {
            char c = p.charAt(i);
            boolean find = false;
            if (c == '*') {
                int j = index;
                while (j <= L) {
                    result[i + 1][j] = true;
                    j++;
                }
                find = true;
            } else {

                for (int j = index; j < L; ++j) {
                    char m = s.charAt(j);
                    if (c == '?' || c == m) {
                        if (result[i][j] == true) {
                            result[i + 1][j + 1] = true;
                            if (!find) {
                                find = true;
                                index = j + 1;
                            }
                        }
                    }
                }
            }
            if (!find) {
                return false;
            }
        }

        return result[N][L];
    }
}
