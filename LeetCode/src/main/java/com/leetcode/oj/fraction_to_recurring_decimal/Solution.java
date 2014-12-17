package com.leetcode.oj.fraction_to_recurring_decimal;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        double quotient = ((double)numerator / denominator);
        double remainder = ((double)numerator) % denominator;

        double head = Math.abs(quotient);
        if (head <= 1 && head >= -1) {
            sb.append(0);
        } else {
            while (head > 1) {
                sb.insert(0, (int)(head % 10));
                head /= 10;
            }
        }
        
        if (quotient == 0) {
            if (numerator < 0 && denominator > 0 || numerator > 0 && denominator < 0) {
                sb.insert(0, "-");
            }
        }
        else if (quotient < 0) {
            sb.insert(0, "-");
        }
        
        if (remainder == 0) {
            return sb.toString();
        } else {
            sb.append(".");
        }

        double numerator2 = remainder;
        double remainder2 = remainder;
        int index = 0;
        
        StringBuilder dec= new StringBuilder();
        Map<Double, Integer> duplicateRemainder = new HashMap<Double, Integer>();
        duplicateRemainder.put(remainder2, index++);
        
        while (remainder2 != 0) {
            int quotient2 = (int)((numerator2 * 10) / denominator);
            remainder2 = (numerator2 * 10) % denominator;
            dec.append(Math.abs(quotient2));
            
            if (!duplicateRemainder.containsKey(remainder2)) {
                duplicateRemainder.put(remainder2, index++);
            } else {
                break;
            }
            numerator2 = remainder2;
        };
        
        if (remainder2 == 0) {
            sb.append(dec.toString());
        } else {
            int dup = duplicateRemainder.get(remainder2);
            sb.append(dec.substring(0, dup) + "(" + dec.substring(dup)+ ")");
        }

        return sb.toString();
    }
}
