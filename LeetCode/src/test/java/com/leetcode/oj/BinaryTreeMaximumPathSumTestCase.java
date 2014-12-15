package com.leetcode.oj;

import com.leetcode.oj.binary_tree_maximum_path_sum.Solution;
import com.leetcode.oj.common.TreeNode;
import com.leetcode.oj.common.TreeNodeBuilder;

import junit.framework.TestCase;

public class BinaryTreeMaximumPathSumTestCase extends TestCase {

    Solution solution = new Solution();
    TreeNodeBuilder tnb = new TreeNodeBuilder();
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
        String[] input = {"1","-2","-3","1","3","-2","#","-1"};
        
        TreeNode root = tnb.build(input);
        System.out.println(root);
        int result = solution.maxPathSum(root);
        System.out.println(result);
        assertTrue(true);
    }
}
