package com.leetcode.oj.sort_list;

import com.leetcode.oj.common.ListNode;

/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = new ListNode(0);
        newHead.next = head;
        int step = 1;
        boolean quit = false;
        while (!quit) {
            ListNode current = newHead;
            ListNode slow = current.next;
            ListNode fast = current.next;
            ListNode unsorted = current.next;
            int mergeNumber = 1;
            while (unsorted != null) {
                // Find the begin, middle and end node position.
                slow = unsorted;
                fast = unsorted;
                for (int i = 0; i < step; ++i) {
                    if (fast != null) {
                        fast = fast.next;
                    }
                    if (unsorted != null) {
                        unsorted = unsorted.next;
                    }
                    if (unsorted != null) {
                        unsorted = unsorted.next;
                    }
                }
                ListNode list1 = slow;
                ListNode list2 = fast;
                while (list2 != unsorted || list1 != fast) {
                    if (list2 == unsorted) {
                        current.next = list1;
                        current = current.next;
                        list1 = list1.next;
                    } else if (list1 == fast) {
                        current.next = list2;
                        current = current.next;
                        list2 = list2.next;
                    } else if (list1.val < list2.val) {
                        current.next = list1;
                        current = current.next;
                        list1 = list1.next;
                    } else {
                        current.next = list2;
                        current = current.next;
                        list2 = list2.next;
                    }
                }
                current.next = unsorted;
                mergeNumber++;
            }
            if (mergeNumber == 2) {
                quit = true;
            }
            step *= 2;
        }
        return newHead.next;
    }
}
