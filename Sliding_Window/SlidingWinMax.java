import java.util.*;

public class SlidingWinMax{
    //BruteForce approch
    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int max = Integer.MIN_VALUE;
            for(int j=i;j<k;j++){
                max = Math.max(max , nums[j]);
            }
            k = k + 1;
            System.out.println(k);
            temp.add(max);
            if(k > nums.length){
                break;
            }
        }

        int[] arr = temp.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
    //Optilised Approch

    public static int[] maxSlidingWindowOpt(int[] nums, int k){
        
        int n = nums.length;
        int[] ans = new int[n-k+1];
        Deque<Integer> dq = new LinkedList<>();

        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && dq.peek() < i-k+1){
                dq.poll();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.offer(i);
            if(i >= k-1){
                ans[i-k+1] = nums[dq.peek()];
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {1,-1};
        
        System.out.println(Arrays.toString(maxSlidingWindowOpt(arr,1)));    
    }
}