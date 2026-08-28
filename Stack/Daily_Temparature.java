import java.util.*;

public class Daily_Temparature {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of days : ");
        int n = sc.nextInt();

        int[] temp = new int[n];
        System.out.println("Enter the temperature of each day : ");
        for(int i=0;i<n;i++){
            temp[i] = sc.nextInt();
        }

        System.out.println("Form this day the next warmer day is : " + Arrays.toString(dailyTemperatures(temp)));
    }
}
