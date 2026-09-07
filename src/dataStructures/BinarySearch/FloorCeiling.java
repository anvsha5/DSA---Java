package dataStructures.BinarySearch;

import java.util.Scanner;

public class FloorCeiling {
    public static int findInsertionIndex(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]== target){
                return mid;
            }
            else if(target > arr[mid]){
                low  = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target: ");
        int target = sc.nextInt();
        int[] arr = {2, 4 ,6 ,8 ,10, 12, 14};
        int ans = findInsertionIndex(arr, target);
        if(ans <arr.length && arr[ans] == target){
            System.out.printf("Floor: %d\nCeiling: %d", target , target);
        }
        else if(ans == arr.length){
            System.out.println("Celing does not exists, floor: "+ arr[ans-1]);
        }
        else if(ans ==0){
            System.out.println("Floor does not exists, Ceiling: "+ arr[ans]);
        }
        else{
            System.out.printf("Floor: %d\nCeiling: %d", arr[ans-1] , arr[ans]);
        }

    }
}
