package com.leetcode.oj.accepted;

import java.util.ArrayList;
import java.util.List;

import com.leetcoce.oj.insertinterval.Solution;
import com.leetcode.oj.common.Interval;

import junit.framework.TestCase;

public class InsertIntervalTestCase extends TestCase {
    Solution solution = new Solution();
    long startTime = 0L;

    protected void setUp() throws Exception {
        super.setUp();
        startTime = System.currentTimeMillis();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("Time elapsed: "
                + (System.currentTimeMillis() - startTime));
    }

    // Example 1:
    // Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].
    public void testCase1() {
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 9));

        Interval newInterval = new Interval(2, 5);
        List<Interval> result = solution.insert(intervals, newInterval);
        System.out.println(result);
    }

    // Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as
    // [1,2],[3,10],[12,16].
    public void testCase2() {
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(6, 7));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(12, 16));

        Interval newInterval = new Interval(4, 9);
        List<Interval> result = solution.insert(intervals, newInterval);
        System.out.println(result);
    }

    public void testCase3() {
        List<Interval> intervals = new ArrayList<Interval>();

        Interval newInterval = new Interval(5, 7);
        List<Interval> result = solution.insert(intervals, newInterval);
        System.out.println(result);
    }

    public void testCase4() {
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 5));

        Interval newInterval = new Interval(2, 3);
        List<Interval> result = solution.insert(intervals, newInterval);
        System.out.println(result);
    }

    public void testCase5() {
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 5));

        Interval newInterval = new Interval(5, 7);
        List<Interval> result = solution.insert(intervals, newInterval);
        System.out.println(result);
    }

    public void testCase6() {
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 5));

        Interval newInterval = new Interval(0, 0);
        List<Interval> result = solution.insert(intervals, newInterval);
        System.out.println(result);
    }
}
