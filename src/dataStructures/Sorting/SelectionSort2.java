package dataStructures.Sorting;

public class SelectionSort2 {
    public static void selectionSort(int[] arr) {
        int i, j = 0;
        while(j<(arr.length-1)) {
            int minIndex =j;
            for(i = j+1; i<arr.length;i++) {
                if(arr[i]<arr[minIndex]) {
                    minIndex = i;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[j];
            arr[j] =temp;
            j++;
        }

    }
    public static void main(String[] args) {
        int[] arr = {7, 4, 5,6, 34, 3,1};
        selectionSort(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
