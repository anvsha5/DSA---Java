package basics;

import java.util.Scanner;

public class SwapNotTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int a = sc.nextInt();
        System.out.println("Enter num2: ");
        int b = sc.nextInt();

        System.out.printf("Before Swap: %d %d\n", a,b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("After Swap: %d %d\n", a,b);

    }
}
