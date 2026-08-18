import java.util.*;

public class BuySellStock {
    public static int[] buySellStock(int price[] ,int n){
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        int buy = 0;
        int sell = 0;

        for(int i=0;i<n;i++){
            if(price[i] < minPrice){
                minPrice = price[i];
            }
            else if(price[i] - minPrice > maxPrice){
                maxPrice = price[i] - minPrice;
                buy = minPrice;
                sell = i;
            }
        }
    
        System.out.println("The max profit you get is : " + maxPrice);
        return new int[]{buy,price[sell]};
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int price[] = new int[n];
        for(int i=0;i<n;i++){
            price[i] = sc.nextInt();
        }

        System.out.println("When we have to buy and sell the stocks ([Buy,Sell]) so we get max profit : " + Arrays.toString(buySellStock(price,n)));
        
    }
}