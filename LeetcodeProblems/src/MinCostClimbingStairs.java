public class MinCostClimbingStairs {
//    Solution solved only through leetcode hints :(((
//    Time complexity : O(n*c) c - time necessary to compare two numbers
//    Space complexity: O(n)
    public static int minCostClimbingStairs(int[] cost){
        int n=cost.length;
        int[] dp = new int[n+1];
        dp[n]=0;
        dp[n-1]=cost[n-1];

        for(int i =n-2; i>=0; i--){
            dp[i] = cost[i]+ Math.min(dp[i+1],dp[i+2]);
        }

        return Math.min(dp[0],dp[1]);
    }

//    Optimized solution
//    Time complexity O(n*c)
//    Space complexity: O(1) we're using variables
    public static int minCostClimbingStairs2(int[] cost){
        int n=cost.length;
        int one = cost[n-1];
        int two=0;
        int temp=0;
        for(int i =n-2; i>=0; i--){
            temp = one;
            one = cost[i] + Math.min(one,two);
            two = temp;
        }
        return Math.min(one,two);
    }

    public static void main(String[] args) {
        int[] arr = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs2(arr));
    }
}
