import java.util.*;

public class ValidPoli {
    public static boolean isPolindrone(String str){
        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        System.out.println("Is the string is Polindrone : " + isPolindrone(str));
    }
}