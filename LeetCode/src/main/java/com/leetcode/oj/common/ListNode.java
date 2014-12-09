package com.leetcode.oj.common;

/**
 * Definition for singly-linked list.
 */

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode nextNode = this;
        while(nextNode != null) {
            sb.append(nextNode.val).append("->");
            nextNode = nextNode.next;
        }
        sb.append("null");
        return sb.toString();
    }
}
