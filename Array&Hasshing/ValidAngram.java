import java.util.*;

public class ValidAngram {

    public static boolean isAnagram(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1) + " " + Arrays.toString(ch2));

        return Arrays.equals(ch1, ch2);
    }
    //Optimised Approch
    public static boolean isAnagramOp(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0;i<s1.length();i++){
            if(ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string : ");
        String str2 = sc.nextLine();

        System.out.println("Is the string " + str1 +" is the anagram of the string " + str2 + " : " + isAnagram(str1,str2));
    }
}
