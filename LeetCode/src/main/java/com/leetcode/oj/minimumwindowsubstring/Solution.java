package com.leetcode.oj.minimumwindowsubstring;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Solution {
    public String minWindow(String S, String T) {
        int N1 = S.length();
        int N2 = T.length();
        int result = N1 + 1;
        int startIndex = 0;
        int endIndex = 0;
        
        // ASCII map
        int[] tWordCount = new int[256];
        Set<Character> needs = new HashSet<Character>();
        for (int i = 0; i < N2; ++i) {
            char c = T.charAt(i);
            tWordCount[c]++;
            needs.add(c);
        }
        
        int charNum = needs.size();
        int counter = 0;
        
        int[] sWordVisited = new int[256];
        Deque<Integer> indexQueue = new LinkedList<Integer>();
        for (int i = 0; i < N1; ++i) {
            char c = S.charAt(i);
            if (needs.contains(c)) {
                indexQueue.add(i);
                sWordVisited[c]++;
                if (sWordVisited[c] == tWordCount[c]) {
                    counter++;
                }
                while (counter == charNum) {
                    int temp = indexQueue.getLast() - indexQueue.getFirst() + 1;
                    if (temp < result) {
                        result = temp;
                        startIndex = indexQueue.getFirst();
                        endIndex = indexQueue.getLast() + 1;
                    }
                    int popIndex = indexQueue.pollFirst();
                    c = S.charAt(popIndex);
                    sWordVisited[c]--;
                    if (sWordVisited[c] < tWordCount[c]) {
                        counter--;
                    }
                }
            }
        }
        
        return S.substring(startIndex, endIndex);
    }
}
