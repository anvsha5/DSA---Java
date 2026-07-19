package dataStructures.Method;

import java.util.Scanner;

public class ReturnFactorial {
    public static long fac(int n){
        if(n<0){
            return -1;
        }
        long fac =1;
        for(int i=1;i<=n;i++){
            fac*=i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for factorial: ");
        int n = sc.nextInt();
        long ans = fac(n);
        if(ans==-1){
            System.out.println("Factorial doesn't exists, invalid input");
        }
        else{
            System.out.printf("Factorial of %d is %d", n, ans);;
        }
    }

}
