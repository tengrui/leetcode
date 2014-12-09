package com.leetcode.oj.accepted;

import java.util.List;

import com.leetcode.oj.subsets.Solution;

import junit.framework.TestCase;

public class SubsetsTestCase extends TestCase {

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
        int [] S = {1, 2, 3};
        List<List<Integer>> result = solution.subsets(S);
        System.out.println(result);
    }
}
