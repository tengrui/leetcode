package com.leetcode.oj;

import junit.framework.TestCase;

import com.leetcode.oj.maximum_gap.Solution;

public class MaximumGapTestCase extends TestCase {
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

    public void testCase1() {
        assertTrue(true);
    }
}
