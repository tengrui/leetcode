package com.leetcode.oj.common;

/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class RandomListNode {
    public int label;
    public RandomListNode next, random;

    public RandomListNode(int x) {
        this.label = x;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbr = new StringBuilder();
        
        RandomListNode n = next;
        if (random != null) {
            sbr.append(label).append("->").append(random.label).append("\n");
        } else {
            sbr.append(label).append("->null\n");
        }
        
        sb.append(label);
        while (n != null) {
            sb.append("->").append(n.label);
            
            if (n.random != null) {
                sbr.append(n.label).append("->").append(n.random.label).append("\n");
            } else {
                sbr.append(n.label).append("->null\n");
            }
            
            n = n.next;
        }
        return sb.toString() + "\n" + sbr.toString();
    }
};