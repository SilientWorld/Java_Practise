package interfaceTest;

public class Cat extends Animal implements Runnable {
    @Override
    public void eat() {
        System.out.println(getName() + "吃小鱼");
    }

    @Override
    public void run() {
        System.out.println(getName() + "会跑步");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
}
