package dataStructures.Arrays;

public class ArraySyntax {
    public static void main(String[] args) {

//        int a;
//        System.out.println(a);              // compile time error

        int[] arr = new int[5];

        System.out.println(arr[0]);           // 0
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

//      Local variables are NOT initialized automatically.
//      Objects and array elements created using 'new'
//      are initialized with their default values.

        double[] a = new double[5];

        System.out.println(a[0]);           // 0.0
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

        boolean[] b = new boolean[5];

        System.out.println(b[0]);           // false
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);

        char[] c = new char[5];

        System.out.println((int)c[0]);           //0
        System.out.println(c[1]);                // \u0000  --> null character
        System.out.println(c[2]);
        System.out.println(c[3]);
        System.out.println(c[4]);

        String[] d = new String[5];

        System.out.println(d[0]);           // null
        System.out.println(d[1]);
        System.out.println(d[2]);
        System.out.println(d[3]);
        System.out.println(d[4]);

    }
}
