import java.util.*;

public class GrupAnagram {
    public static List<List<String>> gropuAngram(String str[]){
        if(str == null || str.length == 0){
            return new ArrayList<>();
        }

        Map<String,List<String>> map = new HashMap<>();

        for(String s : str){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String str[] = {"eat","tea","tan","ate","nat","bat"};

        System.out.println("The group of the anagram is : ");
        List<List<String>> result = gropuAngram(str);

        System.out.println(result);
    }
}