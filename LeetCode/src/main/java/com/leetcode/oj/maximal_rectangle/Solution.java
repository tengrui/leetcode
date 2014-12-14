package com.leetcode.oj.maximal_rectangle;

public class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        if (row == 0) {
            return 0;
        }
        int col = matrix[0].length;
        
        int[][] matrix2 = new int[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                matrix2[i][j] = matrix[i][j] - '0';
            }
        }
        
        int result = 0;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                // x0 = i, y0 = j
                if (matrix2[i][j] != 0) {
                    int index = 1;
                    for (int n = j; n < col; ++n) {
                        if (matrix2[i][n] != 0) {
                            if (index >= matrix2[i][n]) {
                                matrix2[i][n] = index;
                                if (result < index) {
                                    result = index;
                                }
                            }
                            index++;
                        } else {
                            break;
                        }
                    }
                    int newIndex = index;
                    for (int m = i + 1; m < row; ++m) {
                        index = 1;
                        if (matrix2[m][j] == 0) {
                            break;
                        }
                        for (int n = j; n < col; ++n) {
                            if (index < newIndex && matrix2[m][n] != 0) {
                                int temp = (n - j + 1) * (m - i + 1);
                                if (temp > matrix2[m][n]) {
                                    matrix2[m][n] = temp;
                                    if (result < temp) {
                                        result = temp;
                                    }
                                }
                                index++;
                            } else {
                                break;
                            }
                        }
                        newIndex = index;
                    }
                } else {
                    continue;
                }
            }
        }
        return result;
    }
}
