package basics;

import java.util.Scanner;

//123
//456
//789

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i,j,c=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}

// *
// **
// ***

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i, j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// ***
// **
// *


public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// ***
//  **
//   *

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++){
            for(k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//   *
//  **
// ***

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++){
            for(k=(n-i);k>=1;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//   *
//  ***
// *****

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i,j,k,t;
        for(i=1;i<=n;i++){
            for(k=(n-i);k>=1;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(t=1;t<=i-1;t++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// *****
//  ***
//   *

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i,j,k,t;
        for(i=1;i<=n;i++){
            for(k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(j=n;j>=i;j--){
                System.out.print("*");
            }
            for(t=n-i;t>=1;t--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i,j,k,t;
        for(i=1;i<=n;i++){
            for(k=n-i; k>=1;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(t=1;t<=i-1;t++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=n-1;i++){
            for(k=1;k<=i; k++){
                System.out.print(" ");
            }
            for(j=n-1;j>=i;j--){
                System.out.print("*");
            }
            for(t=n-1-i;t>=1;t--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//    *
//   * *
//  * * *
// * * * *

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++){
            for(k=n-(i+1);k>=1;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                if(i==n && j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}

// * * * *
//  * * *
//   * *
//    *

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++){
            for(k=1;k<=i-2;k++){
                System.out.print(" ");
            }
            for(j=n;j>=i;j--){
                if(j==n && i==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}

//    *
//   * *
//  * * *
// * * * *
//  * * *
//   * *
//    *

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++){
            for(k=n-(i+1);k>=1;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                if(i==n && j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
        for(i=1;i<=n-1;i++){
            for(k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(j=n-1;j>=i;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

// 1234554321
// 1234  4321
// 123    321
// 12      21
// 1        1

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i,j,k,t;
        for(i=1;i<=n;i++){
            for(j=1;j<=n+1-i;j++){
                System.out.print(j);
            }
            for(k=1;k<=2*(i-1);k++){
                System.out.print(" ");
            }
            for(t=n+1-i;t>=1;t--){
                System.out.print(t);
            }
            System.out.println();
        }
    }
}

//       ******
//      ******
//     ******
//    ******
//   ******
//  ******

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=n-i; k++){
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// *          *
// **        **
// ***      ***
// ****    ****
// *****  *****
// ************
// ************
// *****  *****
// ****    ****
// ***      ***
// **        **
// *          *

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i,j,k,t;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(k=1;k<=2*(n-1)-2*(i-1);k++){
                System.out.print(" ");
            }
            for(t=1;t<=i;t++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n+1-i;j++){
                System.out.print("*");
            }
            for(k=1;k<=2*(i-1);k++){
                System.out.print(" ");
            }
            for(t=1;t<=n+1-i;t++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}





