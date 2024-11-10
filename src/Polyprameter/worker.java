package Polyprameter;

public class worker extends employee {
    public worker(String name, int age, double salary) {
        super(name, age, salary);
    }

    public String work() {
        return "工人：" + getName() + " " + getAge() + "岁，正在工作";
    }

    public double AnnualSalary() {
        return super.AnnualSalary();
    }
}
