package dataStructures.Arrays;

import java.util.Scanner;

//        Integer.MAX_VALUE = 2147483647
//        Integer.MIN_VALUE = -2147483648

public class SecLargest {
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

        int max =arr[0];
        for(i=1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int secMax= Integer.MIN_VALUE;
        for(i=0;i<n;i++){
            if(arr[i]==max){
                continue;
            }
            else if(arr[i]>secMax){
                secMax = arr[i];
            }
        }

        if(secMax==Integer.MIN_VALUE){
            System.out.println("Second Max doesn't exists");
        }
        else {
            System.out.println("Second Max: " + secMax);
        }

    }
}
