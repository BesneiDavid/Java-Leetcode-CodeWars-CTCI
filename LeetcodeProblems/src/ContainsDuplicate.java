import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    //    Solving the problem utilizing HashSet
//    Time Complexity: O(n) iterating only once through the array
//    Space complexity O(n) in the worst case the checkingSet has all the elements of nums
    public  static boolean containsDuplicate(int[] nums) {
        Set<Integer> checkingSet = new HashSet<>();
        for(int num:nums){
            if(checkingSet.contains(num)){
                return true;
            }
            checkingSet.add(num);
        }
        return false;
    }

    //    Solving the problem utilizing Array.sort
//    Time Complexity: O(n*log(n)) the best case for a sorting method
//    Space complexity O(log(n)) the nums doesn't change sizes
    public  static boolean containsDuplicateSorting(int[] nums) {
        Arrays.sort(nums);
        for(int i=0 ;i <nums.length-1;i++){
            if(nums[i] == nums[i+1])
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array =  {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(array));
        System.out.println(containsDuplicateSorting(array));
    }
}
