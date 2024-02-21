package ArraysHashing_Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    //    Time complexity: O(n) we iterate only one time through the array and in worst case we traverse the whole array
//    Space complexity : O(n) we might end up putting in the worst case all the equivalent elements of the array in the hashmap.
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(target-nums[i],i);
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] myArray = new int[]{3,3};
        int[] result = twoSum(myArray,6);
        System.out.println(Arrays.toString(result));
    }
}
