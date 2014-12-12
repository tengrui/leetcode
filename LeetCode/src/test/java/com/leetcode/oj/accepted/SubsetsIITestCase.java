package com.leetcode.oj.accepted;

import java.util.List;



import com.leetcode.oj.subsetsii.Solution;

import junit.framework.TestCase;

public class SubsetsIITestCase extends TestCase {

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
        int [] S = {1, 2, 2};
        List<List<Integer>> result = solution.subsetsWithDup(S);
        System.out.println(result);
    }
    
    public void testCase2() {
        int [] S = {5,5,5,5,5};
        List<List<Integer>> result = solution.subsetsWithDup(S);
        System.out.println(result);
    }
}
