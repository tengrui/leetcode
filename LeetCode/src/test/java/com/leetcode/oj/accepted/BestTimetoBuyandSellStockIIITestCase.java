package com.leetcode.oj.accepted;

import junit.framework.TestCase;

import com.leetcode.oj.best_time_to_buy_and_sell_stock_iii.Solution;

public class BestTimetoBuyandSellStockIIITestCase extends TestCase {

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
        int [] prices = {1, 3, 2, 4};
        int r = solution.maxProfit(prices);
        System.out.println(r);
        assertTrue(r == 4);
    }

    public void testCase2() {
        int [] prices = {1, 4, 2};
        int r = solution.maxProfit(prices);
        System.out.println(r);
        assertTrue(r == 3);
    }
    
    public void testCase3() {
        int [] prices = {2, 1, 4};
        int r = solution.maxProfit(prices);
        System.out.println(r);
        assertTrue(r == 3);
    }
    
    //2,1,2,1,0,0,1
    public void testCase4() {
        int [] prices = {2,1,2,1,0,0,1};
        int r = solution.maxProfit(prices);
        System.out.println(r);
        assertTrue(r == 2);
    }
}
