import java.util.*;

public class Car_Fleet {
    public static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] cars = new double[n][2];

        for(int i=0;i<n;i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars , (a,b) -> Double.compare(b[0] , a[0]));
        Stack<Double> stack = new Stack<>();

        for( double[] car : cars){
            double pos = car[0];
            double spe = car[1];
            double time = (target - pos) / spe;

            if(stack.isEmpty() || time > stack.peek()){
                stack.push(time);
            }
        }

        return stack.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of cars : ");
        int n = sc.nextInt();
        int[] position = new int[n];
        int speed[] = new int[n];

        System.out.println("Enter the position of cars : ");
        for (int i = 0; i < n; i++) {
            position[i] = sc.nextInt();
        }

        System.out.println("Enter the speed of cars : ");
        for (int i = 0; i < n; i++) {
            speed[i] = sc.nextInt();
        }

        System.out.println("Enter the target : ");
        int target = sc.nextInt();  

        System.out.println("The number of car fleets is: " + carFleet(target,position,speed));
    }
}
