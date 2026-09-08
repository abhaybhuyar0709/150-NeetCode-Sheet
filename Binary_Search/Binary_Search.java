import java.util.*;

public class Binary_Search{
    public static int getIndex(int arr[] , int target){
        int lp = 0;
        int rp = arr.length -1;

        while(lp <= rp){
            int mid = (lp + rp) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                lp = mid +1;
            }
            else{
                rp = mid -1;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the element in the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of the target : ");
        int target = sc.nextInt();

        System.out.println("Element is found at index : " + getIndex(arr, target));
    }
}