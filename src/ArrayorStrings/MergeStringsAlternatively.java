package ArrayorStrings;

public class MergeStringsAlternatively {

    private String mergeString(String str, String str2) {
        int len1 = str.length();
        int len2 = str2.length();
        StringBuilder result = new StringBuilder();

        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            result.append(str.charAt(i));
            result.append(str2.charAt(i));
        }
        if (len1 > len2) {
            result.append(str.substring(minLen));
        } else if (len1 < len2) {
            result.append(str2.substring(minLen));
        }
        return result.toString();
    }


    public static void main(String[] args) {
        String str="abc";
        String str2="mnopqrs";
        MergeStringsAlternatively merge=new MergeStringsAlternatively();
        System.out.println(merge.mergeString(str,str2));
    }


}
