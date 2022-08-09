package itStep.yandr.javaLessons.lesson32.task03;


public class NumberLogic {


    public static int sumAllElements(int[] array) throws Exception {
//        fool-prove
        if (array == null || array.length == 0) {
            throw new Exception();
        }
//    base-case
        if (array.length == 1) {
            return array[0];
        }
//    recursion-case:
        int size = array.length - 1;
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        return array[array.length - 1] + sumAllElements(temp);

    }

    public static int sumAllElements2(int[] array) throws Exception {
//        fool-prove
        if (array == null || array.length == 0) {
            throw new Exception();
        }

        return sumElements(array, 0);

    }

    private static int sumElements(int[] array, int index) {
//        base-case
        if (index == array.length - 1) {
            return array[array.length - 1];
        }
//          recursion-case:
        return array[index] + sumElements(array, ++index);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(sumAllElements2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}) == 45);
        System.out.println(sumAllElements2(new int[]{7}) == 7);

        try {
            sumAllElements2(null);
            System.out.println(false);
        } catch (Exception e) {
            System.out.println(true);

        }
    }
}
