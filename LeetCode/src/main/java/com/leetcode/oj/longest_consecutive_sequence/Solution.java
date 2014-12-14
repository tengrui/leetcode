package com.leetcode.oj.longest_consecutive_sequence;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestConsecutive(int[] num) {
        Map<Integer, Integer> left = new HashMap<Integer, Integer>();
        Map<Integer, Integer> right = new HashMap<Integer, Integer>();
        int N = num.length;
        for (int i = 0; i < N; ++i) {
            int x = num[i];
            if (!left.containsKey(x) && !right.containsKey(x)) {
                if (!left.containsKey(x - 1) && !right.containsKey(x + 1)) {
                    left.put(x - 1, x + 1);
                    right.put(x + 1, x - 1);
                }
            } else if (!left.containsKey(x)) {
                int key = right.get(x);
                if (!right.containsKey(x + 1)) {
                    left.put(key, x + 1);
                    right.remove(x);
                    right.put(x + 1, key);
                }
            } else if (!right.containsKey(x)) {
                int key = left.get(x);
                if (!left.containsKey(x - 1)) {
                    right.put(key, x - 1);
                    left.remove(x);
                    left.put(x - 1, key);
                }
            } else {
                int max = left.get(x);
                int min = right.get(x);

                left.remove(x);
                left.put(min, max);

                right.remove(x);
                right.put(max, min);
            }
        }
        int result = 1;
        for (int k : left.keySet()) {
            int temp = left.get(k) - k;
            if (result < temp) {
                result = temp;
            }
        }

        return result - 1;
    }
}