package dataStructures.BinarySearch;

public class PeakElement {
    public static int peakElement(int[] arr){
        int low =0;
        int high = arr.length -1;
        while(low<high){
            int mid = (high + low)/2;
            if(arr[mid]<arr[mid + 1]){
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 6, 2};
        int ans = peakElement(arr);
        System.out.println("Target found at first index: "+ ans);
    }

}
