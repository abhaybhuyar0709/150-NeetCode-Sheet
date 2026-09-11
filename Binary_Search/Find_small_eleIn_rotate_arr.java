import java.util.*;

public class Find_small_eleIn_rotate_arr {
    // brute force solution
    public static int find_small(int arr[]){
        Arrays.sort(arr);

        return arr[0];
    }

    // optimized solution
    public static int find_small_optimized(int arr[]){
        int lp = 0;
        int rp = arr.length - 1;

        while(lp < rp){
            int mid = lp + (rp -lp ) / 2;

            if(arr[mid] <= arr[rp]){
                rp = mid;
            }
            else{
                lp = mid+1;
            }
        }
        return arr[lp];
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println("Smallest element is : " + find_small(arr));
        System.out.println("Smallest element is : " + find_small_optimized(arr));
    }
}
