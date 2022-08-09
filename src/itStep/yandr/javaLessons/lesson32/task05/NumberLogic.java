package itStep.yandr.javaLessons.lesson32.task05;

public class NumberLogic {
//  1 2 4 6 8 16 32 64 128 256 512 1024
//    base-case
//    1-->true
//    -->false
//    recursion-case
//    f(8)-->f(8/2=4)-->f(4/2=2)-->f(2)-->true
//    f(36)-->f(18)-->f(9)-->false
    public static boolean equals(int number, int degree) {
//        base-case
        if (number == degree) {
            return true;
        }
        if (number % degree != 0) {
            return false;
        }
        return equals(number / degree, degree);
    }

    public static void main(String[] args) {
        System.out.println(equals(128,2));
        System.out.println(equals(9,3));
        System.out.println(equals(17,4));

    }
}
