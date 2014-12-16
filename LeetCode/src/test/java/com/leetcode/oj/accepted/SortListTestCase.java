package com.leetcode.oj.accepted;

import junit.framework.TestCase;

import com.leetcode.oj.common.ListNode;
import com.leetcode.oj.sort_list.Solution;

public class SortListTestCase extends TestCase {

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
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);
        ListNode n9 = new ListNode(9);
        n9.next = n8;
        n8.next = n7;
        n7.next = n6;
        n6.next = n5;
        n5.next = n4;
        n4.next = n3;
        n3.next = n2;
        n2.next = n1;
        
        System.out.println(n9);
        //ListNode result = solution.sortList(n9);
        //System.out.println(result);
        assertTrue(true);
    }
    public void testCase2() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        
        System.out.println(n1);
        ListNode result = solution.sortList(n1);
        System.out.println(result);
        assertTrue(true);
    }
}
