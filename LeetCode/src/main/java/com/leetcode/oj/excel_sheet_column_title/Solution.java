package com.leetcode.oj.excel_sheet_column_title;

public class Solution {
    public String convertToTitle(int n) {
        if (n <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int temp = (--n) % 26;
            n /= 26;
            char x = (char)('A' + temp); 
            sb.insert(0, x);
        }
        return sb.toString();
    }
}
