package com.leetcode.oj.reverse_linked_list_ii;

import com.leetcode.oj.common.ListNode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return head;
        }
        
        ListNode fast = new ListNode(0);
        ListNode slow = new ListNode(0);
        fast.next = head;
        slow.next = head;
        
        ListNode tempHead = new ListNode(0);
        tempHead.next = head;
        
        for (int i = 0; i <= n - m; ++i) {
            fast.next = fast.next.next;
        }
        ListNode temp1 = new ListNode(0);
        temp1.next = head;
        
        for (int i = 1; i < m; ++i) {
            fast.next = fast.next.next;
            slow.next = slow.next.next;
            temp1 = temp1.next;
        }
        
        ListNode reverse = new ListNode(0);
        ListNode temp3 = reverse;
        for (int j = m; j <= n; ++j) {
            reverse.next = slow.next;
            slow.next = slow.next.next;
            reverse.next.next = fast.next;
            fast.next = reverse.next;
        }
        
        if (temp1.next != null) {
            temp1.next = temp3.next;
        }
        
        if (m == 1) {
            return temp1.next;
        } else {
            return tempHead.next;
        }
    }
}