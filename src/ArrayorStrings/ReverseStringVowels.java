package ArrayorStrings;
import java.util.Set;

public class ReverseStringVowels {

    public String reverseVowels(String s) {
        int i=0, j=s.length()-1;
        char[] ar=s.toCharArray();

        Set<Character> vowels=Set.of('a','e','i','o','u');
        while(i<j){
            if(!vowels.contains(Character.toLowerCase(ar[j]))){
                j--;
            }
            if(!vowels.contains(Character.toLowerCase(ar[i]))){
                i++;
            }
            if(vowels.contains(Character.toLowerCase(ar[j]))&& vowels.contains(Character.toLowerCase(ar[i]))) {
                char temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
                i++; j--;
            }
        }
        return new String(ar);
    }



    public static void main(String[] args) {
        String str = "leetcode";
        ReverseStringVowels reverse=new ReverseStringVowels();
        System.out.println(reverse.reverseVowels(str));
    }
}
