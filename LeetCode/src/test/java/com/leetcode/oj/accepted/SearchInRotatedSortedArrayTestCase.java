package com.leetcode.oj.accepted;

import junit.framework.TestCase;

import com.leetcode.oj.search_in_rotated_sorted_array.Solution;


public class SearchInRotatedSortedArrayTestCase extends TestCase {

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
    
    //4 5 6 7 0 1 2
    public void testCase1() {
        int[] A = {4, 5, 6, 7, 0, 1, 2};
        int target = 2;
        int result = solution.search(A, target);
        System.out.println(result);
    }
    
    //[1], 0 
    public void testCase2() {
        int[] A = {1};
        int target = 0;
        int result = solution.search(A, target);
        System.out.println(result);
    }
}
