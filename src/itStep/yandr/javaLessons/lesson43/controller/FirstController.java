package itStep.yandr.javaLessons.lesson43.controller;


import itStep.yandr.javaLessons.lesson43.model.FirstThread;

import java.util.concurrent.TimeUnit;

public class FirstController {
    public static void main(String[] args) throws InterruptedException {
        new FirstThread();

        while (true){
            TimeUnit.MILLISECONDS.sleep(100);
            System.out.println("\ngetAllStackTraces"+Thread.getAllStackTraces().size());
        }


    }
}
