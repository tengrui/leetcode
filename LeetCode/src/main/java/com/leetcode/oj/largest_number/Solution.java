package com.leetcode.oj.largest_number;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String largestNumber(int[] num) {
        int N = num.length;
        String[] strNum = new String[N];
        for (int i = 0; i < N; ++i) {
            strNum[i] = String.valueOf(num[i]);
        }
        Arrays.sort(strNum, new Comparator<String>() {
            public int compare(String object1, String object2) {
                int N1 = object1.length();
                int N2 = object2.length();
                
                int Min = N1 < N2 ? N1 : N2;
                int i = 0;
                while (i < Min) {
                    if (object1.charAt(i) < object2.charAt(i)) {
                        return -1;
                    } else if (object1.charAt(i) > object2.charAt(i)) {
                        return 1;
                    }
                    ++i;
                }
                
                if (N1 < N2) {
                    String sub = object2.substring(Min);
                    return compare(object1, sub);
                } else if (N1 > N2) {
                    String sub = object1.substring(Min);
                    return compare(sub, object2);
                } else {
                    return 0;
                }
            }});
        StringBuilder sb = new StringBuilder();
        for (int i = N; i > 0; --i) {
            sb.append(strNum[i - 1]);
        }
        if (sb.toString().charAt(0) == '0') {
            return "0";
        } else {
            return sb.toString();
        }
    }
}