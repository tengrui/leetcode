package com.leetcode.oj;

import java.util.List;

import junit.framework.TestCase;

import com.leetcode.oj.palindromepartitioning.Solution;

public class PalindromePartitioningTestCase extends TestCase {
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
        String s = "aab";
        List<List<String>> result = solution.partition(s);
        System.out.println(result);
        assertTrue(true);
    }
    
    public void testCase2() {
        String s = "seeslaveidemonstrateyetartsnomedievalsees";
        List<List<String>> result = solution.partition(s);
        System.out.println(result);
        assertTrue(true);
    }
}
