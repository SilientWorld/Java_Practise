package interfaceTest;

public class Dog extends Animal implements Runnable {
    @Override
    public void eat() {
        System.out.println(getName() + "吃骨头");
    }

    @Override
    public void run() {
        System.out.println(getName() + "会跑步");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}

