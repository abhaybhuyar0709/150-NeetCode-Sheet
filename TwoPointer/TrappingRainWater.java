
public class TrappingRainWater {
    //Best way to solve this question
    public static int trapedWaterOp(int arr[]){
        int left = 0;
        int right = arr.length -1;
        int leftmax = arr[0];
        int rightmax = arr[arr.length-1];

        int water = 0;
        while(left < right){
            if(leftmax < rightmax){
                left++;
                leftmax = Math.max(leftmax, arr[left]);
                water += leftmax - arr[left];
            }
            else{
                right--;
                rightmax = Math.max(rightmax, arr[right]);
                water += rightmax - arr[right];
            }
        }
        return water;
    }
    //Another way to solve this question is using two pointer approach
    public static int trapedWater(int arr[]){
        int n = arr.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = arr[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }

        rightMax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i=0;i<n;i++){
            trappedWater += Math.min(leftMax[i],rightMax[i]) - arr[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5};

        System.out.println("The  max area of water trap in the container is " + trapedWaterOp(arr));
    }
}