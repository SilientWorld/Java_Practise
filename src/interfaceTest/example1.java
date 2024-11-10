package interfaceTest;

interface action {
    public void study();

    public static final int ag1 = 18;

    public void teach();
}

interface feeling {
    public void happy();

    public void sad();
}

interface tired extends feeling, action {//接口不能继承类，但可以继承多个接口

    public void exhausted();
}

class child implements action, feeling, tired {//可以有多个接口，但继承只能有一个

    public void study() {
        System.out.println("小孩在学习！");
    }

    public void teach() {
        System.out.println("小孩在教书！");
    }

    @Override
    public void happy() {
        System.out.println("小孩很开心！");
    }

    @Override
    public void sad() {
        System.out.println("小孩很伤心！");
    }

    public void exhausted() {
        System.out.println("小孩很累！");
    }
}

class show {
    public void display(action a, feeling f, tired t) {
        a.study();
        a.teach();
        f.happy();
        f.sad();
        t.exhausted();
    }
}

public class example1 {
    public static void main(String[] args) {
        child child = new child();
        show show = new show();
        show.display(child, child, child);
        System.out.println("小孩今年" + action.ag1 + "岁");
    }
}