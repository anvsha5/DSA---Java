package dataStructures.Sorting;

public class SortColor {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sortColor(int[] arr) {
        int low = 0;
        int high = arr.length -1;
        int mid =0;
        while(mid<=high) {
            if(arr[mid] == 2) {
                swap(arr, high, mid);
                high--;
            }
            else if(arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 2, 0, 1};
        sortColor(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
