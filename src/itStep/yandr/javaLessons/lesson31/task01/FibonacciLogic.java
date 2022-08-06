package itStep.yandr.javaLessons.lesson31.task01;

public class FibonacciLogic {

    public static int getFibonacciNumber(int index) {
        if(index<=0){
            return -1;
        }
        int first = 0;
        int second = 1;

        if (index == 1 || index == 2) {
            return index - 1;
        }
        int fib = second + first;

        for (int i = 3; i < index; i++) {
            first = second;
            second = fib;
            fib = second + first;
        }
        return fib;
    }
    public static int getFibonacciWithRecursion(int index) {
        if (index <=2) {
            return index - 1;
        }
        return getFibonacciWithRecursion(index -1)+getFibonacciWithRecursion(index -2);

    }
}
