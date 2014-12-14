package com.leetcode.oj.accepted;

import com.leetcode.oj.maximal_rectangle.Solution;

import junit.framework.TestCase;

public class MaximalRectangleTestCase extends TestCase {

    Solution solution = new Solution();
    long startTime = 0L;

    protected void setUp() throws Exception {
        super.setUp();
        startTime = System.currentTimeMillis();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("Time elapsed: "
                + (System.currentTimeMillis() - startTime));
    }

    public void testCase1() {
        char[][] matrix = {{'0', '1', '1'},{'0', '1', '1'},{'0', '1', '1'}};
        int result = solution.maximalRectangle(matrix);
        System.out.println(result);
        assertTrue(result == 6);
    }
    public void testCase2() {
        char[][] matrix = {};
        int result = solution.maximalRectangle(matrix);
        System.out.println(result);
        assertTrue(result == 0);
    }
    public void testCase3() {
        char[][] matrix = {{'1','1'},{'1','1'}};
        int result = solution.maximalRectangle(matrix);
        System.out.println(result);
        assertTrue(result == 4);
    }
    public void testCase4() {
        char[][] matrix = {{'1'}};
        int result = solution.maximalRectangle(matrix);
        System.out.println(result);
        assertTrue(result == 1);
    }
}
