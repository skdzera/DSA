class Solution {
    public int maxProfit(int[] prices) {
        // 7 2 5 1 3 6 4
        // i built my intuition from above test case
        int i = 0;
        int j = 1;
        int n = prices.length;
        int profit= 0;
        int maxprofit = 0;
        while(j<n){
            if(prices[i]>prices[j]){
                i=j;
                j++;
            }
            else{
                profit = prices[j]- prices[i];
                maxprofit = Math.max(maxprofit, profit);
                j++;
            }
        }
        return maxprofit;
    }
}
