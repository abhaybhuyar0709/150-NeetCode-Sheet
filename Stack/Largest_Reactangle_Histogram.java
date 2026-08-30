import java.util.*;

public class Largest_Reactangle_Histogram {
    // Single loop solution using stack
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }

    // Multiple loop solition using stack
    public static int largestRectangleAreaMultipleLoop(int[] heights) {
        int n = heights.length;
        int left[] = new int[n];
        int right[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }   

        stack.clear();  

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            maxArea = Math.max(maxArea, heights[i] * width);
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int height[] = {2,1,5,6,2,3};

        System.out.println("Largest Rectangle Area is : " + largestRectangleArea(height));
        System.out.println("Largest Rectangle Area using multiple loop is : " + largestRectangleAreaMultipleLoop(height));
    }
}
