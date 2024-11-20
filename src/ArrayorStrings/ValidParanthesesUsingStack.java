package ArrayorStrings;

import java.util.Stack;

public class ValidParanthesesUsingStack {

    public boolean isValid(String s) {
        Stack<Character> stack=new Stack();
        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }else if(c=='['){
                stack.push(']');
            }else if(c=='{'){
                stack.push('}');
            }else if(stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s="({})";
        ValidParanthesesUsingStack validAnagram=new ValidParanthesesUsingStack();
        System.out.println(validAnagram.isValid(s));
    }
}
