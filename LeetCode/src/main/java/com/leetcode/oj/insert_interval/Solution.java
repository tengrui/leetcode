package com.leetcode.oj.insert_interval;

import java.util.ArrayList;
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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<Interval>();

        int newStart = newInterval.start;
        int newEnd = newInterval.end;
        boolean added = false;

        for (Interval inter : intervals) {
            if (inter.end < newStart) {
                result.add(inter);
            } else if (inter.start > newEnd) {
                if (!added) {
                    Interval newInter = new Interval(newStart, newEnd);
                    result.add(newInter);
                    added = true;
                }
                result.add(inter);
            } else if (inter.end >= newStart) {
                newStart = inter.start < newStart ? inter.start : newStart;
                newEnd = inter.end > newEnd ? inter.end : newEnd;
            }
        }
        
        if (!added) {
            Interval newInter = new Interval(newStart, newEnd);
            result.add(newInter);
        }

        return result;
    }
}