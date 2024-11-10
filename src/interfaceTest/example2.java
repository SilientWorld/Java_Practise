package interfaceTest;

public class example2 {
    public static void main(String[] args) {
        littlemonkey littlemonkey = new littlemonkey("小宝", 14);
        littlemonkey.climbing("小宝", 14);
        littlemonkey.flying();
        littlemonkey.swimming();
    }
}

interface fishable {
    void swimming();
}

interface flyable {
    void flying();
}

abstract class monkey {
    private String name;
    private int age;

    public monkey(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract public void climbing(String name, int age);

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class littlemonkey extends monkey implements fishable, flyable {
    //子类继承父类，就自动有了父类的功能，如果想要拓展，就用接口实现
    public littlemonkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void climbing(String name, int age) {
        System.out.println(getAge() + "岁的" + getName() + "猴子会爬树");
    }

    @Override
    public void swimming() {
        System.out.println(getAge() + "岁的" + getName() + "猴子会游泳");
    }

    @Override
    public void flying() {
        System.out.println(getAge() + "岁的" + getName() + "猴子会飞翔");
    }
}