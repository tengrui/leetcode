package com.leetcode.oj.best_time_to_buy_and_sell_stock_iii;

public class Solution {
    public int maxProfit(int [] prices) {
        int N = prices.length;
        if (N < 2) {
            return 0;
        }

        int [] firstTransactionProfit = new int[N];
        int buyPrice = prices[0];
        int result = 0;
        for (int i = 1; i < N; ++i) {
            if (prices[i] > buyPrice) {
                result = Math.max(result, prices[i] - buyPrice);
                firstTransactionProfit[i] = result;
            } else {
                firstTransactionProfit[i] = result;
                buyPrice = prices[i];
            }
        }

        int salePrice = prices[N - 1];
        
        for (int i = N - 2; i > 1; --i) {
            if (prices[i] < salePrice) {
                int secondProfit = salePrice - prices[i];
                int totalProfit = secondProfit + firstTransactionProfit[i - 1];
                if (result < totalProfit) {
                    result = totalProfit;
                }
            } else {
                salePrice = prices[i];
            }
        }
        return result;
    }
}
