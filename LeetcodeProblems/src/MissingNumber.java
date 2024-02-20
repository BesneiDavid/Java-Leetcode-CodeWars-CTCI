public class MissingNumber {
//    My solution  differs a little from the optimal one
//    Space complexity O(1)
//    Time complexity O(n);
    public static int missingNumber(int[] nums) {
        int sumNr=0;
        int sumNums=0;
        for(int i=0;i<nums.length;i++){
            sumNr+=i+1;
            sumNums +=nums[i];
        }
        return sumNr-sumNums;
    }

//    Optimal solution which take inspiration from using the sum 1+2+....+n = n(n+1)/2
public static int missingNumber2(int[] nums) {
   int sum=0;
   int totalSum = (nums.length*(nums.length+1))/2;
    for (int num : nums) {
        sum += num;
    }
   return totalSum-sum;
}

    public static void main(String[] args) {
        int[] arr= {9,6,4,2,3,5,7,0,1};
        System.out.println( missingNumber2(arr));
    }
}
