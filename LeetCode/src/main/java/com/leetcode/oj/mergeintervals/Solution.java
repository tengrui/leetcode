package com.leetcode.oj.mergeintervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.leetcode.oj.common.Interval;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        int N = intervals.size();
        if (N <= 1) {
            result.addAll(intervals);
            return result;
        }

        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval object1, Interval object2) {
                if (object1.start == object2.start) {
                    return 0;
                } else if (object1.start < object2.start) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        int newStart = intervals.get(0).start;
        int newEnd = intervals.get(0).end;

        for (int i = 0; i < N; ++i) {
            Interval inter = intervals.get(i);
            if (inter.start > newEnd) {
                result.add(new Interval(newStart, newEnd));
                newStart = inter.start;
                newEnd = inter.end;
            } else if (inter.start <= newEnd) {
                newEnd = newEnd > inter.end ? newEnd : inter.end;
            }
        }
        result.add(new Interval(newStart, newEnd));

        return result;
    }
}