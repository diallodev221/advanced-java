package com.diallodev.concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

//        ThreadExample threadOne = new ThreadExample();
//        ThreadExample threadTwo = new ThreadExample();
//
//        Thread thread = new Thread(new RunnableExample());
//
//        threadOne.setName("First thread");
//        threadTwo.setName("Second thread");
//
//        threadOne.start();
//        threadTwo.start();
//        thread.start();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new RunnableExample());
        executorService.submit(() -> System.out.println("Hello World from a runnable running in an executorService"));

        executorService.shutdown();
    }
}
