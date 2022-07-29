package itStep.yandr.javaLessons.lesson29.task01a.controller;

import itStep.yandr.javaLessons.lesson29.task01a.model.logic.ArrayLogic;
import itStep.yandr.javaLessons.lesson29.task01a.util.ArrayInitializer;
import itStep.yandr.javaLessons.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = ArrayInitializer.inputIntValue("Input size of array: ");
        int []array = new int[size];
        int min = ArrayInitializer.inputIntValue("Input min: ");
        int max = ArrayInitializer.inputIntValue("Input max: ");

        ArrayInitializer.randomInit(array,min,max);

        int count = ArrayLogic.countNonZeroElements(array);
        String msg = String.format("\nCount of non zero array's elements = %d",count);
        Printer.print("Array"+ Arrays.toString(array));
        Printer.print(msg);

    }
}
