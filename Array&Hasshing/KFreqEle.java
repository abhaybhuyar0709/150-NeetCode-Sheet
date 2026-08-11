import java.util.*;

public class KFreqEle {
    public static int[] topKFrequent(int arr[], int k){
        if(arr == null || arr.length == 0){
            return new int[0];
        }

        Map<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)-> b.getValue() - a.getValue());

        int result[] = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = list.get(i).getKey();
        }   

        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;

        System.out.println("So the Frequent element in the array is : " + Arrays.toString(topKFrequent(arr,k)));
    }
}
