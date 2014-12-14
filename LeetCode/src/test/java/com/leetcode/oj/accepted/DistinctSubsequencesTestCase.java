package com.leetcode.oj.accepted;

import junit.framework.TestCase;

import com.leetcode.oj.distinct_subsequences.Solution;


public class DistinctSubsequencesTestCase extends TestCase {

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
        int result = solution.numDistinct("rabbbit", "rabbit");
        System.out.println(result);
        assertTrue(result == 3);
    }
    public void testCase2() {
        int result = solution.numDistinct("ccc", "c");
        System.out.println(result);
        assertTrue(result == 3);
    }
    public void testCase3() {
        int result = solution.numDistinct("aabdbaabeeadcbbdedacbbeecbabebaeeecaeabaedadcbdbcdaabebdadbbaeabdadeaabbabbecebbebcaddaacccebeaeedababedeacdeaaaeeaecbe", "bddabdcae");
        System.out.println(result);
        //assertTrue(result == 3);
    }
    public void testCase4() {
        int result = solution.numDistinct("daacaedaceacabbaabdccdaaeaebacddadcaeaacadbceaecddecdeedcebcdacdaebccdeebcbdeaccabcecbeeaadbccbaeccbbdaeadecabbbedceaddcdeabbcdaeadcddedddcececbeeabcbecaeadddeddccbdbcdcbceabcacddbbcedebbcaccac", "ceadbaa");
        System.out.println(result);
        //assertTrue(result == 3);
    }
    public void testCase5() {
        int result = solution.numDistinct("babgbag", "bag");
        System.out.println(result);
        //assertTrue(result == 3);
    }
    public void testCase6() {
        int result = solution.numDistinct("", "a");
        System.out.println(result);
        //assertTrue(result == 3);
    }
}
