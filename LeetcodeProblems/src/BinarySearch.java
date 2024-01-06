import com.sun.security.jgss.GSSUtil;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int leftIndex=0;
        int rightIndex = nums.length-1;
        int curr;

        while(leftIndex <= rightIndex){
            curr = (leftIndex+rightIndex)/2;
            if(nums[curr] ==target){
                return curr;
            }

            if(nums[curr] <target){
                leftIndex=curr+1;
            }else{
                rightIndex=curr-1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array = {5};
        System.out.println(search(array,5));
    }
}
