package com.leetcode.oj;

import com.leetcode.oj.wordsearch.Solution;

import junit.framework.TestCase;

public class SurroundedRegionsTestCase extends TestCase {
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

    public void testcase1() {

    }
}
