import java.util.*;

public class Min_Stack {
    // Two methods solution using stack
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public Min_Stack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int poppedValue = stack.pop();
            if (poppedValue == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Min_Stack minStack = new Min_Stack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("Minimum value: " + minStack.getMin()); // Returns -3
        minStack.pop();
        System.out.println("Top value: " + minStack.top());    // Returns 0
        System.out.println("Minimum value: " + minStack.getMin()); // Returns -2
    }
}
