package com.leetcode.oj.common;

import java.util.Deque;
import java.util.LinkedList;

public class TreeNodeBuilder {
    public TreeNode build(String[] input) {
        int N = input.length;
        if (N == 0) {
            return null;
        }
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        TreeNode root = new TreeNode(Integer.parseInt(input[0]));

        deque.add(root);
        int index = 1;
        while (!deque.isEmpty() && index < N) {
            TreeNode tn = deque.pollFirst();
            String s = input[index];
            if (s.equals("#")) {
                tn.left = null;
            } else {
                int value = Integer.parseInt(s);
                TreeNode newTn = new TreeNode(value);
                tn.left = newTn;
                deque.addLast(newTn);
            }
            index++;
            if (index >= N) {
                break;
            }
            s = input[index];
            if (s.equals("#")) {
                tn.right = null;
            } else {
                int value = Integer.parseInt(s);
                TreeNode newTn = new TreeNode(value);
                tn.right = newTn;
                deque.addLast(newTn);
            }
            index++;
        }
        return root;
    }
}
