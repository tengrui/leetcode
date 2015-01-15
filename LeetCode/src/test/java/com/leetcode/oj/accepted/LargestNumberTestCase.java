package com.leetcode.oj.accepted;

import junit.framework.TestCase;

import com.leetcode.oj.largest_number.Solution;


public class LargestNumberTestCase extends TestCase {

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
        int[] num = {3, 30, 34, 5, 9};
        String result = solution.largestNumber(num);
        System.out.println(result);
        assertTrue(result.equals("9534330"));
    }
    
    public void testCase2() {
        int[] num = {12, 128};
        String result = solution.largestNumber(num);
        System.out.println(result);
        assertTrue(result.equals("12812"));
    }
    
    public void testCase3() {
        int[] num = {12, 121};
        String result = solution.largestNumber(num);
        System.out.println(result);
        assertTrue(result.equals("12121"));
    }
        
    public void testCase4() {
        int[] num = {8247, 824};
        String result = solution.largestNumber(num);
        System.out.println(result);
        assertTrue(result.equals("8248247"));
    }
        
    public void testCase5() {
        int[] num = {1,2,4,8,16,32,64,128,256,512};
        String result = solution.largestNumber(num);
        System.out.println(result);
                                //8645124322256161281
        assertTrue(result.equals("8645124322562161281"));
    }
    
    public void testCase6() {
        int[] num = {0, 0};
        String result = solution.largestNumber(num);
        System.out.println(result);
        assertTrue(result.equals("0"));
    }
    
    //824,938,1399,5607,6973,5703,9609,4398,8247
    public void testCase7() {
        int[] num = {824,938,1399,5607,6973,5703,9609,4398,8247};
        String result = solution.largestNumber(num);
        System.out.println(result);
        assertTrue(result.equals("9609938824824769735703560743981399"));
    }
    
}
