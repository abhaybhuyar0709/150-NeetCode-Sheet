import java.util.*;

public class GenerateParanthesis {
    public static List<String> getList(int n){
        List<String> result = new ArrayList<>();
        backtracking(result,"" , 0 , 0 ,n);
        return result;
    }

    public static void backtracking(List<String> result ,String current, int open , int close, int max){
        if(current.length() == max * 2){
            result.add(current);
            return;
        }

        if(open < max){
            backtracking(result, current+"(", open+1, close, max);
        }
        if(close < open){
            backtracking(result, current+")", open, close+1, max);
        }   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of paranthesis generate : ");
        int n = sc.nextInt();
        
        List<String> result = getList(n);
        System.out.println("Paranthesis is : " +  result);
    }
}
