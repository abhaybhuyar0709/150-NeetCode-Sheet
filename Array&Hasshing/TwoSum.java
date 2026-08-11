import java.util.*;

public class TwoSum {
    public static int[] getEle(int arr[] , int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int comp = target - arr[i];
            if(hm.containsKey(comp)){
                return new int[]{hm.get(comp),i};
            }
            hm.put(arr[i],i);
        }

        return new int[]{0,0};
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;

        System.out.println("The array of index which sum is equal to the "+ target + " is : " + Arrays.toString(getEle(arr,target)));
    }
}
