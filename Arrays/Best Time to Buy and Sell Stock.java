// brute-force approach  --> TLE error
class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
               if(max<(prices[j]-prices[i])) max=prices[j]-prices[i];
            }
        }
        return max;
    }
}

// Best Solution
class Solution {
    public int maxProfit(int[] prices) {
        int min_price=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            min_price=Math.min(prices[i],min_price);
            profit=Math.max(prices[i]-min_price,profit);
        }
        return profit;
    }
}
