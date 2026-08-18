import java.util.*;

public class LongSubStrWiRepetChar {
    public static void getSubString(String str){
        int i = 0, j= 0 , max = 0;
        
        Set<Character> set = new HashSet<>();
        StringBuilder subStr = new StringBuilder();

        while(i < str.length() && j < str.length()){
            if(!set.contains(str.charAt(i))){
                set.add(str.charAt(i));
                i++;
                max = Math.max(max, set.size());
            }
            else{
                set.remove(str.charAt(j));
                j++;
            }
        }
        
        for(int k=0;k<set.size();k++){
            subStr.append(set);
        }
        System.out.println(max + " " + subStr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        System.out.println("The length of longest substring and substring is : ");
        getSubString(str);
    }    
}
