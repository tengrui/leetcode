package com.leetcode.oj.subsetsii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] num) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> element = new ArrayList<Integer>();
        result.add(element);
        int N = num.length;
        if (N == 0) {
            return result;
        }

        Arrays.sort(num);

        int sameNumber = 0;
        for (int i = 0; i < N; ++i) {
            int current = num[i];

            if (i != 0 && current == num[i - 1]) {
                sameNumber++;
            } else {
                sameNumber = 0;
            }

            int size = result.size();
            for (int j = 0; j < size; ++j) {
                List<Integer> oldElement = result.get(j);

                if (sameNumber != 0) {
                    if (oldElement.size() == 0) {
                        continue;
                    }
                    if (oldElement.get(oldElement.size() - 1) != current) {
                        continue;
                    }
                    int m = 1;
                    for (; m < sameNumber; ++m) {
                        if (oldElement.size() - m - 1 >= 0 && oldElement.get(oldElement.size() - m - 1) == current) {
                            continue;
                        } else {
                            break;
                        }
                    }
                    if (m < sameNumber) {
                        continue;
                    }
                }

                List<Integer> newElement = new ArrayList<Integer>(oldElement);
                newElement.add(current);
                result.add(newElement);
            }
        }
        return result;
    }
}