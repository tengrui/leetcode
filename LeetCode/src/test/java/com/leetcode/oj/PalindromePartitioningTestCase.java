package com.leetcode.oj;


import java.util.List;

import com.leetcode.oj.palindrome_partitioning.Solution;

import junit.framework.TestCase;

public class PalindromePartitioningTestCase extends TestCase {

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
        List<List<String>> r = solution.partition("aab");
        System.out.println(r);
        assertTrue(true);
    }
    
    //seeslaveidemonstrateyetartsnomedievalsees
    public void testCase2() {
        List<List<String>> r = solution.partition("seeslaveidemonstrateyetartsnomedievalsees");
        System.out.println(r);
        assertTrue(true);
    }
}
