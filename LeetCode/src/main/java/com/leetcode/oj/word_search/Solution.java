package com.leetcode.oj.word_search;
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

    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        int N = word.length();
        int index = 0;

        Stack<List<Point>> visited = new Stack<List<Point>>();
        Stack<Integer> wordLength = new Stack<Integer>();

        for (int j = 0; j < row; ++j) {
            for (int k = 0; k < col; ++k) {
                if (board[j][k] == word.charAt(0)) {
                    index = 1;
                    Point p = new Point(j, k);
                    List<Point> v = new ArrayList<Point>();
                    v.add(p);
                    visited.add(v);
                    wordLength.add(index);
                }
            }
        }
        if (index == 0) {
            return false;
        } else if (index == N) {
            return true;
        }

        while (!visited.isEmpty()) {
            List<Point> v = visited.pop();
            index = wordLength.pop();
            List<Point> next = getNextPoint(word.charAt(index), v, board);
            for (Point p : next) {
                int newIndex = index + 1;
                if (newIndex >= N) {
                    return true;
                }
                List<Point> newV = new ArrayList<Point>();
                newV.addAll(v);
                newV.add(0, p);
                visited.push(newV);
                wordLength.push(newIndex);
            }
        }

        return false;
    }

    List<Point> getNextPoint(char c, List<Point> v, char[][] board) {
        int row = board.length;
        int col = board[0].length;
        List<Point> result = new ArrayList<Point>();

        Point p = v.get(0);
        if (p.y - 1 >= 0 && board[p.x][p.y - 1] == c) {
            boolean duplicate = false;
            for (Point n : v) {
                if (n.x == p.x && n.y == p.y - 1) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                result.add(new Point(p.x, p.y - 1));
            }
        }
        if (p.y + 1 < col && board[p.x][p.y + 1] == c) {
            boolean duplicate = false;
            for (Point n : v) {
                if (n.x == p.x && n.y == p.y + 1) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                result.add(new Point(p.x, p.y + 1));
            }
        }
        if (p.x - 1 >= 0 && board[p.x - 1][p.y] == c) {
            boolean duplicate = false;
            for (Point n : v) {
                if (n.x == p.x - 1 && n.y == p.y) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result.add(new Point(p.x - 1, p.y));
            }
        }
        if (p.x + 1 < row && board[p.x + 1][p.y] == c) {
            boolean duplicate = false;
            for (Point n : v) {
                if (n.x == p.x + 1 && n.y == p.y) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result.add(new Point(p.x + 1, p.y));
            }

        }

        return result;
    }
}
