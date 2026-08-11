import java.util.*;

public class Two_Sum2ArrSort {
    public static void targetSum(int arr[],int target){
        int lp = 0;
        int rp = arr.length-1;
        while(lp < rp){
            if(arr[lp] + arr[rp] == target){
                System.out.println("The pair is : " + arr[lp] + " and " + arr[rp]);
            }
            if(arr[lp] + arr[rp] < target){
                lp++;
            }
            else{
                rp--;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Entet the sorted element in array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of target : ");
        int target = sc.nextInt();

        targetSum(arr,target);
    }
}
