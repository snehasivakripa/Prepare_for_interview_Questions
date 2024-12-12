package Sorting;

public class BubbleSort {

    private void sorting(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int n:arr){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        BubbleSort bubble = new BubbleSort();
        bubble.sorting(arr);
    }
}
