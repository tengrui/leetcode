package com.leetcode.oj.nqueensii;

import java.util.HashSet;
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
    public int totalNQueens(int n) {
        int result = 0;

        Stack<Integer> stack = new Stack<Integer>();

        Set<Integer> xSet = new HashSet<Integer>();
        Set<Integer> ySet = new HashSet<Integer>();
        Set<Integer> addSet = new HashSet<Integer>();
        Set<Integer> subSet = new HashSet<Integer>();

        int x = 0;
        int y = 0;
        while (x < n && x >= 0) {
            for (; y < n; ++y) {
                if (!xSet.contains(x) && !ySet.contains(y)
                        && !addSet.contains(x + y) && !subSet.contains(x - y)) {

                    xSet.add(x);
                    ySet.add(y);
                    addSet.add(x + y);
                    subSet.add(x - y);

                    stack.push(y);
                    x++;

                    y = 0;
                    break;
                }
            }

            if (y == n) {
                x--;
                if (x < 0) {
                    break;
                }
                y = stack.pop();
                xSet.remove(x);
                ySet.remove(y);
                addSet.remove(x + y);
                subSet.remove(x - y);
                y++;
            } else if (stack.size() == n) {
                result++;
                x--;
                y = stack.pop();
                xSet.remove(x);
                ySet.remove(y);
                addSet.remove(x + y);
                subSet.remove(x - y);
                y++;
            }
        }

        return result;
    }
}