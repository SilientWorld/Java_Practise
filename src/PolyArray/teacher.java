package PolyArray;

public class teacher extends person {
    private double salary;

    public teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String say() {
        return "老师：" + super.say() + " " + salary + "元";
    }

    public String teach() {
        return "老师：" + super.say() + " " + "正在讲课";
    }
}
