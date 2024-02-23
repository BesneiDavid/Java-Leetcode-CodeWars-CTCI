package ArraysHashing_Medium;

public class ProductofArrayExceptSelf {
//    Time complexity O(n) - technically O(2n) but it is just O(n) in theory we're not account for constants
//    Space Complexity: O(1) we're not accounting for the result array
    public static int[] productExceptSelf(int[] nums) {
        int prefix =1;
        int postfix =1;
        int[] result = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            result[i]= prefix;
            prefix*=nums[i];
        }
        for(int j=nums.length-1;j>=0;j--){
            result[j] *=postfix;
            postfix*=nums[j];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        productExceptSelf(arr);
    }
}
