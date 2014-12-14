package com.leetcode.oj.accepted;

import com.leetcode.oj.interleaving_string.Solution;

import junit.framework.TestCase;

public class InterleavingStringTestCase extends TestCase {

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

    /**
     * s1 = "aabcc",
     * s2 = "dbbca",
     * When s3 = "aadbbcbcac", return true.
     * When s3 = "aadbbbaccc", return false.
     */
    public void testCase1() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        boolean r = solution.isInterleave(s1, s2, s3);
        assertTrue(r == true);
    }

    public void testCase2() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbbaccc";
        boolean r = solution.isInterleave(s1, s2, s3);
        assertTrue(r == false);
    }

    public void testCase3() {
        String s1 = "aacaac";
        String s2 = "aacaaeaac";
        String s3 = "aacaacaaeaacaac";
        boolean r = solution.isInterleave(s1, s2, s3);
        assertTrue(r == true);
    }
    
    public void testCase4() {
        String s1 = "cbcccbabbccbbcccbbbcabbbabcababbbbbbaccaccbabbaacbaabbbc";
        String s2 = "abcbbcaababccacbaaaccbabaabbaaabcbababbcccbbabbbcbbb";
        String s3 = "abcbcccbacbbbbccbcbcacacbbbbacabbbabbcacbcaabcbaaacbcbbbabbbaacacbbaaaabccbcbaabbbaaabbcccbcbabababbbcbbbcbb";
        boolean r = solution.isInterleave(s1, s2, s3);
        assertTrue(r == true);
    }
}
