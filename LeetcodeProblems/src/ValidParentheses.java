import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();



        for(char c: s.toCharArray()){
            if(c =='(' || c=='[' || c== '{'){
                stack.push(c);
            }

            if(stack.isEmpty() && ( c ==')' || c ==']' || c =='}')) {
                return false;

            }

                if (c == ')' && stack.pop() != '(') {
                    return false;
                }
                if (c == ']' && stack.pop() != '[') {
                    return false;
                }
                if (c == '}' && stack.pop() != '{') {
                    return false;
                }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("]]"));
    }
}
