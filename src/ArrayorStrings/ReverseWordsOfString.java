package ArrayorStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ReverseWordsOfString {

    public String reverseWords(String s) {
        String[] words=s.split("\\s+");
        StringBuilder str=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            str.append(words[i]);
            if(i!=0){
                str.append(" ");
            }
        }

        return str.toString().trim();
    }

    public static void main(String[] args) {
        String str = "the sky is blue";
        ReverseWordsOfString reverse=new ReverseWordsOfString();
        System.out.println(reverse.reverseWords(str));
    }
}
