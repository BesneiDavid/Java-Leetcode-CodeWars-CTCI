public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        return array[array.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
