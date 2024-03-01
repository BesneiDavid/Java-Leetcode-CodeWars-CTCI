package Stack_Medium;

import java.util.Objects;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> numbers=new Stack<>();

        for(String s:tokens){
            if(Objects.equals(s, "+")){
                numbers.push(numbers.pop()+numbers.pop());
            } else if(Objects.equals(s, "-")){
                int number1 = numbers.pop();
                int number2 = numbers.pop();
                numbers.push(number2-number1);
            } else if(Objects.equals(s,"/")){
                int number1 = numbers.pop();
                int number2 = numbers.pop();
                numbers.push(number2/number1);
            } else if(Objects.equals(s,"*")){
                numbers.push(numbers.pop()*numbers.pop());
            } else {
                numbers.push(Integer.parseInt(s));
            }
        }
        return numbers.pop();
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int first=0;
        int second=0;
        while(nums1[first]!=0 && first<m-1){
            if(nums1[first]<=nums2[second]){
                first++;
            } else {
                nums1[first]=nums2[second];
                second++;
            }
        }
    }

    public static void main(String[] args) {
        String[] arr={"4","3","-"};
        System.out.println(evalRPN(arr));

    }
}
