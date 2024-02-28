package SlidingWindow_Medium;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        int[] array=new int[26];
        int max=0;
        int ans=0;

        int left=0;
        for(int right=0;right<s.length();right++){
            array[s.charAt(right)-'A']++;
            max=Math.max(max,array[s.charAt(right)-'A']);
            if(right-left+1-max > k){
                array[s.charAt(left)-'A']--;
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA",1));
    }
}
