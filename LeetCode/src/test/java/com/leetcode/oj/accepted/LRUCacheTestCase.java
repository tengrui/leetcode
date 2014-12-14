package com.leetcode.oj.accepted;


import com.leetcode.oj.lru_cache.LRUCache;

import junit.framework.TestCase;

public class LRUCacheTestCase extends TestCase {
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
        LRUCache cache = new LRUCache(3);
        cache.set(0, 0);
        int r = cache.get(0);
        r = cache.get(0);
        assertTrue(r == 0);
    }
    
    //3,[set(1,1),set(2,2),set(3,3),set(4,4),get(4),get(3),get(2),get(1),set(5,5),get(1),get(2),get(3),get(4),get(5)]
    public void testCase2() {
        LRUCache cache = new LRUCache(3);
        cache.set(1,1);
        cache.set(2,2);
        cache.set(3,3);
        cache.set(4,4);
        cache.get(4);
        cache.get(3);
        cache.get(2);
        cache.get(1);
        cache.set(5,5);
        cache.get(1);
        cache.get(2);
        cache.get(3);
        cache.get(4);
        cache.get(5);
        //assertTrue(r == 0);
    }
}
