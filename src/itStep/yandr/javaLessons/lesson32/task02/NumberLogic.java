package itStep.yandr.javaLessons.lesson32.task02;

public class NumberLogic {
    //    f(12345)=5+f(1234)=4+f(123)=3+f(12)=2+f(1)
//        0...9->0..9 base-case
    public static int sumAllDigit(int number) {
        //active fool-prove
        number = number >= 0 ? number : -number;
        // base-case
        if (number <= 9) {
            return number;
        }
        return number % 10 + sumAllDigit(number / 10);

    }

    public static void main(String[] args) {
        System.out.println(sumAllDigit(123456789)==45);
        System.out.println(sumAllDigit(-123456789)==45);
        System.out.println(sumAllDigit(0)==0);
        System.out.println(sumAllDigit(9)==9);
        System.out.println(sumAllDigit(-1)==1);
        System.out.println(sumAllDigit(10)==1);

    }

}
