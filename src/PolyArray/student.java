package PolyArray;

public class student extends person {
    private double score;

    public student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say() {
        return "学生：" + super.say() + " " + getScore() + "分";
    }

    public String study() {
        return "学生：" + super.say() + " " + "正在学习";
    }
}
