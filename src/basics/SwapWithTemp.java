package basics;

import java.util.Scanner;

public class SwapWithTemp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter num1: ");
            int a = sc.nextInt();
            System.out.println("Enter num2: ");
            int b = sc.nextInt();
            int temp;

            System.out.printf("Before Swap: %d %d\n", a,b);

            temp=a;
            a=b;
            b=temp;

            System.out.printf("After Swap: %d %d\n", a,b);

        }
}


