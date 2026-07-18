package basics;

import java.util.Scanner;

//Counting number of digits

public class DigitProblems {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number: ");
            int n = sc.nextInt();
            int dig, count=0;
            while(n>0){
                dig = n % 10;
                count++;
                n = n / 10;
            }
            System.out.println("No. of digits: "+ count);
        }
}

//Sum of the digits of a number

public class DigitProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int dig,sum=0;
        while(n>0){
            dig = n % 10;
            sum = sum + dig;
            n = n / 10;
        }
        System.out.println("Sum of digits: "+ sum);
    }
}

//Reversing the digits of a number

public class DigitProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int dig,rev=0;
        while(n>0){
            dig = n % 10;
            rev = rev*10 + dig;
            n = n / 10;
        }
        System.out.println("Reverse of the number: "+ rev);
    }
}