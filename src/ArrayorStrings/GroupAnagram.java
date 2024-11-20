package ArrayorStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> result=new ArrayList<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            if(!map.containsKey(Arrays.toString(c))){
                map.put(Arrays.toString(c),new ArrayList<>());
            }
            map.get(Arrays.toString(c)).add(s);
        }
        for(String s:map.keySet()){
            result.add(map.get(s));
        }
        return result;
    }

    public static void main(String[] args) {
        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String t = "cinema";
        GroupAnagram groupAnagram = new GroupAnagram();
        System.out.println(groupAnagram.groupAnagrams(s));
    }
}
