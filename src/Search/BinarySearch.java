package Search;

import java.util.Arrays;

public class BinarySearch {
    public boolean exist(int[] arr,int low,int high,int num){
        Arrays.sort(arr);

        while (low<=high) {
            int mid=(high-low)/2 +low;
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] < num) {
               low=mid+1;
            } else if (arr[mid] > num) {
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={10,6,3,9,1,7,2,8};
        int num=5;
        BinarySearch search=new BinarySearch();
        System.out.println(search.exist(arr,0,arr.length-1,num));
    }
}
