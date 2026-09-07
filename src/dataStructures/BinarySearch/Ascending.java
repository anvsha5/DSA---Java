package dataStructures.BinarySearch;

import java.util.Scanner;

public class Ascending {
    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int low=0;
        int high = arr.length-1;
        boolean isAscending = arr[0]<=arr[arr.length-1];
        while(low<=high){
            int mid =(low + high)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAscending){

                if(target> arr[mid]){
                    low = mid +1;
                }
                else{
                    high = mid -1;
                }
            }
            else{
                if(target> arr[mid]){
                    high = mid -1;
                }
                else{
                    low = mid +1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        int[] arr = {20, 17, 15, 12, 9, 5, 1};
        int ans = orderAgnosticBinarySearch(arr, target);
        if(ans == -1){
            System.out.println("Target not found");
        }
        else{
            System.out.println("Target found at index "+ ans);
        }
    }
}
