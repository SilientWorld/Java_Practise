package interfaceTest;

public class Bird extends Animal implements Flyable {
    @Override
    public void eat() {
        System.out.println(getName() + "吃虫子");
    }

    @Override
    public void fly() {
        System.out.println(getName() + "会飞");
    }

    public Bird() {
    }

    public Bird(String name, int age) {
        super(name, age);
    }
}