package dataStructures.Arrays;

import java.util.Scanner;

public class SumAvg {
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

        double sum=0;
        for (i = 0; i < n; i++) {
            sum = sum +arr[i];
        }
        System.out.println("Sum of numbers: "+ sum);
        System.out.printf("Avg of numbers: %.2f", sum/n);

    }

}
