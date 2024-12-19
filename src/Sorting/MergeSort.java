package Sorting;

public class MergeSort {

    private void sorting(int[] arr) {
        int[] dup=new int[arr.length];
        mergeSortDivision(arr,dup,0,arr.length-1);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }

    private void
    mergeSortDivision(int[] arr,int[] dup, int low, int high) {
        if(low<high){
            int mid=low + (high - low) / 2;
            mergeSortDivision(arr,dup,low,mid);
            mergeSortDivision(arr,dup,mid+1,high);
            merge(arr,dup,low,mid,high);
        }
    }

    private void merge(int[] arr,int[] dup, int low, int mid, int high) {
        int i=low;
        int j=mid+1;
        int k=low;
        while(i<=mid && j<=high) {
            if (arr[i] <= arr[j]) {
                dup[k++] = arr[i++];
            } else if (arr[j] < arr[i]) {
                dup[k++] = arr[j++];
            }
        }
            if(i>mid){
                while(j<=high){
                    dup[k++]=arr[j++];
                }
            }else{
                while(i<=mid){
                    dup[k++]=arr[i++];
                }
            }

            for(int m=low;m<=high;m++){
                arr[m]=dup[m];
            }


    }

    public static void main(String[] args) {
        int[] arr = {10,7,6,1,9,8,6};
        MergeSort merge = new MergeSort();
        merge.sorting(arr);
    }


}
