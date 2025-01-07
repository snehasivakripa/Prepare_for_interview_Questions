package Sorting;

public class QuickSort {

    private void sorting(int[] arr, int lb, int ub) {
        if(lb<ub){
            int pivotIndex=partition(arr,lb,ub);
            sorting(arr,lb,pivotIndex);
            sorting(arr,pivotIndex+1,ub);
        }
    }

    private int partition(int[] arr, int lb, int ub) {
        int pivot=arr[lb];
        int start=lb;
        int end=ub;
        while(start<end) {
            while (start<end && arr[start] <= pivot) {
                start++;
            }
            while (arr[end]>pivot) {
                end--;
            }
            if (start <end) {
                swap(arr,start, end);
            }
        }
        swap(arr,end,lb);
        return end;
    }

    private void swap(int[] arr,int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void main(String[] args) {
        int[] arr = {6,4,2,8,9,1};
        QuickSort quick = new QuickSort();
        quick.sorting(arr,0,arr.length-1);
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

}
