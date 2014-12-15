package com.leetcode.oj.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<TreeNode> temp = new ArrayList<TreeNode>();
        temp.add(left);
        temp.add(right);
        sb.append("{").append(val);
        while (!temp.isEmpty()) {
            List<TreeNode> temp2 = new ArrayList<TreeNode>();
            for (TreeNode tn : temp) {
                if (tn == null) {
                    sb.append(",").append("#");
                } else {
                    sb.append(",").append(tn.val);
                    temp2.add(tn.left);
                    temp2.add(tn.right);
                }
            }
            temp = temp2;
        }
        sb.append("}");
        return sb.toString();
    }
}