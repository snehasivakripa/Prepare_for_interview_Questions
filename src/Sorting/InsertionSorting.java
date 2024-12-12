package Sorting;

public class InsertionSorting {
    private void sorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temparr = arr[i];

            while (j >= 0 && temparr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temparr;
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        InsertionSorting insert = new InsertionSorting();
        insert.sorting(arr);
    }


}
