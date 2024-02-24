package TwoPointers_Medium;

public class TwoSumII_InputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
       int left=0;
       int right = numbers.length-1;
        int sum =0;
        while(left<right){
           sum = numbers[left]+numbers[right];
           if(sum==target){
               break;
           }
           if(sum > target){
               right--;
           }else {
               left++;
           }
       }
        return new int[]{left+1,right+1};
    }
    public static void main(String[] args) {
        int[] array={5,25,75};
        twoSum(array,100);
    }
}
