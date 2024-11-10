public class Dynamic {
    public static void main(String[] args) {
        A1 a = new B1();//A1是编译类型，B1是运行类型
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}

//调用对象方法时，该方法会和该对象的运行类型绑定
//调用对象属性时，没有动态绑定机制，哪里声明，调用哪里
class A1 {
    int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 20;
    }

    public int getI() {
        return i;
    }
}

class B1 extends A1 {
    int i = 20;

    public int sum() {
        return getI() + 20;
    }

    public int sum1() {
        return i + 30;
    }

    public int getI() {
        return i;
    }
}