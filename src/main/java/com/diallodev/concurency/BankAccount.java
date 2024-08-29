package com.diallodev.concurency;

public class BankAccount {

    private int balance =  100;

    void debit(int amount) {
        balance -= amount;
    }

    int getBalance() {
        return balance;
    }
}
