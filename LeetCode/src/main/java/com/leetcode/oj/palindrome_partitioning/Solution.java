package com.leetcode.oj.palindrome_partitioning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Solution {
    Map<String, List<List<String>>> map = new HashMap<String, List<List<String>>>();

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<List<String>>();

        int N = s.length();
        if (N == 1) {
            List<String> line = new ArrayList<String>();
            line.add(s);
            result.add(line);
            return result;
        }
        for (int i = 0; i < N; i++) {
            String sub1 = s.substring(0, i + 1);
            String sub2 = s.substring(i + 1, N);
            if (isPalindrome(sub1)) {
                List<List<String>> subResult = null;
                if (map.containsKey(sub2)) {
                    subResult = map.get(sub2);
                } else {
                    subResult = partition(sub2);
                    map.put(sub2, result);  
                }
                for (List<String> sub : subResult) {
                    List<String> l = new ArrayList<String>();
                    l.add(sub1);
                    l.addAll(sub);
                    result.add(l);
                }
            }
        }
        return result;
    }

    public boolean isPalindrome(String s) {
        int N = s.length();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < N / 2; ++i) {
            stack.push(s.charAt(i));
        }
        for (int i = N - 1; i > N / 2; --i) {
            if (s.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}