package com.leetcode.oj.accepted;

import com.leetcode.oj.longest_consecutive_sequence.Solution;

import junit.framework.TestCase;

public class LongestConsecutiveSequenceTestCase extends TestCase {

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
        int[] num = { 100, 4, 200, 1, 3, 2 };
        int result = solution.longestConsecutive(num);
        System.out.println(result);
    }
    public void testCase2() {
        int[] num = {-7,-1,3,-9,-4,7,-3,2,4,9,4,-9,8,-7,5,-1,-7};
        int result = solution.longestConsecutive(num);
        System.out.println(result);
    }
    public void testCase3() {
        int[] num = {4,2,2,-4,0,-2,4,-3,-4,-4,-5,1,4,-9,5,0,6,-8,-1,-3,6,5,-8,-1,-5,-1,2,-9,1};
        int result = solution.longestConsecutive(num);
        System.out.println(result);
    }
    public void testCase4() {
        int[] num = {7,-9,3,-6,3,5,3,6,-2,-5,8,6,-4,-6,-4,-4,5,-9,2,7,0,0};
        int result = solution.longestConsecutive(num);
        System.out.println(result);
    }
}
