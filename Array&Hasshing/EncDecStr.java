import java.util.*;

public class EncDecStr {
    public static String encodStr(List<String> str){
        StringBuilder sb = new StringBuilder();
        for(String s : str){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public static List<String> decodStr(String str){
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            String word = str.substring(j+1,j+1+len);
            list.add(word);
            i = j+1+len;
        }

        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        System.out.println("Enter the number of element to store : ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter " + n +" element : ");
        for(int i=0;i<n;i++){
            list.add(sc.nextLine());
        }

        String encStr = encodStr(list);
        System.out.println("The encode string is : " + encStr);

        List<String> decStr = decodStr(encStr);
        System.out.println("The decoded list is : "  + decStr);
    }
}
