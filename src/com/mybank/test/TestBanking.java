package com.mybank.test;

import com.mybank.domain.Account;
import com.mybank.domain.Bank;
import com.mybank.domain.Customer;

import java.util.Scanner;

public class TestBanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到银行！");
        int n;
        do {
            System.out.print("请输入客户的个数：");
            n = scanner.nextInt();
            if (n > 10 || n < 0)
                System.out.println("最多创建10个客户，请重新输入！");
        } while (n > 10 || n < 0);
        // 创建客户及其账户
        for (int i = 0; i < n; i++) {
            System.out.print("请输入第 " + (i + 1) + " 位客户的姓氏: ");
            String lastName = scanner.next();
            System.out.print("请输入第 " + (i + 1) + " 位客户的名字: ");
            String firstName = scanner.next();
            Bank.addCustomer(firstName, lastName);
            Customer customer = Bank.getCustomer(i);
            System.out.print("选择初始存款初始化账户或直接传入账户对象（输入 “1” 表示初始存款初始化账户，“2” 表示直接传入账户对象）：");
            int num = scanner.nextInt();
            if (num == 1) {
                System.out.print("请输入初始存款金额: ");
                double originMoney = scanner.nextDouble();
                customer.addAccount(originMoney);
            } else if (num == 2) {
                Account account = new Account(0); // 创建一个初始余额为0的账户对象
                customer.addAccount(account);
            }
            scanner.nextLine();
        }
        // 进行交易操作
        for (int i = 0; i < Bank.getNumberOfCustomers(); i++) {
            Customer customer = Bank.getCustomer(i);
            System.out.println("为 " + customer.getLastName() + customer.getFirstName() + " 进行交易操作");
            for (int j = 0; j < customer.getNumberOfAccounts(); j++) {
                Account account = customer.getAccount(j);
                System.out.print("请输入要存入账户的金额 (或输入 0 跳过): ");
                double depositMoney = scanner.nextDouble();
                if (depositMoney > 0) {
                    account.deposit(depositMoney);
                }
                System.out.print("请输入要从账户取出的金额 (或输入 0 跳过): ");
                double UseMoney = scanner.nextDouble();
                if (UseMoney > 0) {
                    account.withdraw(UseMoney);
                }
            }
            scanner.nextLine();
        }
        // 打印客户详情及其账户余额
        for (int i = 0; i < Bank.getNumberOfCustomers(); i++) {
            Customer customer = Bank.getCustomer(i);
            System.out.print("客户: " + customer.getLastName() + customer.getFirstName());
            for (int j = 0; j < customer.getNumberOfAccounts(); j++) {
                Account account = customer.getAccount(j);
                System.out.printf(" 账户的余额: %.2f\n", account.getBalance());
            }
        }
    }
}
