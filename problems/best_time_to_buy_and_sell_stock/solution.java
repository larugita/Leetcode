class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // is today cheaper than anything I've seen? if so, that's my new buy price
            if(prices[i] < minPrice) minPrice = prices[i];
            // otherwise, what if I sold today? is that better than my best profit?
            else if(prices[i] - minPrice > maxProfit) maxProfit = prices[i] - minPrice;
        }

        return maxProfit;
        
    }
}