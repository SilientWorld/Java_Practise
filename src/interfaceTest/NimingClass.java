package interfaceTest;

public class NimingClass {
    public static void main(String[] args) {
        IA bird = new IA() {//匿名内部类的接口用法
            public void shout() {
                System.out.println("shout");
            }
        };
        bird.shout();
        System.out.println(bird.getClass());//返回匿名内部类的真实名字
        earth earth = new earth("地球") {//匿名内部类的类的用法
            public void shout() {
                System.out.println("你好！");
            }
        };
        earth.shout();
        System.out.println(earth.getClass());//返回匿名内部类的真实名字
        new vacant() {
            public void hi() {
                System.out.println("hello");
            }
        }.hi();//直接.hi()，相当于创建了对象，对象指向hi()，
        // 该处的hi()和父类的hi()不一样，就近原则
    }
}

interface IA {
    void shout();
}

abstract class earth {
    public earth(String name) {
        System.out.println(name);
    }

    abstract public void shout();
}

class vacant {
    public void hi() {
        System.out.println("hi");
    }

    private int n1 = 10;
    vacant vacant = new vacant() {
        public void show() {
            System.out.println(vacant.n1);
        }//匿名内部类可以访问该外部类的私有属性
    };
}
