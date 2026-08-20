import java.util.*;

public class PermutationStr {
    public static boolean isFrequency(int[] freq1 , int[] freq2){
        for(int i=0;i<26;i++){
            if(freq1[i] != freq2[i]){
                System.out.println(Arrays.toString(freq1) + " " + Arrays.toString(freq2));
                return false;
            }
        }
        return true;
    }
    public static  boolean checkInclusion(String s1, String s2) {
        int freq[] = new int[26];
        for(int i=0;i<s1.length();i++){
            int idx = s1.charAt(i) - 'a';
            freq[idx]++;
        }
        int widSize =  s1.length();

        for(int i=0;i<s2.length();i++){
            int wididx = 0, idx = i;
            int widFreq[]= new int[26];

            while(wididx < widSize && idx < s2.length()){
                widFreq[s2.charAt(idx) - 'a']++;
                wididx++; idx++;
            }
            if(isFrequency(freq,widFreq)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string : ");
        String str2 = sc.nextLine();

        System.out.println("Is the first string is the permutation of the sencond : " + checkInclusion(str1,str2));
    }
}
