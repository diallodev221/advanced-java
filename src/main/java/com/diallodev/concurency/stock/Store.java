package com.diallodev.concurency.stock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Store {

    // make this method synchronized
    static synchronized void purchase(StockChecker stockChecker, int quantity) {
        int stock = stockChecker.getStock();
        if (stock - quantity < 0) {
            System.out.println("Out of stock");
        } else {
            System.out.println("Item is in stock");
            stockChecker.updateStock(quantity);
            System.out.println(quantity + " items purchased");
        }

        System.out.println("Current stock: " + stockChecker.getStock());
    }

    public static void main(String[] args) {

        // create new StockChecker object
        StockChecker stockChecker = new StockChecker();

        // create an executorService with  a fixed thread pool of 4 threads
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // submit 4 threads to the executorService
        // In each task you should call the purchase method and pass in 20
        executorService.submit(() -> purchase(stockChecker, 20));
        executorService.submit(() -> purchase(stockChecker, 20));
        executorService.submit(() -> purchase(stockChecker, 20));
        executorService.submit(() -> purchase(stockChecker, 20));

        executorService.shutdown();


    }
}
