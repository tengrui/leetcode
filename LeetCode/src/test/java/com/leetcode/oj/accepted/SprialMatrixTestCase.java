package com.leetcode.oj.accepted;

import java.util.List;

import junit.framework.TestCase;

import com.leetcode.oj.spiralmatrix.Solution;

public class SprialMatrixTestCase extends TestCase {
    Solution solution = new Solution();
    long startTime = 0L;

    protected void setUp() throws Exception {
        super.setUp();
        startTime = System.currentTimeMillis();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime));
    }

    //    [
    //     [ 1, 2, 3 ],
    //     [ 4, 5, 6 ],
    //     [ 7, 8, 9 ]
    //    ]
    public void testCase1() {
        int [][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result = solution.spiralOrder(matrix);
        System.out.println(result);
    }

    public void testCase2() {
        int [][] matrix = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> result = solution.spiralOrder(matrix);
        System.out.println(result);
    }
}
