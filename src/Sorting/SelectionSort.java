package Sorting;

public class SelectionSort {

    private void sorting(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int min = j;
                if (arr[j] < arr[min]) {
                    min = j;
                }
                if (min != i) {
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        SelectionSort selection = new SelectionSort();
        selection.sorting(arr);
    }


}
