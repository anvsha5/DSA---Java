package dataStructures.Method;

//  MethodOverloading occurs when these below happens
//  Number of parameters
//  Datatype of parameters
//  Order of parameters

//return type ka no farak
// agar same method name and same parameters
//then compilation error

public class MethodOverloading {
    public static String add(){
        return "add";
    }
    public static int add(int a, int b ){
        return a+b;
    }
    public static double add(double a , double b){
        return a+b;
    }
    public static int add(int a , int b , int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(3,4));
        System.out.println(add(4.3,6.7));
        System.out.println(add(3,5,6));
    }
}
