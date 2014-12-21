package com.leetcode.oj.accepted;

import com.leetcode.oj.excel_sheet_column_title.Solution;

import junit.framework.TestCase;

public class ExcelSheetColumnTitleTestCase extends TestCase {

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

    public void testCase1() {
        String result = solution.convertToTitle(53);
        System.out.println(result);
        assertTrue(true);
    }
}
