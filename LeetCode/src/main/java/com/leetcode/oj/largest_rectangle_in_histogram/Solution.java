package com.leetcode.oj.largest_rectangle_in_histogram;

public class Solution {
    public int largestRectangleArea(int[] height) {
        int N = height.length;
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return height[0];
        }
        int min = 0;
        int index = 0;
        for (int i = 0; i < N; ++i) {
            if (min > height[i]) {
                min = height[i];
                index = i;
            }
        }
        int[] left = new int[index];
        for (int i = 0; i < index; ++i) {
            left[i] = height[i];
        }

        int[] right = new int[N - index - 1];
        for (int i = index + 1; i < N; ++i) {
            right[i - index - 1] = height[i];
        }

        int result = min * N;
        if (left.length != 0) {
            int l = largestRectangleArea(left);
            if (result < l) {
                result = l;
            }
        }
        if (right.length != 0) {
            int r = largestRectangleArea(right);
            if (result < r) {
                result = r;
            }
        }
        return result;
    }
}