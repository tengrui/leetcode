package com.leetcode.oj.accepted;

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

    //3,6,9,1
    public void testCase1() {
        int [] num = {3, 6, 9, 1};
        int r = solution.maximumGap(num);
        System.out.println(r);
        assertTrue(r == 3);
    }
    
    //100,3,2,1
    public void testCase2() {
        int [] num = {100,3,2,1};
        int r = solution.maximumGap(num);
        System.out.println(r);
        assertTrue(r == 97);
    }
}
