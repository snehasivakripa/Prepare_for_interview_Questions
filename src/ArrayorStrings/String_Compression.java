package ArrayorStrings;

public class String_Compression {
    public int compress(char[] chars) {
        StringBuilder str=new StringBuilder();
        int count=1;
        if(chars.length==1){
            str.append(chars[0]);
        }
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                count++;
            }else{
                if(count!=1) {
                    str.append(chars[i - 1] + String.valueOf(count));
                    count = 1;
                }else{
                    str.append(chars[i-1]);
                }
            }
            if(i==chars.length-1 && count!=1){
                str.append(chars[i - 1] + String.valueOf(count));
            }
        }
        char[] compressed=str.toString().toCharArray();
        int j=0;
        for(char c:compressed){
            chars[j]=c;
           j++;

        }
        return compressed.length;
    }

    public static void main(String[] args) {
        char[] chars={'a','a','b','b','c','c','c','c','c'};
        String_Compression compression=new String_Compression();
        System.out.println(compression.compress(chars));
    }
}
