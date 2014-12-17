package com.leetcode.oj.maximum_gap;


public class Solution {
    class Bucket{
        int max;
        int min;
        public Bucket(int min, int max){
            this.min = min;
            this.max = max;
        }
    }
    public int maximumGap(int[] num) {
        int N = num.length;
        if (N < 2) {
            return 0;
        }
        int min = num[0];
        int max = num[0];
        for (int i = 1; i < N; ++i) {
            int temp = num[i];
            if (min > temp) {
                min = temp;
            } else if (max < temp) {
                max = temp;
            }
        }
        int maxGap = max - min;
        int bucketLen = maxGap / (N - 1) + 1;
        int bucketNum = maxGap / bucketLen + 1;
        
        for (int i = 0; i < N; ++i) {
            
        }

        for (int i = 1; i < N; i++) {
            int temp = num[i] - num[i - 1];
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
