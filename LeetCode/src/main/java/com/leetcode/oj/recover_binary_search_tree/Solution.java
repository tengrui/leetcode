package com.leetcode.oj.recover_binary_search_tree;

import com.leetcode.oj.common.TreeNode;

public class Solution {
    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode left = null;
        TreeNode right = null;
        if (root.left != null) {
            left = findBigNode(root.left, root.val);
        }
        if (root.right != null) {
            right = findSmallNode(root.right, root.val);
        }
        if (left != null && right != null) {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        } else if (left != null) {
            TreeNode lefter = findBigNode(left, left.val);
            if (lefter != null) {
                left = lefter;
            }
            int temp = left.val;
            left.val = root.val;
            root.val = temp;
        } else if (right != null) {
            TreeNode righter = findSmallNode(right, right.val);
            if (righter != null) {
                right = righter;
            }
            int temp = right.val;
            right.val = root.val;
            root.val = temp;
        } else {
            recoverTree(root.left);
            recoverTree(root.right);
        }
    }

    public TreeNode findBigNode(TreeNode root, int val) {
        if (root.val > val) {
            return root;
        } else {
            if (root.left != null) {
                TreeNode find = findBigNode(root.left, val);
                if (find != null) {
                    return find;
                }
            }
            if (root.right != null) {
                TreeNode find = findBigNode(root.right, val);
                if (find != null) {
                    return find;
                }
            }
        }
        return null;
    }

    public TreeNode findSmallNode(TreeNode root, int val) {
        if (root.val < val) {
            return root;
        } else {

            if (root.right != null) {
                TreeNode find = findSmallNode(root.right, val);
                if (find != null) {
                    return find;
                }
            }
            if (root.left != null) {
                TreeNode find = findSmallNode(root.left, val);
                if (find != null) {
                    return find;
                }
            }
        }
        return null;
    }
}
