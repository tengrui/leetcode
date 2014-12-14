package com.leetcode.oj.accepted;


import com.leetcode.oj.minimumwindowsubstring.Solution;

import junit.framework.TestCase;

public class MinimumWindowSubstringTestCase extends TestCase {

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
        String r = solution.minWindow("ADOBECODEBANC", "ABC");
        System.out.println(r);
        assertTrue(true);
    }
    public void testCase2() {
        String r = solution.minWindow("a", "aa");
        System.out.println(r);
        assertTrue(true);
    }
    public void testCase3() {
        String r = solution.minWindow("a", "a");
        System.out.println(r);
        assertTrue(true);
    }
}
