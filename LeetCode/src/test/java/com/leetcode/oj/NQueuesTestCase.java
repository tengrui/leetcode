package com.leetcode.oj;

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
        int n = 4;
        List<String[]> result = solution.solveNQueens(n);
        
        if (result != null) {
            for (int i = 0; i < n; ++i) {
                System.out.println(result.get(i));
            }
        }
    }
}
