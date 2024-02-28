package SlidingWindow_Medium;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
//    Neetcode solution
//    Time complexity: O(n*c) we're looping through the array once hence n and c - number of chars we go through to check if
//    we have the character
//    Space complexity: O(n) n - number of chars in the s string.
    public  int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int max=0;

        for(int i=0;i<s.length();i++){
            if(list.contains(s.charAt(i))){
                int index = list.lastIndexOf(s.charAt(i));

                list.remove(index);
                if(index>0){
                    list.subList(0,index).clear();
                }
            }
            list.add(s.charAt(i));
            max = Math.max(list.size(),max);
        }
        return max;
    }

//    My solution: pretty much the same but using StringBuilder
public static int lengthOfLongestSubstring2(String s) {
        StringBuilder result= new StringBuilder();
        int max=0;
        int index=0;

        while(index<s.length()){
            int currentIndex= result.indexOf(String.valueOf(s.charAt(index)));
            if(currentIndex!=-1) {
                if(currentIndex==0){
                    result.deleteCharAt(currentIndex);
                }else {
                    result.delete(0,currentIndex+1);
                }
            }
            result.append(s.charAt(index));
            max=Math.max(max,result.length());
            index++;
        }
        return max;
    }
}
