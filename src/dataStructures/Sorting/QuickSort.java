package dataStructures.Sorting;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if(low>=high) {
            return;
        }
        int pivot = arr[(low + high)/2];
        int i =low;
        int j =high;
        while(i<=j) {
            while (arr[i]<pivot) {
                i++;
            }
            while(arr[j]>pivot) {
                j--;
            }
            if(i<=j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if(low<j) {
            quickSort(arr, low, j);
        }
        if(i<high) {
            quickSort(arr, i, high);
        }

    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 5, 9, 4, 7};
        quickSort(arr,0 ,arr.length -1);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
