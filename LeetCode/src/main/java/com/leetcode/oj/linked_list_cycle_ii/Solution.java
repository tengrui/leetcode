package com.leetcode.oj.linked_list_cycle_ii;

import com.leetcode.oj.common.ListNode;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode normal = head;
        
        ListNode newHead = null;
        while (normal != null) {
            fast = fast.next;
            if (fast == null) {
                return null;
            }
            fast = fast.next;
            if (fast == null) {
                return null;
            }
            normal = normal.next;
            if (fast == normal) {
                newHead = fast.next;
                fast.next = null;
                break;
            }
        }
        
        ListNode tempA = head;
        ListNode tempB = newHead;
        
        int numA = 1;
        while (tempA.next != null) {
            numA++;
            tempA = tempA.next;
        }
        
        int numB = 1;
        while (tempB.next != null) {
            numB++;
            tempB = tempB.next;
        }
        
        tempA = head;
        tempB = newHead;
        int lessNum = numA- numB;
        if (numA < numB) {
            tempA = newHead;
            tempB = head;
            lessNum = numB - numA;
        }
        
        for (int i = 0; i < lessNum; ++i) {
            tempA = tempA.next;
        }
        
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempB;
    }
}