class Solution {
    public int maxProfit(int[] prices) {
        int buy_price=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if (buy_price < prices[i]){
                int profit=prices[i]-buy_price;
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buy_price=prices[i];
            }

        }
        return maxProfit;
    }
}
