package itStep.yandr.javaLessons.lesson42.controller;

import itStep.yandr.javaLessons.lesson42.model.FirstThread;
import itStep.yandr.javaLessons.lesson42.model.SecondThread;

public class SecondController {
    public static void main(String[] args) {
        SecondThread threadLogic = new SecondThread();
        Thread thread = new Thread(threadLogic);
        thread.start();

    }
}
