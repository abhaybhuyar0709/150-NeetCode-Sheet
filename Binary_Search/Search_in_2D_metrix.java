import java.util.*;

public class Search_in_2D_metrix {

    public static String getIndex(int arr[][] , int target){
        int lp = 0;
        int rp = arr.length -1;

        while(lp <= rp){
            int mid = (lp + rp) / 2;

            if(arr[mid][0] <= target && arr[mid][arr[mid].length-1] >= target){
                for(int i=0;i<arr[mid].length;i++){
                    if(arr[mid][i] == target){
                        return "Row : " + mid + " Column : " + i;
                    }
                }
            }
            else if(arr[mid][0] < target){
                lp = mid +1;
            }
            else{
                rp = mid -1;
            }
        }

        return "Element not found";
    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the target : ");
        int target = sc.nextInt();

        System.out.println("Element is found at index : " + getIndex(arr, target));
    }
}
