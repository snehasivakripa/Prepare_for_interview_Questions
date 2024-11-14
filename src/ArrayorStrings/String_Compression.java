package ArrayorStrings;

public class String_Compression {
    public int compress(char[] chars) {
        int index=0;
        int count=1;
        if(chars.length==1){
            chars[index++]=chars[0];
        }
        for(int i=1;i<chars.length;i++){
            if(chars[i]!=chars[i-1]){
                chars[index++]=chars[i-1];
                if(count>1){
                    for(char num:Integer.toString(count).toCharArray())
                        chars[index++]=num;
                }
                count=1;
            }else{
                count++;
                if(i==chars.length-1){
                    chars[index++]=chars[i-1];
                    if(count>1){
                        for(char num:Integer.toString(count).toCharArray())
                            chars[index++]=num;
                    }
                }
            }


        }

        System.out.println(chars);
        return index;
    }

    public static void main(String[] args) {
        char[] chars={'a','a','b','b','c','c','c','c','c'};
        String_Compression compression=new String_Compression();
        System.out.println(compression.compress(chars));
    }
}
