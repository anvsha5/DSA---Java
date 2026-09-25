package dataStructures.Sorting;

public class BubbleSort2 {
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length -1;
        while(n>0) {
            int stop = 0;
            for(int i=0; i<n ; i++) {
                if (arr[i + 1] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                } else {
                    stop++;
                }
            }
            if(stop == n) {
                return arr;
            }
            n--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 3, 4};
        bubbleSort(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
