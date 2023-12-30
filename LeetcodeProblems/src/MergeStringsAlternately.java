import java.util.Objects;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();
        int min = Math.min(word2.length(),word1.length());
        for(int i=0;i<min;i++){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        if(word1.length()<word2.length()){
            result.append(word2.substring(min));
        } else {
            result.append(word1.substring(min));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd","pq"));
    }
}
