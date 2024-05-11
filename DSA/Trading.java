// Problem Statement:
// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

class Trading {
    public int maxProfit(int[] prices) {
        // check for empty or null array
        if (prices == null || prices.length == 0) {
            return 0;
        }

        // initialize min price and max profit
        int minPrice = prices[0];
        int maxProfit = 0;

        // scan through the prices array
        for (int i = 1; i < prices.length; i++) {
            // update max profit if necessary
            if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }

            // update min price if necessary
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}