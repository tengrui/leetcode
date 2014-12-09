package com.leetcode.oj.copylistwithrandompointer;

import com.leetcode.oj.common.RandomListNode;

/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }
        RandomListNode temp = head;
        while (temp != null) {
            RandomListNode newNode = new RandomListNode(temp.label);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }

        temp = head;
        while (temp != null) {
            temp.next.random = temp.random == null ? null : temp.random.next;
            temp = temp.next.next;
        }

        temp = head;
        RandomListNode temp2 = head.next;
        RandomListNode newHead = head.next;
        while (temp != null) {
            temp.next = temp.next.next;
            if (temp2.next != null) {
                temp2.next = temp2.next.next;
            } else {
                temp2.next = null;
            }

            temp = temp.next;
            temp2 = temp2.next;
        }
        return newHead;
    }
}