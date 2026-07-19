package dataStructures.Method;

import java.util.Scanner;

//public class Methods {
//    public static void hello(){
//        System.out.println("Hello Anvsha!!");
//    }
//    public static void main(String[] args) {
//        int i;
//        for (i=0;i<=5;i++){
//            hello();
//        }
//    }
//}

//public class Methods {
//    public static void hello(String name){
//        System.out.println("Hello "+ name);
//    }
//    public static void main(String[] args) {
//        hello("Anushka");
//        hello("abc");
//        hello("xyz");
//        hello(18);     error , java doesn't convert data type
//
//        System.out.println("Age = "+ 18);
//
//       this works because if one is string then concatenation happens
//    }
//}

//public class Methods {
//    public static void sum(int a, int b){
//        System.out.println("Sum = " + (a+b));
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//        sum(10,20);
//        sum(6,30);
//        sum(num, 7);
//    }
//}

//public class Methods {
//    public static void greet(String name, int age){
//        System.out.printf("Hello %s!, Your age is %d", name, age);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter name: ");
//        String name = sc.nextLine();
//        System.out.println("Enter your age: ");
//        int age = sc.nextInt();
//        greet(name, age);
//    }
//}

public class MethodsSyntax {
    public static void larger(int a, int b){
        if(a>b)
            System.out.printf("%d is larger than %d", a,b);
        else if(b>a)
            System.out.printf("%d is larger than %d",b,a);
        else
            System.out.printf("Both are equal");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        larger(num1, num2);
    }
}






