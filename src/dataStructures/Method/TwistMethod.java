package dataStructures.Method;

//public class TwistMethod {
//    public static void show(int x){
//        System.out.println("int");
//    }
//
//    public static void show(long x){
//        System.out.println("long");
//    }
//
//    public static void main(String[] args) {
//        show(10);
//    }
//}

//output --> int, by default 10 is int, but if 10L then long

public class TwistMethod {
    public static void show(float x){
        System.out.println("float");
    }

    public static void show(double x){
        System.out.println("double");
    }

    public static void main(String[] args) {
        show(5.5);
    }
}

// like wise 5.5 by default double and if 5.5f then float

//  !! COMPILE TIME ERROR !!
//Method Overloading

//public class TwistMethod {
//    public static int add(int a, int b){
//        return a+b;
//    }
//
//    public static long add(int a, int b){
//        return a+b;
//    }
//}