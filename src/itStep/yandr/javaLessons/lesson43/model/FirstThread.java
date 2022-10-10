package itStep.yandr.javaLessons.lesson43.model;

import java.util.concurrent.TimeUnit;

public class FirstThread extends Thread {

    public FirstThread() {
        start();

    }

    @Override
    public void run() {
        while (true) {
            System.out.printf("%s child thread is running...", getName());

            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
