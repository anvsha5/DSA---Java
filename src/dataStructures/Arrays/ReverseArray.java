package dataStructures.Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            System.out.printf("Enter num%d: ", i + 1);
            arr[i] = sc.nextInt();
        }

        for(i=0;i<n/2;i++){
            arr[i] = arr[i] + arr[n-i-1];
            arr[n-i-1] = arr[i] - arr[n-i-1];
            arr[i] = arr[i] - arr[n-i-1];
        }

        System.out.println("Reverse Array: ");

        for(i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}
