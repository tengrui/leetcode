package com.leetcode.oj.restore_ip_addresses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ipList = new ArrayList<String>();
        int N = s.length();
        if (N < 4 || N > 12) {
            return ipList;
        }

        Map<String, String> tempResult = new HashMap<String, String>();
        int temp = 0;
        for (int i = 0; i < 3; ++i) {
            int x = s.charAt(i) - '0';
            temp = temp * 10 + x;
            if (temp == 0) {
                tempResult.put("" + temp, s.substring(i + 1));
                break;
            } else if (temp < 256) {
                tempResult.put("" + temp, s.substring(i + 1));
            }
        }
        for (int j = 1; j < 4; j++) {
            Map<String, String> newResult = new HashMap<String, String>();
            for (String key : tempResult.keySet()) {
                String sub = tempResult.get(key);
                N = sub.length();
                N = N > 3 ? 3 : N;
        
                temp = 0;
                for (int i = 0; i < N; ++i) {
                    int x = sub.charAt(i) - '0';
                    temp = temp * 10 + x;
                    if (temp == 0) {
                        newResult.put(key + "." + temp, sub.substring(i + 1));
                        break;
                    } else if (temp < 256) {
                        newResult.put(key + "." + temp, sub.substring(i + 1));
                    }
                }
            }
            tempResult = newResult;
        }

        for (String key : tempResult.keySet()) {
            String sub = tempResult.get(key);
            if (sub.isEmpty()) {
                ipList.add(key);
            }
        }
        return ipList;
    }
}
