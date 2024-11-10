import java.util.Random;
import java.util.Scanner;

public class Experiment1 {
    public static void main(String[] args) {
        test01 tes = new test01();
        tes.RandomNum();
        tes.Palindromes();
        tes.getStar();
        printStar(3);
        printStar(5);
        printStar(7);
    }

    static void printStar(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = n; j != i; j--)
                System.out.print(" \t");
            for (int k = 0; k < 2 * i - 1; k++)
                System.out.print("*\t");
            for (int m = n; m != i; m--)
                System.out.print(" \t");
            System.out.println();
        }
    }
}

class test01 {
    public void RandomNum() {//猜大小
        Random ran = new Random();
        int num = ran.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("请输入数字：");
            int n = scanner.nextInt();
            if (n > num)
                System.out.println("猜大了");
            if (n < num)
                System.out.println("猜小了");
            if (n == num) {
                System.out.println("猜对了");
                break;
            }
        } while (true);
    }

    public void Palindromes() {//回文数
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("请输入数字：");
            n = sc.nextInt();
            if (n < 1 || n > 99999)
                System.out.println("输入不合法，请重新输入！");
            else break;
        } while (true);
        int[] a = new int[5];
        double i = Math.log10(n) + 1;
        int j = (int) i;
        System.out.println("该数是" + j + "位整数");
        int m = 0;
        while (m < j) {
            a[j - m - 1] = n % 10;
            m++;
            n = n / 10;
        }
        for (m = 0; m < j / 2; m++) {
            if (a[m] != a[j - m - 1])
                System.out.println("该数不是回文数！");
            else System.out.println("该数是回文数！");
            break;
        }
    }

    public void getStar() {
        int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = n; j != i; j--)
                System.out.print(" \t");
            for (int k = 0; k < 2 * i - 1; k++)
                System.out.print("*\t");
            for (int m = n; m != i; m--)
                System.out.print(" \t");
            System.out.println();
        }
    }
}