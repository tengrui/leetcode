package com.leetcode.oj.interleavingstring;

public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1 == null || s2 == null || s3 == null) {
            return false;
        }
        int N1 = s1.length();
        int N2 = s2.length();
        int N3 = s3.length();
        
        if (N1 == 0) {
            return s3.equals(s2);
        }
        if (N2 == 0) {
            return s3.equals(s1);
        }
        if (N1 + N2 != N3) {
            return false;
        }
        
        int i = 0, j = 0, k = 0;
        while (i < N3) {
            char c3 = s3.charAt(i);
            char c1 = j < N1 ? s1.charAt(j) : '\0';
            char c2 = k < N2 ? s2.charAt(k) : '\0';
            
            if (c3 == c1 && c3 == c2) {
                break;
            } else if (c3 == c1) {
                j++;
            } else if (c3 == c2) {
                k++;
            } else {
                return false;
            }
            ++i;
        }
        
        int m = N1, n = N2, p = N3;
        while (p > 0) {
            char c3 = s3.charAt(p - 1);
            char c1 = m > 0 ? s1.charAt(m - 1) : '\0';
            char c2 = n > 0 ? s2.charAt(n - 1) : '\0';
            
            if (c3 == c1 && c3 == c2) {
                if (i + 1 >= p - 1) {
                    return true;
                }
                String newS3 = s3.substring(i + 1, p - 1);
                boolean result = false;
                if (j <= m - 1 && k + 1 <= n) {
                    result |= isInterleave(s1.substring(j, m - 1), s2.substring(k + 1, n), newS3);
                }
                
                if (j <= m && k + 1 <= n - 1) {
                    result |= isInterleave(s1.substring(j, m), s2.substring(k + 1, n - 1), newS3);
                }
                
                if (j + 1 <= m && k <= n - 1) {
                    result |= isInterleave(s1.substring(j + 1, m), s2.substring(k, n - 1), newS3);
                }
                
                if (j + 1 <= m - 1 && k <= n) {
                    result |= isInterleave(s1.substring(j + 1, m - 1), s2.substring(k, n), newS3);
                }
                return result;
            } else if (c3 == c1) {
                m--;
            } else if (c3 == c2) {
                n--;
            } else {
                return false;
            }
            --p;
        }
        
        return true;        
    }
}
