import java.util.HashMap;

public class SingleNumber {
//   It is not a good solution
//    Time complexity O(n)
//    Space Complexity O(n/2)  -> O(n)
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int uniqueNumber = 0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
                uniqueNumber+=nums[i];
            }else {
                uniqueNumber-=nums[i];
            }
        }
        return  uniqueNumber;
    }
//    Optimal solution:
//    Time complexity O(n) - linear time
//    Space complexity O(1) we're not using any extra memory except a variable

//    Intuitia ii mai greu de gasit aici pentru ca trebuie sa te bazezi pe operatia de XOR de la biti si de ce
//    functioneaza operatia xor in cazul respectiv? pai pentru ca n ^ 0 = 0 deci orice 0 avem in numerele noastre
//    acestea nu vor influenta rezultatul si o sa avem mereu un numar par de biti de 1 cand facem xor deci si aia nu o sa
//    influenteze rezultatul practic o sa fie acel numar unicat care o sa iasa din xor.
    public static int singleNumber2(int[] nums) {
       int result=nums[0];
       for(int i=1;i<nums.length;i++){
           result ^=nums[i];
       }
       return result;
    }
    public static void main(String[] args) {
        int[] array={2,4,3,3,2};
        System.out.println(singleNumber2(array));
    }
}
