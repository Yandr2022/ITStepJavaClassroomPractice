package itStep.yandr.javaLessons.lesson32.task01;

public class NumberLogic {
        public static int factZero() {
        return 1;
    }

    public static int factFirst() {
        return 1;
    }

    public static int factSecond() {
        return 2 * factFirst();
    }

    public static int factThird() {
        return 3 * factSecond();
    }

    public static int factFourth() {
        return 4 * factThird();
    }

    public static int factFifth() {
        return 5 * factFourth();
    }
    public static int factorialRec(int n) {
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorialRec (n - 1);
    }

    public static int factorialLoop(int n) {
        if (n < 0) {
            return -1;
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;

        }
        return factorial;
    }


    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
    }

}
