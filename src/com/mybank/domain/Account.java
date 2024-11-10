package com.mybank.domain;

public class Account {
    private double balance;//维护客户的账户存额款

    public Account(double initBalance) {
        this.balance = initBalance;
    }//初始化账户存款额

    public boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            return true;
        } else {
            return false;
        }
    }//用于从账户存钱

    public boolean withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            return true;
        } else {
            System.out.println("余额不足！");
            return false;
        }
    }//用于从账户取钱

    public double getBalance() {
        return balance;
    }//用于返回balance的值
}