package TwoPointers_Easy;

public class IsPalindrome {
//    We're using the two pointer method and a string to iterate through
//    Time Complexity O(c) where c = n/2, so we don't need to iterate through the whole number
//    Space complexity O(log10(x)) ? we iterate through a string edit: that was said by ChatGPT.
    public static boolean isPalindrome(int x) {
        String stringX = String.valueOf(x);
        for(int i=0; i<stringX.length()/2;i++){
            if(stringX.charAt(i) != stringX.charAt(stringX.length()-i-1)){
                return false;
            }
        }
    return true;
    }
    public static boolean isPalindrome2(int x) {
        int copyX = x;
        int sum = 0;
        while(copyX > 0 ){
            sum = sum*10+copyX%10;
            copyX /=10;
        }

        return sum == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome2(121));
    }
}
