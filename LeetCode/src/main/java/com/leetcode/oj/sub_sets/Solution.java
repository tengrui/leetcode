package com.leetcode.oj.sub_sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> element = new ArrayList<Integer>();
        result.add(element);
        int N = S.length;
        if (N == 0) {
            return result;
        }
        
        Arrays.sort(S);
        for (int i = 0; i < N; ++i) {
            int num = S[i];
            int size = result.size();
            for (int j = 0; j < size; ++j) {
                List<Integer> oleElement = result.get(j);
                List<Integer> newElement = new ArrayList<Integer>(oleElement);
                newElement.add(num);
                result.add(newElement);
            }
        }
        return result;
    }
}