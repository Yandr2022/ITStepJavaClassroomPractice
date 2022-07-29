package itStep.yandr.javaLessons.lesson29.task01a.util;

import java.util.Random;
import java.util.Scanner;

public class ArrayInitializer {
    private static final Scanner SCN = new Scanner(System.in);
    private static final Random RND = new Random();

    public static void randomInit(int[] array, int max, int min) {
        for (int i = 0; i < array.length; i++) {
            array[i] = RND.nextInt(max - min) + min;
        }
    }

    public static void userInit(int[] array, String msg) {
        System.out.println(msg);
        for (int i = 0; i < array.length; i++) {
            array[i] = SCN.nextInt();
        }
    }

    public static int inputIntValue(String msg) {
        System.out.println(msg);
        return SCN.nextInt();
    }

}
