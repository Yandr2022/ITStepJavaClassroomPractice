package itStep.yandr.javaLessons.lesson29.task01a.util;

import java.util.Random;
import java.util.Scanner;

public class ArrayInitializer {
    private static final Scanner SCN  ;
    private static final Random RND ;
    static {
        SCN = new Scanner(System.in);
    }
    static {
        RND = new Random();
    }

    public static void randomInit(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = RND.nextInt(max - min + 1) + min;
        }
    }

    public static void userInit(int[] array, String msg) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Input value %d: ",i);
            array[i] = SCN.nextInt();
        }
    }

    public static int inputIntValue(String msg) {
        System.out.println(msg);
        return SCN.nextInt();
    }

}
