package basics;

//s= 1 + 2 + 3 + 4 + 5

public class Loops {
    public static void main(String[] args) {
        int i, sum=0;
        for(i=1;i<=5;i++){
            sum= sum +i;
        }
        System.out.println("Sum:"+ sum);
    }
}

//s= 1 * 2 * 3 * 4 * 5

public class Loops {
    public static void main(String[] args) {
        int i, s=1;
        for(i=1;i<=5;i++){
            s= s *i;
        }
        System.out.println("Sol:"+ s);
    }
}

//s = 1² - 2² + 3² - 4² + 5²

public class Loops {
    public static void main(String[] args) {
        int i, s=0;
        for(i=1;i<=5;i++){
            if(i%2==0) {
                s = s - (i * i);
            }
            else{
                s = s + (i * i);
            }
        }
        System.out.println("Sol: "+ s);
    }
}

//s = 2¹ + 2² + 2³ + 2⁴ + 2⁵ + 2⁶ + 2⁷ + 2⁸ + 2⁹ + 2¹⁰

public class Loops {
    public static void main(String[] args) {
        int i, s=0, n=1;
        for(i=1;i<=10;i++){
                n = n * 2;
                s = s + n;
        }
        System.out.println("Sol: "+ s);
    }
}

//s = 1! + 2! + 3! + 4! + 5!

public class Loops {
    public static void main(String[] args) {
       int i, j, n=1, s=0;
       for(i=1;i<=5;i++){
           n=1;
           for(j=1;j<=i;j++){
               n = n * j;
           }
           s = s + n;
       }
        System.out.println("Sol: "+ s);
    }
}

//s = 1¹ + 2² + 3³ + 4⁴ + 5⁵

public class Loops {
    public static void main(String[] args) {
        int i, j, t=1, n, s=0;
        for(i=1;i<=5;i++){
            n=1;
            for(j=1;j<=i;j++){
                n = n * t;
            }
            t++;
            s = s + n;
        }
        System.out.println("Sol: "+ s);
    }
}

// But ultimately u would realize that, t toh i hi he..

