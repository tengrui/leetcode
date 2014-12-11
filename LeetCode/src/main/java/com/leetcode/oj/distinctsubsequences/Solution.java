package com.leetcode.oj.distinctsubsequences;

/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public int numDistinct(String S, String T) {
        int L = S.length();
        int N = T.length();

        if (L < N) {
            return 0;
        } else if (L == N) {
            return S.equals(T) ? 1 : 0;
        }

        int result = 0;
        char ct = T.charAt(0);
        String subT = T.substring(1);
        for (int j = 0; j < L - N + 1; ++j) {
            if (S.charAt(j) == ct) {
                if (subT.isEmpty()) {
                    ++result;
                } else {
                    result += numDistinct(S.substring(j + 1), subT);
                }
            }
        }
        return result;
    }
}