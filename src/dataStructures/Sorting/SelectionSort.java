package dataStructures.Sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length -1;i++) {
            int minIndex =i;
            for(int k=i+1;k<arr.length;k++) {
                if(arr[k]<arr[minIndex]) {
                    minIndex = k;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 4, 9, 2, 5};
        selectionSort(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
