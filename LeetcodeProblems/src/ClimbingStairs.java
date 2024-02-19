public class ClimbingStairs {
//    I feel dumb: this will be bottom-up solution
//    O(n) time complexity
//    O(n+1) space complexity
    public static int climbStairs(int n){
        if(n<=2 ){
            return n;
        }

        int[] dp = new int[n+1];
        dp[1]=1;
        dp[2]=2;

        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }


//    Optimal solution:
//    O(n) time complexity
//    O(1) space complexity
    public static int climbStairs2(int n){
        int a=1;
        int b=1;
        int c;

        for(int i=0;i<n-1;i++){
            c=a+b;
            a=b;
            b=c;
        }

        return b;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }
}
