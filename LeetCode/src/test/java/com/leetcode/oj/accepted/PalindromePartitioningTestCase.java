package com.leetcode.oj.accepted;

import java.util.List;

import junit.framework.TestCase;

import com.leetcode.oj.palindrome_partitioning.Solution;

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

    public void testCase2() {
        List<List<String>> r = solution.partition("AAAA");
        System.out.println(r);
        assertTrue(true);
    }

    // seeslaveidemonstrateyetartsnomedievalsees
    public void testCase3() {
        List<List<String>> r = solution
                .partition("seeslaveidemonstrateyetartsnomedievalsees");
        System.out.println(r);
        
        boolean b = solution.isPalindrome("seeslaveidemonstrateyetartsnomedievalsees");
        System.out.println(b);
        assertTrue(true);
    }

    // "abbab"
    public void testCase4() {
        List<List<String>> r = solution.partition("abbab");
        System.out.println(r);
        
        boolean b = solution.isPalindrome("abbab");
        System.out.println(b);
        assertTrue(true);
    }
}
