package dataStructures.Method;

import java.util.Scanner;

public class IsEven {
    public static boolean isEven(int n){
        return n%2==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check even: ");
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }
}

