package TwoPointers_Medium;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-2;i++){
            if(i==0 || (i > 0 && nums[i]!=nums[i-1])){
                int target = 0 - nums[i];
                int left = i + 1;
                int right = nums.length - 1;
                while(left<right){
                    int sum = nums[left]+nums[right];
                    if(target==sum){
                        List<Integer> sol= new ArrayList<>();
                        sol.add(nums[i]);
                        sol.add(nums[left]);
                        sol.add(nums[right]);
                        result.add(sol);

                        while(left <right && nums[left]==nums[left+1]){
                            left++;
                        }
                        while(left < right && nums[right]==nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }

                    if(sum > target){
                        right--;
                    }

                    if(sum < target ){
                        left++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={0,1,2,2,3,0,4,2};

        String s = "ggububgvfk";
        System.out.println(lengthOfLongestSubstring(s));
//        System.out.println(threeSum(arr).size());
    }
}
