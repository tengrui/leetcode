package com.leetcode.oj.accepted;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.leetcode.oj.common.Interval;
import com.leetcode.oj.merge_intervals.Solution;

public class MergeIntervalsTestCase extends TestCase {

    Solution solution = new Solution();
    long startTime = 0L;

    protected void setUp() throws Exception {
        super.setUp();
        startTime = System.currentTimeMillis();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime));
    }

    //    Given [1,3],[2,6],[8,10],[15,18],
    //    return [1,6],[8,10],[15,18]. 
    public void testCase1() {
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));

        List<Interval> result = solution.merge(intervals);
        System.out.println(result);
    }

    //[[1,4],[0,4]]
    public void testCase2() {
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 4));
        intervals.add(new Interval(0, 4));

        List<Interval> result = solution.merge(intervals);
        System.out.println(result);
    }
}
