package ArrayorStrings;

public class ValidParantheses {
    public boolean isValid(String s) {
        while (true){
            if (s.contains("()")){
                s=s.replace("()","");
            }else if (s.contains("[]")){
                s=s.replace("[]","");
            }else if (s.contains("{}")){
                s=s.replace("{}","");
            }else {
                return s.isEmpty();
            }
        }
    }

    public static void main(String[] args) {
        String s="({})";
        ValidParantheses validAnagram=new ValidParantheses();
        System.out.println(validAnagram.isValid(s));
    }
}
