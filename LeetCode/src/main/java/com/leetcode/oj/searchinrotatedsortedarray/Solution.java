package com.leetcode.oj.searchinrotatedsortedarray;

public class Solution {
    public int search(int[] A, int target) {
        int start = 0;
        int end = A.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == A[mid]) {
                return mid;
            } else if (start <= mid - 1 && A[start] <= A[mid - 1]) {
                if (target >= A[start] && target <= A[mid - 1]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (mid + 1 <= end && A[mid + 1] <= A[end]) {
                if (target >= A[mid + 1] && target <= A[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                return -1;
            }
        }
        return -1;
    }
}