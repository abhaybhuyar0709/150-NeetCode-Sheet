

public class MinWindowSubStr {
    public static String minWindow(String s, String t){
        int hash[] = new int[256];

        int l =0  , r = 0;
        int minLen = Integer.MAX_VALUE;
        int count = 0 , sIdx = 0;
        int m = t.length();

        for(int i=0;i<m;i++){
            hash[t.charAt(i)]++;
        }

        while(r < s.length()){
            if(hash[s.charAt(r)] > 0){
                count++;
            }
            hash[s.charAt(r)]--;

            while(count == m){
                if(r - l +1 < minLen){
                    minLen = r - l + 1;
                    sIdx = l;
                }

                hash[s.charAt(l)]++;

                if(hash[s.charAt(l)] > 0){
                    count--;
                }
                l++;
            }
            r++;
        }

        return sIdx == -1 ? "" : s.substring(sIdx , sIdx + minLen);
    }
    public static void main(String[] args) {
        String givenStr = "ADOBECODEBANC";
        String targetStr = "ABC";

        System.out.println("The all chracter of the target string is exist in the substring : " + minWindow(givenStr, targetStr));
    }    
}
