package com.leetcode.oj.maximum_gap;

/**
 * Maximum Gap 
 * 
 * Given an unsorted array, find the maximum difference between the successive elements in its sorted form.
 * Try to solve it in linear time/space.
 * Return 0 if the array contains less than 2 elements.
 * You may assume all elements in the array are non-negative integers and fit in the 32-bit signed integer range.
 * 
 * Credits:
 * Special thanks to @porker2008 for adding this problem and creating all test cases.
 *
 * @author tengrui
 *
 */
public class Solution {

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

        int[] minBucket = new int[bucketNum];
        int[] maxBucket = new int[bucketNum];

        for (int i = 0; i < N; ++i) {
            int temp = num[i];
            int bn = (temp - min) / bucketLen;
            if (minBucket[bn] == 0) {
                minBucket[bn] = temp;
            } else {
                minBucket[bn] = minBucket[bn] > temp ? temp : minBucket[bn];
            }
            if (maxBucket[bn] == 0) {
                maxBucket[bn] = temp;
            } else {
                maxBucket[bn] = maxBucket[bn] < temp ? temp : maxBucket[bn];
            }
        }

        min = minBucket[0];
        max = maxBucket[0];
        maxGap = max - min;
        
        for (int i = 1; i < bucketNum; i++) {
            if (minBucket[i] == 0 && maxBucket[i] == 0) {
                continue;
            } else {
                int temp = minBucket[i] - max;
                if (temp > maxGap) {
                    maxGap = temp;
                }
                max = maxBucket[i];
            }
        }
        return maxGap;
    }
}
