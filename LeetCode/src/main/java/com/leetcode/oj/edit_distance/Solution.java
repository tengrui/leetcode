package com.leetcode.oj.edit_distance;

public class Solution {
    public int minDistance(String word1, String word2) {
        int N1 = word1.length();
        int N2 = word2.length();
        int[][] result = new int[N1 + 1][N2 + 1];
        for (int i = 0; i <= N1; ++i) {
            result[i][0] = i;
        }
        for (int j = 0; j <= N2; ++j) {
            result[0][j] = j;
        }
        for (int i = 0; i < N1; ++i) {
            for (int j = 0; j < N2; ++j) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    result[i + 1][j + 1] = result[i][j];
                } else {
                    result[i + 1][j + 1] = Math.min(
                            Math.min(result[i][j + 1], result[i + 1][j]),
                            result[i][j]) + 1;
                }
            }
        }

        return result[N1][N2];
    }
}
