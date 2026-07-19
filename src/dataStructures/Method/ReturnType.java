package dataStructures.Method;

import java.util.Scanner;

//public class ReturnType {
//    public static int add(int a, int b){
//        return a+b;
//
//        Remember, return ke baad method finish,
//        Nothing executes after that
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter second number: ");
//        int num2 = sc.nextInt();
//        int result = add(num1, num2);
//        System.out.println("Result = " + result);
//    }
//}

public class ReturnType {
    public static int add(int a, int b){
        int ans = a+b;
        System.out.println("Ans = "+ ans);
        return 0; // return hona hi chahiye, return ke bina error
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        add(num1, num2);
    }
}
