package interfaceTest;

public class innerClass {
    public static void main(String[] args) {
        outer outer = new outer();
        outer.m1();
    }
}

class outer {
    private final int n1 = 100;

    class inner {
        private final int n1 = 200;

        public void show() {
            System.out.println("inner的n1的值：" + n1);
            System.out.println("outer的n1的值：" + outer.this.n1);
        }
    }

    public void m1() {
        inner inner = new inner();
        inner.show();
    }
}