package com.leetcode.oj.sudoku_solver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Solution {
    class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }

    public void solveSudoku(char [][] board) {
        List<Point> unresolved = new ArrayList<Point>();
        List<Set<Integer>> setRow = new ArrayList<Set<Integer>>();
        List<Set<Integer>> setCol = new ArrayList<Set<Integer>>();
        List<Set<Integer>> setBlk = new ArrayList<Set<Integer>>();

        for (int i = 0; i < 9; ++i) {
            Set<Integer> temp1 = new HashSet<Integer>();
            Set<Integer> temp2 = new HashSet<Integer>();
            Set<Integer> temp3 = new HashSet<Integer>();
            setRow.add(temp1);
            setCol.add(temp2);
            setBlk.add(temp3);
        }
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] == '.') {
                    unresolved.add(new Point(i, j));
                } else {
                    int val = board[i][j] - '0';
                    setRow.get(i).add(val);
                    setCol.get(j).add(val);
                    setBlk.get(i / 3 * 3 + j / 3).add(val);;
                }
            }
        }

        int N = unresolved.size();
        Stack<Integer> solution = new Stack<Integer>();

        int start = 1;
        while (solution.size() < N) {
            int index = solution.size();
            Point p = unresolved.get(index);

            int x = p.x;
            int y = p.y;
            int b = x / 3 * 3 + y / 3;

            for (int s = start; s <= 9; ++s) {
                if (!setRow.get(x).contains(s) && !setCol.get(y).contains(s) && !setBlk.get(b).contains(s)) {
                    setRow.get(x).add(s);
                    setCol.get(y).add(s);
                    setBlk.get(b).add(s);
                    solution.add(s);
                    start = 1;
                    break;
                }
            }
            // Do not find a solution.
            if (index == solution.size()) {
                start = solution.get(index - 1);
                Point p2 = unresolved.get(index - 1);

                int x2 = p2.x;
                int y2 = p2.y;
                int b2 = x2 / 3 * 3 + y2 / 3;
                setRow.get(x2).remove(start);
                setCol.get(y2).remove(start);
                setBlk.get(b2).remove(start);

                start++;
                solution.remove(index - 1);
            }
        }

        for (int i = 0; i < N; ++i) {
            Point p = unresolved.get(i);
            String answer = "" + solution.get(i);
            board[p.x][p.y] = answer.charAt(0);
        }
    }
}
