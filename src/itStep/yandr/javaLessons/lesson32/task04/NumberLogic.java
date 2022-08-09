package itStep.yandr.javaLessons.lesson32.task04;

public class NumberLogic {
    //base-case
//n == m == 0 --> true;
//n == 0 and m != false;

// recursion-case
//equals(1234567, 28) -> equals(123456, 21) -> equals(12345, 15) -> equals(1234, 10)
//-> equals(123, 6) -> equals(12, 3) -> equals(1, 1) -> equals(0, 0) --> true

//equals(12, 6) -> equals(0, 3) -> false
//equals(19, 3) -> equals(0, -7) -> false


    public static boolean equals(int n, int m) {
//        base-case
        if (n == 0) {
            if (m != 0) {
                return false;
            }
            return true;
        }
//        recursion-case
        int t = n % 10;
        return equals(n / 10, m - t);
    }

        public static void main(String[] args) throws Exception {
            System.out.println(equals(1234567, 28));
            System.out.println(equals(10, 7));
        }
    }

