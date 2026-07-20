package dataStructures.Arrays;

import java.util.Scanner;

public class isIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter num%d: ", i+1);
            arr[i] = sc.nextInt();
        }

        boolean isIncreasing= true;
        for(int i=0;i<n-1;i++) {
            if(arr[i+1]<arr[i]){
                isIncreasing= false;
                break;
            }
        }
        if(isIncreasing){
            System.out.println("Increasing");
        }
        else{
            System.out.println("Not Increasing");
        }
    }
}
