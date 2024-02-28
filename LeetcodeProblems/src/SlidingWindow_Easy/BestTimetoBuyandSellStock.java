package SlidingWindow_Easy;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int currProfit=0;
        int p1=0,p2=1;
        for(int i=0;i<prices.length-1;i++){
            if(prices[p1] < prices[p2] && p1<p2) {
                currProfit = Math.max(currProfit, prices[p2] - prices[p1]);
            }else {
                p1=p2;
            }
            p2++;
        }

        return currProfit;
    }
}
