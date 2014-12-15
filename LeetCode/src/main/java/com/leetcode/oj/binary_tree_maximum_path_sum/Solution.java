package com.leetcode.oj.binary_tree_maximum_path_sum;

import java.util.HashMap;
import java.util.Map;

import com.leetcode.oj.common.TreeNode;

public class Solution {
    Map<TreeNode, Integer> maxValue = new HashMap<TreeNode, Integer>();
    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int result = root.val;
        if (root.left == null && root.right == null) {
            return result;
        } else if (root.left == null) {
            int right = getMaxSumFromRoot2Node(root.right);
            if (right > 0) {
                result += right;
            }
        } else if (root.right == null) {
            int left = getMaxSumFromRoot2Node(root.left);
            if (left > 0) {
                result += left;
            }
        } else {
            int left = getMaxSumFromRoot2Node(root.left);
            int right = getMaxSumFromRoot2Node(root.right);
            if (left > 0) {
                result += left;
            }
            if (right > 0) {
                result += right;
            }
        }

        if (root.left != null) {
            int t = maxPathSum(root.left);
            result = result > t ? result : t;
        }
        if (root.right != null) {
            int t = maxPathSum(root.right);
            result = result > t ? result : t;
        }
        return result;
    }

    public int getMaxSumFromRoot2Node(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (maxValue.containsKey(root)){
            return maxValue.get(root);
        }
        int result = root.val;

        if (root.left == null && root.right == null) {
            return result;
        } else if (root.left == null) {
            int right = 0;
            if (maxValue.containsKey(root.right)) {
                right = maxValue.get(root.right);
            } else {
                right = getMaxSumFromRoot2Node(root.right);
                maxValue.put(root.right, right);
            }
            result += (right > 0 ? right : 0);
        } else if (root.right == null) {
            int left = 0;
            if (maxValue.containsKey(root.left)) {
                left = maxValue.get(root.left);
            } else {
                left = getMaxSumFromRoot2Node(root.left);
                maxValue.put(root.left, left);
            }
            result += (left > 0 ? left : 0);
        } else {
            int right = 0;
            if (maxValue.containsKey(root.right)) {
                right = maxValue.get(root.right);
            } else {
                right = getMaxSumFromRoot2Node(root.right);
                maxValue.put(root.right, right);
            }
            int left = 0;
            if (maxValue.containsKey(root.left)) {
                left = maxValue.get(root.left);
            } else {
                left = getMaxSumFromRoot2Node(root.left);
                maxValue.put(root.left, left);
            }
            int temp = 0;
            if (right > temp) {
                temp = right;
            }
            if (left > temp) {
                temp = left;
            }
            result += temp;
        }
        maxValue.put(root, result);
        return result;        
    }
}
