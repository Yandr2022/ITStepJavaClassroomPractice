package itStep.yandr.javaLessons.lesson42.controller;

import itStep.yandr.javaLessons.lesson42.model.FirstThread;

public class FirstController {
    public static void main(String[] args) {
        FirstThread thread = new FirstThread();
        thread.start();
        Thread main = Thread.currentThread();
        while (true) {
            System.out.printf("\nid = %d, name = %s", main.getId(), main.getName());
        }
    }
}
