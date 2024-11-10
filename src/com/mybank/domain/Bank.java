package com.mybank.domain;

public class Bank {
    private static final Customer[] customers;
    private static int numberOfCustomers;//记录实际客户数目

    static {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    public static void addCustomer(String firstName, String lastName) {
        customers[numberOfCustomers++] = new Customer(firstName, lastName);
    }

    public static int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public static Customer getCustomer(int index) {
        return customers[index];
    }
}
