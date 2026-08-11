import java.util.*;

public class LongConNum {
    public static int maxConsEle(int arr[]){
        if(arr == null || arr.length == 0){
            return 0;
        }

        Arrays.sort(arr);
        int count = 1;
        int max = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                continue;
            }
            if(arr[i] == arr[i-1] + 1){
                count++;
            }
            else{
                max = Math.max(count , max);
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {100,4,200,1,3,2};

        System.out.println("The longest consecutive element in array is : " + maxConsEle(arr));
    }
}
