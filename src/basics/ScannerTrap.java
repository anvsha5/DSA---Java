package basics;

import java.util.Scanner;

public class ScannerTrap {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

//        sc.nextLine();      buffer me \n

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Your name is " +  name + " and age is "+ age);
        sc.close();
    }
}
