public class StringCompression {

    public static String compression(String s){
        if(s.isEmpty()) return "";

        StringBuilder compressedString = new StringBuilder();
        char currentChar = s.charAt(0);
        int counter=1;

        for(int i=0;i<s.length();i++){
            if(currentChar == s.charAt(i)){
                counter++;
            } else {
                compressedString.append(currentChar).append(counter);
                currentChar=s.charAt(i);
                counter=1;
            }
        }
        compressedString.append(currentChar).append(counter);

        return compressedString.length() >= s.length() ? s:compressedString.toString();
    }

    public static void main(String[] args) {
        System.out.println(compression("aa"));
    }
}
