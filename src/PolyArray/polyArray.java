package PolyArray;

public class polyArray {
    public static void main(String[] args) {
        person[] p = new person[3];
        p[0] = new person("小明", 20);
        p[1] = new student("小红", 19, 100);
        p[2] = new teacher("李老师", 30, 5000);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].say());
            if (p[i] instanceof student) {//调用子类方法，要进行向下转型
                System.out.println(((student) p[i]).study());
            } else if (p[i] instanceof teacher) {
                System.out.println(((teacher) p[i]).teach());
            } else if (p[i] instanceof person) {
                System.out.println(((person) p[i]).unlucky());
            } else System.out.println("类型错误！");
        }
    }
}
