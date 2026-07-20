package dataStructures.Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            System.out.printf("Enter num%d: ", i + 1);
            arr[i] = sc.nextInt();
        }

        boolean found = false;
        int index = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] == target) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.printf("Index of target %d in array is %d", target, index);
        } else {
            System.out.printf("Target %d didn't exist in array", target);
        }
    }

}
