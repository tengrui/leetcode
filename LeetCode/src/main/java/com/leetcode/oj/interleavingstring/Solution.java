package com.leetcode.oj.interleavingstring;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

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

        public int hashCode() {
            Integer i = x;
            Integer j = y;
            return i.hashCode() + j.hashCode();
        }

        public boolean equals(Object o) {
            if (o instanceof Point) {
                Point p = (Point)o;
                if (p.x == this.x && p.y == this.y) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1 == null || s2 == null || s3 == null) {
            return false;
        }
        int N1 = s1.length();
        int N2 = s2.length();
        int N3 = s3.length();

        if (N1 == 0) {
            return s3.equals(s2);
        }
        if (N2 == 0) {
            return s3.equals(s1);
        }
        if (N1 + N2 != N3) {
            return false;
        }

        Deque<Point> path = new LinkedList<Point>();
        path.add(new Point(0, 0));
        for (int n = 0; n < N3; ++n) {
            char c3 = s3.charAt(n);
            int capacity = path.size();
            Set<Point> temp = new HashSet<Point>();
            for (int m = 0; m < capacity; ++m) {
                Point p = path.pollFirst();
                int indexS1 = p.y;
                int indexS2 = p.x;
                if (indexS1 + 1 <= N1 && s1.charAt(indexS1) == c3) {
                    temp.add(new Point(p.x, p.y + 1));
                }
                if (indexS2 + 1 <= N2 && s2.charAt(indexS2) == c3) {
                    temp.add(new Point(p.x + 1, p.y));
                }
            }
            if (temp.isEmpty()) {
                return false;
            } else {
                path.addAll(temp);
            }
        }

        return true;
    }
}
