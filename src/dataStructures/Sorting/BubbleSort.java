package dataStructures.Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for(int i=0; i<arr.length; i++) {
            swapped = false;
            for(int j=0; j<(arr.length -1)- i; j++) {
                if(arr[j]>arr[j+1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        bubbleSort(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
