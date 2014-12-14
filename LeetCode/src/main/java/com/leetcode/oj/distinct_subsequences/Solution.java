package com.leetcode.oj.distinct_subsequences;

public class Solution {
    public int numDistinct(String S, String T) {
        int L = S.length();
        int N = T.length();

        if (L < N) {
            return 0;
        } else if (L == N) {
            return S.equals(T) ? 1 : 0;
        }

        int [][] result = new int[N][L];

        char ct = T.charAt(0);
        int firstIndex = -1;
        for (int j = 0, counter = 0; j < L; ++j) {
            if (S.charAt(j) == ct) {
                ++counter;
                if (firstIndex == -1) {
                    firstIndex = j;
                }
            }
            result[0][j] = counter;
        }

        for (int i = 1; i < N; ++i) {
            ct = T.charAt(i);
            boolean find = false;
            for (int j = firstIndex, counter = 0; j < L; ++j) {
                if (S.charAt(j) == ct) {
                    counter = counter + result[i - 1][j - 1];
                    if (!find) {
                        firstIndex = j;
                        find = true;
                    }
                }
                result[i][j] = counter;
            }
            if (!find) {
                return 0;
            }
        }

        return result[N - 1][L - 1];
    }
}