package Polyprameter;

public class manager extends employee {
    private double bonus;

    public manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double AnnualSalary() {
        return super.AnnualSalary() + bonus;
    }

    public String manage() {
        return "经理：" + getName() + " " + getAge() + "岁，正在工作";
    }
}
