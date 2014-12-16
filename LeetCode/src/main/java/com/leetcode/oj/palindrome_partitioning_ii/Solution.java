package com.leetcode.oj.palindrome_partitioning_ii;

public class Solution {
    public int minCut(String s) {
        int N = s.length();
        if (N < 2) {
            return 0;
        }
        int[] result = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            result[i] = i - 1;
        }
        for (int i = 0; i < N; ++i) {
            int left = i;
            int right = i;
            while (left >= 0 && right < N) {
                if (s.charAt(left) == s.charAt(right)) {
                    result[right + 1] = Math.min(result[right + 1], result[left] + 1);
                    left--;
                    right++;
                } else {
                    break;
                }
            }

            left = i;
            right = i + 1;
            while (left >= 0 && right < N) {
                if (s.charAt(left) == s.charAt(right)) {
                    result[right + 1] = Math.min(result[right + 1], result[left] + 1);
                    right++;
                    left--;
                } else {
                    break;
                }
            }
        }
        return result[N];
    }
}
