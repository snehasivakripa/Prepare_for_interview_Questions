package ArrayorStrings;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] ar=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            ar[s.charAt(i)-'a']++;
            ar[t.charAt(i)-'a']--;
        }
        for(int n:ar){
            if(n!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="iceman";
        String t="cinema";
        ValidAnagram validAnagram=new ValidAnagram();
        System.out.println(validAnagram.isAnagram(s,t));
    }
}
