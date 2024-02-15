import java.util.HashMap;

public class CheckPermutation {
//    Approach 1: using hashmap
//    Time Complexity: O(n)
//    Space Complexity: O(n) we're using a hashmap
    public static boolean isPermutation(String s, String d){
        if(s.length() == d.length()){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i =0 ;i<=s.length()-1;i++){
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                } else {
                    map.put(s.charAt(i),1);
                }

                if(map.containsKey(d.charAt(i))){
                    map.put(d.charAt(i),map.get(d.charAt(i))-1);
                } else {
                    map.put(d.charAt(i),-1);
                }
            }

            return map.values().stream().allMatch(val -> val == 0);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPermutation("AaBbCcDd","ABCDabcd"));
    }
}
