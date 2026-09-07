package dataStructures.BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        int[] arr = {1, 3, 5, 7, 9, 11 ,13, 15};
        int ans = binarySearch(arr, target);
        if(ans ==-1){
            System.out.printf("%d doesn't exist in array", target);
        }
        else{
            System.out.printf("%d found at index %d", target, ans);
        }
    }
}
