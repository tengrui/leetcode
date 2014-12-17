package com.leetcode.oj.accepted;

import junit.framework.TestCase;

import com.leetcode.oj.fraction_to_recurring_decimal.Solution;

public class FractionToRecurringDecimalTestCase extends TestCase {
    Solution solution = new Solution();
    long startTime = 0L;

    protected void setUp() throws Exception {
        super.setUp();
        startTime = System.currentTimeMillis();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime));
    }

    public void testCase1() {
        String r = solution.fractionToDecimal(1, 6);
        System.out.println(r);
        assertTrue(r.equals("0.1(6)"));
    }
    
    public void testCase2() {
        String r = solution.fractionToDecimal(1, 11);
        System.out.println(r);
        assertTrue(r.equals("0.(09)"));
    }
    public void testCase3() {
        String r = solution.fractionToDecimal(1, 17);
        System.out.println(r);
        assertTrue(r.equals("0.(0588235294117647)"));
    }
    
    public void testCase4() {
        String r = solution.fractionToDecimal(-50, 8);
        System.out.println(r);
        assertTrue(r.equals("-6.25"));
    }
    
    //7, -12
    public void testCase5() {
        String r = solution.fractionToDecimal(7, -12);
        System.out.println(r);
        assertTrue(r.equals("-0.58(3)"));
    }
    
    //-1, -2147483648
    public void testCase6() {
        String r = solution.fractionToDecimal(-1, -2147483648);
        System.out.println(r);
        assertTrue(r.equals("0.0000000004656612873077392578125"));
    }
    
    //-2147483648, 1
    public void testCase7() {
        String r = solution.fractionToDecimal(-2147483648, 1);
        System.out.println(r);
        assertTrue(r.equals("-2147483648"));
    }
    
    //-2147483648, -1
    public void testCase8() {
        String r = solution.fractionToDecimal(-2147483648, -1);
        System.out.println(r);
        assertTrue(r.equals("2147483648"));
    }
}
