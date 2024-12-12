package Searching;

public class LinearSearch {
    public boolean exist(int[] arr,int num){
        for(int n:arr){
            if(n==num){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={10,6,3,9,1,7,2,8};
        int num=9;
        LinearSearch search=new LinearSearch();
        System.out.println(search.exist(arr,num));
    }
}
