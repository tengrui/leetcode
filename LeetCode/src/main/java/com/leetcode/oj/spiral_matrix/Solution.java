package com.leetcode.oj.spiral_matrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int [][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int n = matrix.length;
        if (n == 0) {
            return result;
        }

        int m = matrix[0].length;

        int x1 = 0, y1 = 0;
        int x2 = n - 1, y2 = m - 1;

        while (x1 <= x2 && y1 <= y2) {
            for (int i = y1; i <= y2; ++i) {
                result.add(matrix[x1][i]);
            }
            if (++x1 > x2) {
                break;
            }

            for (int i = x1; i <= x2; ++i) {
                result.add(matrix[i][y2]);
            }
            if (--y2 < y1) {
                break;
            }

            for (int i = y2; i >= y1; --i) {
                result.add(matrix[x2][i]);
            }
            if (--x2 < x1) {
                break;
            }

            for (int i = x2; i >= x1; --i) {
                result.add(matrix[i][y1]);
            }
            if (++y1 > y2) {
                break;
            }
        }
        return result;
    }
}