import java.util.Arrays;
import java.util.HashMap;

public class isUnique {

//    Approach-ul 1 using HashMap
//    Time Complexity: O(n) we iterate through the whole string
//    Space Complexity :O(n) in the worst case scenario we put each character from the string in the hashmap
    public static boolean isStringUnique(String s){
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<=s.length()-1;i++){
            if(map.containsKey(s.charAt(i))){
                return false;
            }
            map.put(s.charAt(i),1);
        }
        return true;
    }


//    Approach 2: using an array and sorting the string
//    Time Complexity: O(n*log n)
//    Space Complexity: O(n)
    public static boolean isStringUnique2(String s){
        char[] array;
        if(s !=null){
            array=s.toCharArray();
            Arrays.sort(array);
            int i=0;
            while((i+1)<=s.length()-1){
                if(array[i]==array[i+1]){
                    return false;
                }
                i++;
            }
        }
        return true;
    }


//    Approach 3: no additional data structures used at all
//    Time complexity: O(n^2)
//    Space complexity: O(1)
    public static boolean isStringUnique3(String s){
        for(int i=0;i<s.length()-1;i++){
            for (int j=0;j<s.length()-1;j++){
                if(s.charAt(i)==s.charAt(j))
                    return false;
            }
        }

       return true;
    }


    public static void main(String[] args) {
        System.out.println(
        isStringUnique3("___asdqwe"));
    }
}
