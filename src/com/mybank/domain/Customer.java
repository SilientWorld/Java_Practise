package com.mybank.domain;

public class Customer {
    private final String firstName;
    private final String lastName;
    private final Account[] accounts;
    private int numberOfAccounts;//记录实际的账户数目

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new Account[10];
        this.numberOfAccounts = 0;
    }

    public String getFirstName() {
        return firstName;
    }//返回客户的firstName实例变量

    public String getLastName() {
        return lastName;
    }//返回客户的lastName实例变量

    public void addAccount(double amt) {
        accounts[numberOfAccounts++] = new Account(amt);
    }

    public void addAccount(Account acc) {
        accounts[numberOfAccounts++] = acc;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public Account getAccount(int index) {
        return accounts[index];
    }

    public String toString() {
        return firstName + " " + lastName;
    }
    //将Customer对象以客户名字的字符串形式输出
}
