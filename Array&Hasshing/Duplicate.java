import java.util.*;

public class Duplicate {
    //BruteForce Approch 
    public static int getDupli(int arr[]){
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                count++;
            }
            if(count == 1){
                return arr[i];
            }
        }
        return -1;
    }

    //Optimised Approch
    public static int getDupliOp(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return arr[i];
            }
            else{
                set.add(arr[i]);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the data in the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The duplicate element is : " + getDupli(arr));
    }
}
