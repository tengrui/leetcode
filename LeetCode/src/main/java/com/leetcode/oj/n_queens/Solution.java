package com.leetcode.oj.n_queens;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<String []> solveNQueens(int n) {
        List<String []> result = new ArrayList<String []>();

        String [] template = new String[n];
        for (int i = 0; i < n; ++i) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; ++j) {
                if (j == i) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            template[i] = sb.toString();
        }

        Stack<Integer> stack = new Stack<Integer>();
        Set<Integer> xSet = new HashSet<Integer>();
        Set<Integer> ySet = new HashSet<Integer>();
        Set<Integer> addSet = new HashSet<Integer>();
        Set<Integer> subSet = new HashSet<Integer>();

        for (int i = 0; i < n; ++i) {
            for (int x = 0; x < n; ++x) {
                
                for (int y = 0; y < n; ++y) {
                    // get a (x, y)
                    if (!xSet.contains(x) && !ySet.contains(y) && !addSet.contains(x + y) && !subSet.contains(x - y)) {
                        stack.push(y);
                        xSet.add(x);
                        ySet.add(y);
                        addSet.add(x + y);
                        subSet.add(x - y);
                        break;
                    } 
                }
                if (stack.size() == x) {
                    break;
                }
            }
            if (stack.size() == n) {
                String [] s = new String[n];
                int index = 0;
                for (Integer line : stack) {
                    s[index++] = template[line];
                }
                result.add(s);
            }
        }

        return result;
    }
}