package com.leetcode.oj.accepted;

import junit.framework.TestCase;

import com.leetcode.oj.surroundedregions.Solution;

public class SurroundedRegionsTestCase extends TestCase {
    Solution solution = new Solution();
    long startTime = 0L;

    protected void setUp() throws Exception {
        super.setUp();
        startTime = System.currentTimeMillis();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime));
    }

    public void testcase1() {
        char [][] board = { {'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};

        solution.solve(board);
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void testcase2() {
        char [][] board = {};

        solution.solve(board);
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void testcase3() {
        char [][] board = {{'O'}};

        solution.solve(board);
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    //"OOOOOO","OXXXXO","OXOOXO","OXOOXO","OXXXXO","OOOOOO"
    public void testcase4() {
        char [][] board = { {'O', 'O', 'O', 'O', 'O', 'O'}, 
                {'O', 'X', 'X', 'X', 'X', 'O'},
                {'O', 'X', 'O', 'O', 'X', 'O'}, 
                {'O', 'X', 'O', 'O', 'X', 'O'}, 
                {'O', 'X', 'X', 'X', 'X', 'O'},
                {'O', 'O', 'O', 'O', 'O', 'O'}};

        solution.solve(board);
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
