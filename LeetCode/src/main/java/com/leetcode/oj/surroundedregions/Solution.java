package com.leetcode.oj.surroundedregions;
import java.util.ArrayList;
import java.util.List;
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

    public void solve(char [][] board) {
        Stack<Point> stack = new Stack<Point>();
        int row = board.length;
        if (row == 0) {
            return;
        }
        int col = board[0].length;
        
        for (int i = 1; i < col - 1; ++i) {
            if (board[0][i] == 'O') {
                stack.add(new Point(0, i));
            }
            if (board[row - 1][i] == 'O') {
                stack.add(new Point(row - 1, i));
            }
        }
        for (int i = 1; i < row - 1; ++i) {
            if (board[i][0] == 'O') {
                stack.add(new Point(i, 0));
            }
            if (board[i][col - 1] == 'O') {
                stack.add(new Point(i, col - 1));
            }
        }
        while (!stack.isEmpty()) {
            Point p = stack.pop();
            int x = p.x;
            int y = p.y;
            if (x - 1 > 0 && y != 0 && y != col - 1 && board[x - 1][y] == 'O') {
                board[x - 1][y] = 'M';
                stack.push(new Point(x - 1, y));
            }
            if (x + 1 < row - 1 && y != 0 && y != col - 1 && board[x + 1][y] == 'O') {
                board[x + 1][y] = 'M';
                stack.push(new Point(x + 1, y));
            }
            if (y - 1 > 0 && x != 0 && x != row - 1 && board[x][y - 1] == 'O') {
                board[x][y - 1] = 'M';
                stack.push(new Point(x, y - 1));
            }
            if (y + 1 < col - 1 && x != 0 && x != row - 1 && board[x][y + 1] == 'O') {
                board[x][y + 1] = 'M';
                stack.push(new Point(x, y + 1));
            }
        }
        for (int i = 1; i < row - 1; ++i) {
            for (int j = 1; j < col - 1; ++j) {
                if (board[i][j] == 'M') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
