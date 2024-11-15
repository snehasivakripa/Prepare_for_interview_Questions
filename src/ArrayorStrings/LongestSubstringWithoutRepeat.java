package ArrayorStrings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet =new HashSet<>();
        int left=0,right=0,maxlength=0;
        while(right<s.length()){
            if(!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                right++;
                maxlength= Math.max(maxlength,right-left);
            }else{
                charSet.remove(s.charAt(left));
                left++;
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        String str="abcabb";
        LongestSubstringWithoutRepeat longest=new LongestSubstringWithoutRepeat();
        System.out.println(longest.lengthOfLongestSubstring(str));
    }
}
