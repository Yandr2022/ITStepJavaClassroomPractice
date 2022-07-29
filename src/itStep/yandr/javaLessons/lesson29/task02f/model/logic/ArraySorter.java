package itStep.yandr.javaLessons.lesson29.task02f.model.logic;

public class ArraySorter {
    private static int findFirstZeroElementIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -2;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    private static int findLastZeroElementIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -2;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    private static void sortBeforeIndex(int[] array, int index) {
        if (index > 1) {
            for (int i = 0; i < index - 1; i++) {
                for (int j = 0; j < index - i -1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void sortBeforeLastZeroElement(int[] array) {
        int index = findLastZeroElementIndex(array);
        sortBeforeIndex(array, index);
    }

    public static void sortBeforeFirstZeroElement(int[] array) {
        int index = findFirstZeroElementIndex(array);
        sortBeforeIndex(array, index);
    }
}
