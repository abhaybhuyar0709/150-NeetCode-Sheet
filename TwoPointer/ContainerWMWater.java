import java.util.*;

public class ContainerWMWater {
    public static int maxWaterFiled(int arr[]){
        int maxWater = 0;
        int lp = 0;
        int rp = arr.length-1;

        while(lp < rp){
            int height = Math.min(arr[lp],arr[rp]);
            int width = rp - lp;
            int currWater = height * width;
            maxWater = Math.max(maxWater,currWater);

            if(arr[lp] < arr[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ente the size of array : ");
        int  size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the element in array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Area of max water filed : " + maxWaterFiled(arr));
    }
}
