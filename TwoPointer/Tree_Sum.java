import java.util.*;

public class Tree_Sum {
    public static List<List<Integer>> getList(int arr[]){
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }

            int j = i+1;
            int k = arr.length -1;

            while(j < k){
                int val = arr[i] + arr[j] +arr[k];

                if(val > 0){
                    k--;
                }
                else if(val < 0){
                    j++;
                }
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);temp.add(arr[j]);temp.add(arr[k]);
                    li.add(temp);
                    j++;
                    k--;

                    while(j > k && arr[j] == arr[j+1]){
                        j++;
                    }
                }
            }
        }
        return li;
    }
    public static void main(String args[]){
        int arr[] = {-1,0,1,2,-1,-4};

        List<List<Integer>> li = getList(arr);
        System.out.println("The elements which sum is equal to 0 : " + li);
    }
}
