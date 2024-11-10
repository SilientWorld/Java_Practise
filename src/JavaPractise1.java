import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class JavaPractise1 {
    public static void main(String[] args) {
        System.out.print("你好，中国！");//println直接换行
        System.out.println("你好，大家！");//print没有换行
        double a = 2.99;
        double b = Math.pow(a, 2);//可以直接用Math.xxx或者import static java.lang.Math.*
        System.out.printf("b=%.2f\n", b);//printf带格式化输出
        Scanner sc = new Scanner(System.in);//生成Scanner对象,包含import java.util.*;
        System.out.print("请输入你的年龄：");
        int age = sc.nextInt();//nextInt():输入整数   nextDouble():输入浮点型数
        System.out.print("请输入你的名字：");
        String name = sc.next();//next()输入字符串,以空格作为分隔符
        System.out.println("姓名：" + name + " " + "年龄:" + age);//有多个变量要输出时，使用“+”号
        String c = "hhh";
        String d = "lll";
        String e = c + d;//字符串直接拼接
        String f = e.substring(2, 5);//在e中取下标2和5（不包括5）之间的字符串
        System.out.println(e);
        System.out.println(f);
        if (e.equals(f) == false)//判断e和f的字符串是否相同，不相同为false，不能写成0
            System.out.println(e + f);
        int sum = 0;
        for (int i = 0; i < 5; i++)
            sum += i;
        System.out.printf("sum=%d\n", sum);
        int[] aa = new int[5];//新建大小等于5的数组
        for (int i = 0; i < aa.length; i++) {
            aa[i] = i;
            System.out.printf(aa[i] + " ");
        }
        System.out.println();//空行
        int aaa[] = {0, 1, 7, 3, 5};//[]不需要写数字，自动识别大小
        for (int i = 0; i < aaa.length; i++)
            System.out.printf(aaa[i] + " ");
        System.out.println();//空行
        Arrays.sort(aaa);//快速排序算法，从小到大
        for (int i = 0; i < aaa.length; i++)
            System.out.printf(aaa[i] + " ");
        System.out.println();//空行
        Arrays.fill(aaa, 2);//把aaa数组的数字全部变成2
        for (int i = 0; i < aaa.length; i++)
            System.out.printf(aaa[i] + " ");
        System.out.println();//空行
        System.out.printf("%tc\n", new Date());//显示当前时间，年月日时分秒，包含
        person p1 = new person();
        p1.name = "小明";
        p1.age = 18;
        p1.gender = "男";
        System.out.println("姓名：" + p1.name + " " + "年龄：" + p1.age + " " + "性别：" + p1.gender);
        p1.speak();//调用函数
        p1.caltivate1();//返回值为空
        p1.caltivate2(100);
        int res = p1.getsum(1, 2);//返回值非空
        System.out.println(res);
        int result = p1.getsum(10);//重载函数，形参不同
        System.out.println(result);
        p1.m1();
        animal a1 = new animal();
        a1.f1();
        a1.swap(3, 4);
        int[] arr = {1, 2, 3};
        a1.array1(arr);
        System.out.println("main的数组为：");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + "\t");
        System.out.println();
        CopyPerson cp = new CopyPerson();//复制类
        person p3 = cp.CopyPerson(p1);//p和p3都是person对象，但都是独立的，只是属性相同
        System.out.println("p1的姓名：" + p1.name + " " + "年龄：" + p1.age + " " + "性别：" + p1.gender);
        System.out.println("p3的姓名：" + p3.name + " " + "年龄：" + p3.age + " " + "性别：" + p3.gender);
        System.out.println(p1 == p3);//判断p1和p3是不是独立的个体，不是则返回false,是则返回true
        cp.sum(1, 3, 5);//这里面可以传很多参数，这里传了3个
        System.out.println("nums的和=" + cp.sum(1, 3, 5));
        student s = new student(1111, "小红");
        System.out.println("学生姓名：" + s.name + " " + "学号:" + s.IdNumber);
        student s1 = new student("小刚");
        System.out.println("学生姓名：" + s1.name);
    }
}

class person {
    String name;
    int age;
    String gender;

    public void speak() {
        System.out.println("大家好！");
    }

    public void caltivate1() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++)
            sum += i;
        System.out.println(sum);
    }

    public void caltivate2(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++)
            sum += i;
        System.out.println(sum);
    }

    public int getsum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public int getsum(int n)//重载函数，形参不同
    {
        int sum = 10;
        sum += n;
        return sum;
    }

    public void m1() {
        System.out.println("m1()函数被调用");
        animal a = new animal();
        a.f1();
        System.out.println("m1()函数继续被调用");
    }
}

class animal {
    public void f1() {
        System.out.println("f1()函数被调用");
    }

    public void swap(int a, int b) {
        System.out.println("交换前：a=" + a + " " + "b=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换后：a=" + a + " " + "b=" + b);
    }

    public void array1(int[] arr) {
        arr[0] = 200;
        System.out.println("array的数组：");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + "\t");
        System.out.println();
    }
}

class CopyPerson {//复制person类

    public person CopyPerson(person p) {
        person p2 = new person();
        p2.name = p.name;//新对象和原来的对象是独立的个体，只是属性相同
        p2.age = p.age;
        p2.gender = p.gender;
        return p2;
    }

    //用重载方法可以实现函数名称相同，形参不同的函数，缺点是函数个数多，形式单一，不够优化
    //针对以上问题，可以用可变参数来解决
    //形参列表只能有一个可变参数，可变参数可以和普通参数一起放在形参列表里面
    //但必须保证可变参数放在普通参数的后面
    public int sum(int... nums)//int...表示可变参数，类型是int，即可以接受多个int(0-n个)
    {//使用可变参数时，可以当做数组来使用，即nums可以当做数组
        System.out.println("参数个数：" + nums.length);
        int res = 0;
        for (int i = 0; i < nums.length; i++)
            res += nums[i];
        return res;
    }
}

class student {
    int IdNumber;
    String name;

    public student(int id, String n) {//构造器，即构造函数，没有返回值，函数名和类名相同，只是用来初始化对象
        System.out.println("构造器被调用");
        IdNumber = id;
        name = n;
    }

    //    public student(int IdNumber,String name)
//    {
//        System.out.println("含this的构造器被调用！");
//        this.IdNumber=IdNumber;
//        this.name=name;
//    }//含this的构造器，其作用和上面的构造器一样
    public student(String n)//构造器的重载
    {
        System.out.println("重载构造器被调用");
        name = n;
    }
}