package com.leetcode.oj.accepted;


import com.leetcode.oj.editdistance.Solution;

import junit.framework.TestCase;

public class EditDistanceTestCase extends TestCase {

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
        String word1 = "aab";
        String word2 = "aac";
        int result = solution.minDistance(word1, word2);
        System.out.println(result);
        assertTrue(true);
    }
    
    public void testCase2() {
        String word1 = "bcda";
        String word2 = "abcd";
        int result = solution.minDistance(word1, word2);
        System.out.println(result);
        assertTrue(true);
    }
    
    public void testCase3() {
        String word1 = "";
        String word2 = "d";
        int result = solution.minDistance(word1, word2);
        System.out.println(result);
        assertTrue(true);
    }
    
    public void testCase4() {
        String word1 = "zoologicoarchaeologist";
        String word2 = "zoogeologist";
        int result = solution.minDistance(word1, word2);
        System.out.println(result);
        assertTrue(true);
    }
}
