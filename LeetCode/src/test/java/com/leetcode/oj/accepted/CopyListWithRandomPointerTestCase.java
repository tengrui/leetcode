package com.leetcode.oj.accepted;

import junit.framework.TestCase;

import com.leetcode.oj.common.RandomListNode;
import com.leetcode.oj.copy_list_with_random_pointer.Solution;


public class CopyListWithRandomPointerTestCase extends TestCase {
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
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);
        RandomListNode node5 = new RandomListNode(5);
        
        node1.next = node2;
        node1.random = node3;
        
        node2.next = node3;
        node2.random = node1;
        
        node3.next = node4;
        node3.random = node2;
        
        node4.next = node5;
        node4.random = node5;
        
        node5.random = node1;
        
        System.out.println(node1);
        
        RandomListNode result = solution.copyRandomList(node1);
        System.out.println(result);
    }
    public void testCase2() {
        RandomListNode node1 = new RandomListNode(-1);
        
        System.out.println(node1);
        
        RandomListNode result = solution.copyRandomList(node1);
        System.out.println(result);
    }
}
