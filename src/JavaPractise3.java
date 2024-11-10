public class JavaPractise3 {
    public static void main(String[] args) {
        Father father = new Father();
        father.test100();
        father.test200();
        father.test300();
        Kids kids = new Kids();
        kids.show();
        kids.showFunction();
        kids.Print();

    }
}

class Father {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    //private int n4 = 400;

    public void test100() {
        System.out.println("输出100");
    }

    protected void test200() {
        System.out.println("输出200");
    }

    void test300() {
        System.out.println("输出300");
    }

//    private void test400() {
//        System.out.println("输出400");
//    }

    public Father(String name) {
        System.out.println("输出名字");
    }

//    public Father(String name, int year) {
//        System.out.println("输出名字和年龄");
//    }

    public Father() {

    }
}

class Kids extends Father {
    public int n1 = 888;

    public void show() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }//super不能访问父类的私有属性

    public void showFunction() {
        super.test100();
        super.test200();
        super.test300();
        //super.test400();//super不能访问父类的私有方法
    }

    public void Print() {
        System.out.println(n1);//888
        System.out.println(this.n1);//888
        System.out.println(super.n1);//888
    }//前提条件是子类的属性和父类同名
    //n1和this.n1先访问本类的属性，如果有，则输出，否则往父类查找，找到了则输出
    //super不访问本类的属性，直接访问父类的，如果有则输出
    //这三个都不访问父类和子类的私有属性

    public Kids() {
        super("jack");
        //super("jack",13);//super只能放在构造器的第一行，而且只能有一句
    }
}

