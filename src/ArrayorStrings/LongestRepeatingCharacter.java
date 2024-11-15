package ArrayorStrings;

import java.util.HashMap;

public class LongestRepeatingCharacter {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0, max = 0, result = 0, window_length = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            map.merge(s.charAt(right),1,Integer::sum);
            max = Math.max(max, map.get(s.charAt(right)));
            window_length = right - left + 1;
            if (window_length - max <= k) {
                result = window_length;
                right++;
            } else {
                map.replace(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
                right++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "AABABBA";
        int k = 1;
        LongestRepeatingCharacter longest = new LongestRepeatingCharacter();
        System.out.println(longest.characterReplacement(str, k));
    }
}
