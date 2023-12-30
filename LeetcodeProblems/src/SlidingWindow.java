public class SlidingWindow {
//    Time Complexity O(n) we're traversing only one the array
//    Space complexity O(1) we're using 3 variables so yeah O(3) but it's really O(1) because all constant.
    public static int maxProfit(int[] prices) {
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

    public static void main(String[] args) {
        int[] array= {7,6,4,3,1};
        System.out.println(maxProfit(array));
    }
}
