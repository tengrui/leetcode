package com.leetcode.oj.accepted;

import com.leetcode.oj.common.ListNode;
import com.leetcode.oj.reverselinkedlistii.Solution;

import junit.framework.TestCase;

public class ReverseLinkedListII extends TestCase {

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
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        
        System.out.println(head);
        ListNode newHead = solution.reverseBetween(head, 2, 4);

        System.out.println(newHead);
    }
    public void testCase2() {
        ListNode head = new ListNode(5);
        
        System.out.println(head);
        ListNode newHead = solution.reverseBetween(head, 1, 1);

        System.out.println(newHead);
    }
    public void testCase3() {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(5);
        head.next = node1;
        
        System.out.println(head);
        ListNode newHead = solution.reverseBetween(head, 1, 1);

        System.out.println(newHead);
    }
    public void testCase4() {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(5);
        head.next = node1;
        
        System.out.println(head);
        ListNode newHead = solution.reverseBetween(head, 1, 2);

        System.out.println(newHead);
    }
}
