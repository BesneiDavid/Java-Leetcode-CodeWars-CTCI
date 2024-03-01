package Stack_Medium;

import java.util.Stack;

public class MinStack {
    Stack<Integer> aux;
    Stack<Integer> stack;

    public MinStack() {
        this.stack = new Stack<>();
        this.aux = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        val=(Math.min(val,aux.isEmpty()? val:aux.peek()));
        aux.push(val);
    }

    public void pop() {
        stack.pop();
        aux.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return aux.peek();
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-1);
        System.out.println( minStack.getMin() );
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}
