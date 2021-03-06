package com.leetcode.oj.accepted;

import junit.framework.TestCase;

import com.leetcode.oj.wildcard_matching.Solution;

public class WildcardMatchingTestCase extends TestCase {
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
        boolean result = solution.isMatch(
                "abbabbbaabaaabbbbbabbabbabbbabbaaabbbababbabaaabbab",
                "*aabb***aa**a******aa*");
        assertTrue(result == true);
    }

    public void testCase2() {
        boolean result = solution.isMatch("aa", "a");
        assertTrue(result == false);
    }

    public void testCase3() {
        boolean result = solution.isMatch("aa", "aa");
        assertTrue(result == true);
    }

    public void testCase4() {
        boolean result = solution.isMatch("abefcdgiescdfimde", "ab*cd?i*de");
        assertTrue(result == true);
    }

    public void testCase5() {
        boolean result = solution.isMatch("a", "a*");
        assertTrue(result == true);
    }

    public void testCase6() {
        boolean result = solution.isMatch("abcdef", "a?de*");
        assertTrue(result == false);
    }
}
