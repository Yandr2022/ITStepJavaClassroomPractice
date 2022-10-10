package itStep.yandr.javaLessons.lesson42.model;

import java.util.concurrent.TimeUnit;

public class SecondThread implements Runnable {

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
//        while (true) {
//            System.out.printf("\nid = %d, name = %s", thread.getId(),thread.getName());
//
//        }
        for (int i = 0; i < 1000; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
            System.out.printf("\nid = %d, name = %s", thread.getId(), thread.getName());

        }
        System.out.printf("\n%s thread closed", thread.getName());
    }
}
