package com.leetcode.oj.largestrectangleinhistogram;

import java.util.Stack;

public class Solution {
    public int largestRectangleArea(int[] height) {
        if (height == null) {
            return -1;
        }
        
        int N = height.length;
        if (N == 0) {
            return 0;
        }
        
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        for (int i = 0; i < N; ++i) {
            if (i != N && (stack.isEmpty() || height[stack.peek()] <= height[i])) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && height[stack.peek()] > height[i]) {
                    int h = stack.pop();
                    int width = 1;
                    if (!stack.isEmpty()) {
                        width = i - (stack.peek() + 1);
                    } else {
                        width = i;
                    }
                    int temp = height[h] * width;
                    if (temp > result) {
                        result = temp;
                    }
                }
                stack.push(i);
            }
        }
        while (!stack.isEmpty()) {
            int h = stack.pop();
            int width = 1;
            if (!stack.isEmpty()) {
                width = N - (stack.peek() + 1);
            } else {
                width = N;
            }
            int temp = height[h] * width;
            if (temp > result) {
                result = temp;
            }
        }
        return result;
    }
}