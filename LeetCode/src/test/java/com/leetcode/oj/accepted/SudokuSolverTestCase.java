package com.leetcode.oj.accepted;

import junit.framework.TestCase;

import com.leetcode.oj.sudoku_solver.Solution;

public class SudokuSolverTestCase extends TestCase {

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

    public void testCase1() {
        String [] input = {"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.",
                "...419..5", "....8..79"};

        char [][] board = new char[9][9];
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                board[i][j] = input[i].charAt(j);
            }
        }
        solution.solveSudoku(board);
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
        assertTrue(true);
    }
}
