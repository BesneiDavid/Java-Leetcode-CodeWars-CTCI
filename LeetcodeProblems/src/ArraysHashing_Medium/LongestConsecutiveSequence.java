package ArraysHashing_Medium;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longestSeq=0;
        for(int num:nums) set.add(num);

        for(int num:nums){
            if(!set.contains(num-1)){
               int count=1;
                while (set.contains(num+1)){
                    count++;
                    num++;
                }

               longestSeq=Math.max(longestSeq,count);
            }

            if(longestSeq > nums.length/2) break;
        }

        return longestSeq;
    }

    public static void main(String[] args) {
        int[] arr= {0,3,7,2,5,8,4,6,0,1};
        System.out.println( longestConsecutive(arr));
    }
}
