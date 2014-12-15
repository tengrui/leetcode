package com.leetcode.oj.accepted;

import junit.framework.TestCase;

import com.leetcode.oj.scramble_string.Solution;

public class ScrambleStringTestCase extends TestCase {

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
    
    public void testCase0() {
        String s1 = "cbcccccbbabcbac";
        String s2 = "bbccaccbcbcabcc";
        boolean r = solution.isScramble(s1, s2);
        assertTrue(r == true);
    }
    //"abcd", "bdac"
    public void testCase1() {
        String s1 = "abcd";
        String s2 = "bdac";
        boolean r = solution.isScramble(s1, s2);
        assertTrue(r == false);
    }

    public void testCase2() {
        String s1 = "great";
        String s2 = "rgeat";
        boolean r = solution.isScramble(s1, s2);
        assertTrue(r == true);
    }
    
    public void testCase3() {
        String s1 = "tqxpxeknttgwoppemjkivrulaflayn";
        String s2 = "afaylnlurvikjmeppowgttnkexpxqt";
        boolean r = solution.isScramble(s1, s2);
        assertTrue(r == true);
    }
    
    public void testCase4() {
        String s1 = "hobobyrqd";
        String s2 = "hbyorqdbo";
        boolean r = solution.isScramble(s1, s2);
        assertTrue(r == true);
    }
}
