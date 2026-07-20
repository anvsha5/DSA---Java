package dataStructures.Arrays;

import java.util.Scanner;

public class CountEvenOdd {
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

        int countEven=0;
        int countOdd=0;
        for (i = 0; i < n; i++) {
            if (arr[i]%2==0) {
                countEven++;
            }
            else{
                countOdd++;
            }
        }
            System.out.println("Even numbers: "+ countEven);
            System.out.println("Odd numbers: "+ countOdd);

    }

}
