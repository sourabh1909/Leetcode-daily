class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int currP = 0;

        int day = prices[0];
        for(int i = 1;i<n;i++){
            currP = prices[i]-day;
            max = Math.max(max,currP);
            day = Math.min(day,prices[i]);
        }

        return max;
    }
}