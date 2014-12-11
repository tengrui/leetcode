package com.leetcode.oj.accepted;

import java.util.List;

import junit.framework.TestCase;

import com.leetcode.oj.nqueens.Solution;

public class NQueuesTestCase extends TestCase {

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
        List<String[]> result = solution.solveNQueens(n);

        if (result != null) {
            for (String[] r : result) {
                for (String s : r) {
                    System.out.println(s);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
