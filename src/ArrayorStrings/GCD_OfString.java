package ArrayorStrings;

public class GCD_OfString {

    private String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }else{
            int num=gcdOfNumbers(Math.max(str1.length(),str2.length()),Math.min(str1.length(),str2.length()));
            return str1.substring(0,num);
        }
    }

    private int gcdOfNumbers(int length1, int length2) {
       return (length2==0)?length1: gcdOfNumbers(length2,length1%length2);
    }

    public static void main(String[] args) {
        String str1="ABABAB";
        String str2="ABAB";
        GCD_OfString gcd=new GCD_OfString();
        System.out.println(gcd.gcdOfStrings(str1,str2));
    }


}
