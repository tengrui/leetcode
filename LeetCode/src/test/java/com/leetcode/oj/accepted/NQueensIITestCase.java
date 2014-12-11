package com.leetcode.oj.accepted;

import java.util.List;



import com.leetcode.oj.nqueensii.Solution;

import junit.framework.TestCase;

public class NQueensIITestCase extends TestCase {

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
        int n = 5;
        int result = solution.totalNQueens(n);

        System.out.println(result);
    }
}
