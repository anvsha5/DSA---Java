package dataStructures.BinarySearch;

import java.util.Scanner;

public class SearchInsertPosition {
    public static int insertSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target: ");
        int target = sc.nextInt();
        int[] arr = {2, 4, 6, 8, 10};
        int ans = insertSearch(arr, target);
        if(ans<arr.length && arr[ans]== target){
            // Check ans < arr.length before accessing arr[ans],
            // otherwise ans may be equal to arr.length and cause ArrayIndexOutOfBoundsException.
            System.out.println("Target found");
        }
        else{
            System.out.println("Not found, insert at index "+  ans);
        }

    }
}
