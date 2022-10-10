package itStep.yandr.javaLessons.lesson42.controller;

import itStep.yandr.javaLessons.lesson42.model.SecondThread;

import java.util.concurrent.TimeUnit;

public class ThirdController {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread started");

        SecondThread threadLogic = new SecondThread();
        Thread thread1 = new Thread(threadLogic);
        Thread thread2 = new Thread(threadLogic);
        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();
        TimeUnit.SECONDS.sleep(5);
        System.out.println("\nmain thread closed");

    }
}
