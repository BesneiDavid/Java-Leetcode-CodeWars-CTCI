package ArraysHashing_Easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())  return false;
        Map<Character,Integer> mapForS = new HashMap<>();
        Map<Character,Integer> mapForT = new HashMap<>();

        for(int i=0; i<s.length();i++){
            if(mapForS.containsKey(s.charAt(i))) {
                mapForS.put(s.charAt(i), mapForS.get(s.charAt(i)) + 1);
            } else {
                mapForS.put(s.charAt(i), 1);
            }

            if(mapForT.containsKey(t.charAt(i))) {
                mapForT.put(t.charAt(i), mapForT.get(t.charAt(i)) + 1);
            } else {
                mapForT.put(t.charAt(i), 1);
            }
        }

        return mapForS.equals(mapForT);
    }

    //    A much better version because
//    Time Complexity is O(n+c) we're still looping thorough the whole string in worst case plus
//    we're streaming to make sure each value is ==0
//    Space complexity is O(n) because we're still using a HashMap that contains the whole string or n elements
    public static boolean isAnagram2(String s, String t) {
        if(s.length() != t.length())  return false;
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)-1);
        }
        return map.values().stream().allMatch(value -> value==0);
    }

    public static boolean isAnagram3(String s, String t) {
        if(s.length() != t.length())  return false;
        int[] array = new int[26];

        for(int i=0;i<s.length();i++){
            array[s.charAt(i)-'a']++;
            array[t.charAt(i)-'a']--;
        }
        for(int n:array) if(n!=0) return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram3("anagram","naagram"));
    }
}
