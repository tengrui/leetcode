package com.leetcode.oj.binary_search_tree_iterator;

import java.util.Stack;

import com.leetcode.oj.common.TreeNode;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {

    Stack<TreeNode> stack = new Stack<TreeNode>();

    public BSTIterator(TreeNode root) {
        TreeNode next = root;
        while (next != null) {
            stack.push(next);
            next = next.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        if (!hasNext()) {
            return 0;
        }
        TreeNode node = stack.pop();
        TreeNode next = node.right;
        while (next != null) {
            stack.push(next);
            next = next.left;
        }
        
        return node.val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
