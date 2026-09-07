package dataStructures.BinarySearch;

import java.util.Scanner;

public class LastOccurrence {
    public static int lastOccurrence(int[] arr, int target) {
        int low=0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(target == arr[mid]){
                if(mid == arr.length -1){
                    return mid;
                }
                else if(target<arr[mid+1]){
                    return mid;
                }
                else{
                    low = mid + 1;
                }
            }
            else if(target>arr[mid]){
                low = mid + 1;
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
        int[] arr = {2, 4 ,5, 6, 7, 8, 8, 12, 14};
        int ans = lastOccurrence(arr, target);
        if(ans == -1){
            System.out.println("Target not found");
        }
        else{
            System.out.println("Target found at first index: "+ ans);
        }
        sc.close();
    }
}
