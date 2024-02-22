package ArraysHashing_Medium;

import java.util.*;

public class TopKFrequentElements {
//    With the help of neetcode of course
//    Time complexity : O(n)
//    Space Complexity O(n)
    public static  int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> bucket[] = new ArrayList[nums.length + 1];

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int key : map.keySet()){
          int freq = map.get(key);
          if(bucket[freq]==null){
              bucket[freq] = new ArrayList<>();
          }
          bucket[freq].add(key);
        }

        int index=0;
        int[] result = new int[k];
        for(int i = bucket.length-1;i>0;i--)
        {
            if(bucket[i]!=null){
                for(int j=0;j<bucket[i].size();j++){
                    result[index] = bucket[i].get(j);
                    index++;

                    if(index==k) return result;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,-1,2,-1,2,3};
        topKFrequent(arr,2);
    }
}
