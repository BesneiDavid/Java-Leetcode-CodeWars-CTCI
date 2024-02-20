public class CountingBits {
//    My solution not optimal
//    Time complexity O(n) approximately
//    Space complexity O(n+1)
    public static int[] countBits(int n) {
        int[] newNumber = new int[n+1];
        newNumber[0]=0;
        for(int i=1;i<=n;i++){
            newNumber[i]=numberOfOne(i);
        }
    return newNumber;
    }

    public static int numberOfOne(int n){
        int counter=0;
        while(n !=0){
            n = n &(n-1);
            counter++;
        }

        return counter;
    }

//    Optimal solution
//    Time complexity O(n)
//    Space complexity O(n)
    public static int[] countBits2(int n) {
        int[] dp = new int[n+1];
        dp[0]=0;
        int offset=1;
        for(int i=1; i<=n;i++){
            if(offset*2==i){
                offset=i;
            }
            dp[i] = 1+ dp[i-offset];
        }
        return dp;
    }

    public static void main(String[] args) {
        countBits(5);
    }
}
