/*
Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future
to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

 */

package com.nj.leetcode;

public class BuySellStocks {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyDate =-1;
        int sellDate = -1;

        for(int i = 0 ; i < prices.length ; i++){
            for(int j = i+1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if(profit > maxProfit) {
                    maxProfit = profit;
                    buyDate = i;
                    sellDate = j;

                }
//                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
        System.out.println("Buy Date = " + buyDate + " and Sell Date = " + sellDate);
        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        System.out.println("Maximum profit = " + maxProfit(prices));

    }
}
