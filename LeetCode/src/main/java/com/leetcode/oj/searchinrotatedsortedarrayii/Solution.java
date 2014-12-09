package com.leetcode.oj.searchinrotatedsortedarrayii;

public class Solution {
    public boolean search(int [] A, int target) {
        int start = 0;
        int end = A.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == A[mid]) {
                return true;
            } else {
                int left = mid - 1;
                int right = mid + 1;
                while (left >= start && A[mid] == A[left]) {
                    left--;
                }
                while (right <= end && A[mid] == A[right]) {
                    right++;
                }

                if (left < start && right > end) {
                    return false;
                } else if (left < start) {
                    start = right;
                } else if (right > end) {
                    end = left;
                } else if (A[start] <= A[left]) {
                    if (target >= A[start] && target <= A[left]) {
                        end = left;
                    } else {
                        start = right;
                    }
                } else if (A[right] <= A[end]) {
                    if (target >= A[right] && target <= A[end]) {
                        start = right;
                    } else {
                        end = left;
                    }
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}