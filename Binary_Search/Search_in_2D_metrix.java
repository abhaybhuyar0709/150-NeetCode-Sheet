import java.util.*;

public class Search_in_2D_metrix {

    //Brute force solution
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

    //Optimized solution
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m - 1;

        while (low <= high) {
            int medium = low + (high - low) / 2;

            if (target < matrix[medium][0]) {
                high = medium - 1;
            } else if (target > matrix[medium][n - 1]) {
                low = medium + 1;
            } else {
                // target is in this row's range — reset left/right for this row
                int left = 0, right = n - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (target == matrix[medium][mid])
                        return true;
                    else if (target < matrix[medium][mid])
                        right = mid - 1;
                    else
                        left = mid + 1;
                }
                return false; // row was right, value isn't in it
            }
        }
        return false;
    }

    public static void main(String args[]){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the target : ");
        int target = sc.nextInt();

        System.out.println("Element is found at index : " + getIndex(arr, target));
    }
}
