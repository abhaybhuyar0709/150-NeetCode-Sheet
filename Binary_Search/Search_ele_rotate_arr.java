import java.util.*;

public class Search_ele_rotate_arr {
    //brute force solution
    public static int  search(int arr[], int target){
        int lp = 0;
        int rp = arr.length-1;

        while(lp  <=rp){
            int mid = (lp + rp) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[lp] <= arr[mid]){
                if(target >= arr[lp] && target < arr[mid]){
                    rp = mid -1;
                }
                else{
                    lp = mid + 1;
                }
            }
            else{
                if(target > arr[mid] && target <= arr[rp]){
                    lp = mid + 1;
                }
                else{
                    rp = mid -1;
                }
            }   
        }
        return -1;
    }

    // My approch
    public static int search_by_my_approch(int arr[], int target){
        int lp = 0;
        int rp = arr.length-1;

        while(lp <= rp){
            if(arr[lp] == target){
                return lp;
            }
            if(arr[rp] == target){
                return rp;
            }
            if(arr[lp] < target){
                lp++;
            }
            else{
                rp--;
            }
        }

        return -1;
    }
    public static void main(String[] arg){
        int arr[] = {4,5,6,7,0,1,2};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the search element : ");;
        int target = sc.nextInt();

        System.out.println("Element " + target + " is found at : " + search(arr, target));
    }
}
