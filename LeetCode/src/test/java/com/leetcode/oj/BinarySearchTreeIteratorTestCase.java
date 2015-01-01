package com.leetcode.oj;

import com.leetcode.oj.binary_search_tree_iterator.BSTIterator;
import com.leetcode.oj.common.TreeNode;

import junit.framework.TestCase;

public class BinarySearchTreeIteratorTestCase extends TestCase {

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
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(5);
        root.left = node1;
        root.right = node2;
        BSTIterator i = new BSTIterator(root);
        while (i.hasNext()) {
            System.out.print(i.next());
        }
        assertTrue(true);
    }
}
