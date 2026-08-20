import java.util.*;

public class LongRepCharReple{
    public static int characterReplacement(String s, int k){
        int lp = 0, rp = 0, maxF = 0;
        int maxLen = 0;

        int count[] = new int[26];

        while(rp < s.length()){
            count[s.charAt(rp) - 'A']++;
            maxF = Math.max(maxF, count[s.charAt(rp) - 'A']);

            while((rp - lp + 1) - maxF > k){
                count[s.charAt(lp) - 'A']--;
                maxF =0;
                for(int i=0;i<26;i++){
                    maxF = Math.max(maxF, count[i]);
                }
                lp++;
            }

            if((rp - lp + 1) - maxF <= k){
                maxLen = Math.max(maxLen, (rp -lp + 1));
            }
            rp++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        System.out.println("Enter the key : ");
        int key = sc.nextInt();

        System.out.println("The length of the largest repeting character by replacing is : " + characterReplacement(str,key));
    }
}