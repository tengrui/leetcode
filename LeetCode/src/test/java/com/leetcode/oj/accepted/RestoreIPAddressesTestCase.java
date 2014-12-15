package com.leetcode.oj.accepted;


import java.util.List;

import junit.framework.TestCase;

import com.leetcode.oj.restore_ip_addresses.Solution;

public class RestoreIPAddressesTestCase extends TestCase {

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

    // Given "25525511135",
    // return ["255.255.11.135", "255.255.111.35"]. (Order does not matter) 
    public void testCase1() {
        String s = "25525511135";
        List<String> r = solution.restoreIpAddresses(s);
        System.out.println(r);
        assertTrue(true);
    }
    
    public void testCase2() {
        String s = "";
        List<String> r = solution.restoreIpAddresses(s);
        System.out.println(r);
        assertTrue(true);
    }
    
    public void testCase3() {
        String s = "0000";
        List<String> r = solution.restoreIpAddresses(s);
        System.out.println(r);
        assertTrue(true);
    }
}
