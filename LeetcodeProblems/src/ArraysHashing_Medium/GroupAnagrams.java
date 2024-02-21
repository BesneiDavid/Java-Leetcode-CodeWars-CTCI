package ArraysHashing_Medium;

import java.util.*;

public class GroupAnagrams {

//    My solution with some help (chat)
//    Time complexity: O(n*c*log c) + O(n) n - number of elements in strs, c - number of characters in a string
//    we're using O(n) at the final part because even though we're traversing the inserted elements in the hashmap
//    we're storing each word in the result data structure  so it is n.
//    Space Complexity O(n*c) n - number of string and c - average of characters per word
    public static  List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        String sorted;

        for(String s:strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            sorted = new String(chars);

            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<String>());
            }
            map.get(sorted).add(s);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add( entry.getValue());
        }

        return result;
    }


//    Optimal solution
//    Time Complexity O(m*n*26)
public static  List<List<String>> groupAnagrams2(String[] strs) {
    HashMap<String, ArrayList<String>> map = new HashMap<>();

    for(String s:strs){
        StringBuilder sb= new StringBuilder("");

        int[] count = new int[26];
        for(char c:s.toCharArray()){
            count[ c - 'a']+=1;
        }

        for(int i=0;i<26;i++){
            sb.append('#');
            sb.append(count[i]);
        }

        String key = sb.toString();

        if(!map.containsKey(key)){
            map.put(key,new ArrayList<String>());
        }

        map.get(key).add(s);
    }

    return new ArrayList<>(map.values());
}

    public static void main(String[] args) {
        String[] arr={"eat","tea","tan","ate","nat","bat"};
        groupAnagrams2(arr);
    }
}
