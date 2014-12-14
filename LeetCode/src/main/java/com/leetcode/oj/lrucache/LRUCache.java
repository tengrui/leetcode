package com.leetcode.oj.lrucache;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
    private int capacity = 0;
    private Map<Integer, Integer> cache = new HashMap<Integer, Integer>();;
    private Map<Integer, Integer> counter = new HashMap<Integer, Integer>();;
    private Deque<Integer> lru = new LinkedList<Integer>();;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            lru.addLast(key);
            int count = counter.get(key);
            counter.put(key, count + 1);

            return cache.get(key);
        } else {
            return -1;
        }
    }

    public void set(int key, int value) {
        if (capacity == 0) {
            return;
        } else if (cache.containsKey(key)) {
            lru.addLast(key);
            int count = counter.get(key);
            counter.put(key, count + 1);

            cache.put(key, value);
        } else if (!cache.containsKey(key)) {
            while (cache.size() >= capacity) {
                int first = lru.pollFirst();
                int count = counter.get(first);
                if (count == 1) {
                    counter.remove(first);
                    cache.remove(first);
                } else {
                    counter.put(first, count - 1);
                }
            }
            lru.addLast(key);
            cache.put(key, value);
            Integer count = counter.get(key);
            if (count == null) {
                counter.put(key, 1);
            } else {
                counter.put(key, count + 1);
            }
            counter.put(key, 1);
        }

    }
}
