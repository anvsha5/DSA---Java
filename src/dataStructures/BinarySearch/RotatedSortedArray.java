package dataStructures.BinarySearch;

import java.util.Scanner;

public class RotatedSortedArray {
    public static int rotatedSorted(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target >= arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        int[] arr = {7, 8, 1, 2, 3, 4, 6};
        int ans = rotatedSorted(arr, target);
        if(ans == -1) {
            System.out.println("Target not found");
        }
        else{
            System.out.println("Target found at index: "+ ans);
        }
    }
}
