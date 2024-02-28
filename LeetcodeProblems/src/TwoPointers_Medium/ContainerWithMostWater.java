package TwoPointers_Medium;

import java.util.ArrayList;
import java.util.List;

public class ContainerWithMostWater {
    public static  int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxWeight=1;
        int currentWeight;

        while(left<right){
            currentWeight = (right-left)*Math.min(height[left],height[right]);

            if(height[left]<height[right]){
                left++;
            } else {
                right--;
            }

            if(height[left]==height[right]){
                break;
            }
            maxWeight= Math.max(currentWeight,maxWeight);
        }

        return maxWeight;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList();
        for(int i=0;i<numRows;i++){
            List<Integer> currentList = new ArrayList<>();
            currentList.add(0,1);
            int j=1;
            while(i > 1 && j<i){
                currentList.add(j,list.get(i-1).get(j-1)+list.get(i-1).get(j));
                j++;
            }
            if(i>=1){
                currentList.add(currentList.size(),1);
            }
            list.add(i,currentList);
        }

        return list;
    }



    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
//        System.out.println(maxArea(arr));
        generate(5);
    }

}
