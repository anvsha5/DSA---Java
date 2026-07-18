package basics;

//public class Short_circuitEvaluation {
//    public static void main(String[] args) {
//        System.out.println(false && (10 / 0 > 1));
//    }
//}

// divided by zero, no error, because java is smart is knows that
// false ke sath and matlab false hi..

public class Short_circuitEvaluation {
    public static void main(String[] args) {
        System.out.println( true || (10 / 0 > 1));
    }
}
