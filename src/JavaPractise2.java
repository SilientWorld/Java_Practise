import java.util.Random;
import java.util.Scanner;

public class JavaPractise2 {
    public int a = 100;//公有
    protected int b = 200;//保护
    int c = 300;//默认
    private int d = 400;//私有

    public void test01() {
        System.out.println("a=" + a + "b=" + b + "c=" + c + "d=" + d);
    }

    public static void main(String[] args) {
//        JavaPractise2 a = new JavaPractise2();
//        a.test01();
//        Person Person = new Person();
//        Person.setName("hhhhh");
//        Person.setYear(2000);
//        Person.setSalary(20000);
//        Person.setJob("程序员");
//        Person.show();
//        Person person = new Person("小明", 15, 2000, "学生");
//        person.show();
//        Student student = new Student();
//        student.setScore(90);
//        student.age = 15;
//        student.name = "小刚";
//        student.show();
//        pupil pupil = new pupil();
//        pupil.setAge(16);
//        pupil.setName("小红");
//        pupil.setScore(100);
//        pupil.show();
//        pupil pupil1 = new pupil(20);
//        pupil pupil2 = new pupil("小张", 23);
//        JavaClassPractise threeNum = new JavaClassPractise();
//        threeNum.Num();
//        threeNum.JudgeYear();
//        threeNum.Score(67.07);
//        threeNum.Sum100();
//        threeNum.MultipleBlank();
//        threeNum.RandomNum();
//        threeNum.FindMax(2, 4);
        SmallStudent smallStudent = new SmallStudent();
        smallStudent.name = "小明";
        smallStudent.age = 20;
        smallStudent.show();
        SmallStudent smallStudent1 = new SmallStudent();
        smallStudent1.name = "小红";
        smallStudent1.age = 19;
        smallStudent1.show();
    }
}

class Person {
    private String name;//私有类不能直接访问，要想赋值，使用setXXX和getXXX函数，快捷键Alt+Insert
    private int year;
    private int salary;
    private String job;

    public Person() {
    }

    public Person(String name, int year, int salary, String job) {
        //可以使用构造器，把setXXX传入
        setName(name);
        setYear(year);
        setSalary(salary);
        setJob(job);
    }

    public void setName(String name) {
        if (name.length() < 1 || name.length() > 4) {
            System.out.println("名字输入不合法！");
            this.name = "张三";
        } else this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1 || year > 120) {
            System.out.println("年龄输入不合法");
            this.year = 20;
        } else this.year = year;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void show() {
        System.out.println("名字：" + getName() + " " + "年龄：" + getYear() + " " + "工资：" + getSalary() + " " + "职位：" + getJob());
    }
}

class Student {
    public String name;
    protected int age;
    private int score;//如果改为私有，则不能在子类中继承

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void show() {
        System.out.println("名字：" + name + " " + "年龄：" + age + " " + "分数：" + score);
    }

    public Student() {//无参构造器
        System.out.println("Student()被调用");
    }

    public Student(String name) {//一个参数的构造器
        System.out.println("Student(String name)被调用");
    }

    public Student(String name, int age) {//两个参数的构造器
        System.out.println("Student(String name,int age)被调用");
    }
}

class pupil extends Student {//继承父类，关键字extends，只能继承一个父类

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("名字：" + name + " " + "年龄：" + age + " " + "分数：" + getScore());
    }

    public pupil() {
        super();//调用父类的无参构造器，调用无参构造器时可以不用写这句
        System.out.println("pupil()被调用");
    }

    public pupil(int age) {
        super("hh", 7);//如果父类有多个构造器，super括号内的参数不同，代表引用的是父类中形参对应的构造器
        System.out.println("pupil(int age)被调用");
    }

    public pupil(String name, int age) {
        super("hh");//super只能在构造器中，且只能在第一行，不能与this共存
        System.out.println("pupil(String name,int age)被调用");
    }
}

class JavaClassPractise {//三位数的各位上的数

    public void Num() {
        int i, j, k;
        Scanner vc = new Scanner(System.in);
        System.out.print("请输入数字：");
        int num = vc.nextInt();
        i = num % 10;//个位
        j = num / 10 % 10;//十位
        k = num / 10 / 10 % 10;//百位
        System.out.println("百位：" + k + " " + "十位：" + j + " " + "个位：" + i);
        int x = 5;
        int y = (--x) * 3;
        int z = (y++) - (--x);
        System.out.println("x=" + x + " " + "y=" + y + " " + "z=" + z);
        int c = 10;
        int d = 5;
        int re3 = (c++) + (++c) - (--d) - (++d) + 1 + c--;
        System.out.println("re3=" + re3 + " " + "c=" + c + " " + "d=" + d);
    }

    public void JudgeYear() {//判断闰年
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份：");
        year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("该年是闰年");
        else System.out.println("该年是平年");
    }

    public void Score(double score) {//成绩百分制到等级制的转换
        int Grade = (int) score / 10;
        switch (Grade) {
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 7:
                System.out.println("中等");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }
    }

    public void Sum100()//1-100的奇数和偶数和
    {
        int i, j, sum1 = 0, sum2 = 0;
        int[] num = new int[200];
        for (i = 1; i <= 100; i++) {
            num[i] = i;
            if (num[i] % 2 != 0)
                sum1 += num[i];
            else sum2 += num[i];
        }
        System.out.println("奇数和：" + sum1);
        System.out.println("偶数和：" + sum2);
    }

    public void MultipleBlank() {//打印九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++)
                System.out.printf("%d * %d = %d  ", i, j, j * i);
            System.out.println();
        }
    }

    public void RandomNum() {
        Random ran = new Random();
        int num = ran.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("请输入数字：");
            int n = scanner.nextInt();
            if (n > num)
                System.out.println("数字过大");
            if (n < num)
                System.out.println("数字过小");
            if (n == num) {
                System.out.println("你猜对了");
                break;
            }

        } while (true);
    }

    public void FindMax(int m, int n) {
        int max;
        if (n < m) {
            max = m;
        } else {
            max = n;
        }
        System.out.println("两数中的较大数：" + max);
    }
}

class SmallStudent {
    public String name;
    public int age;

    public void show() {
        System.out.println("小学生 " + name + " " + age);
    }
}


