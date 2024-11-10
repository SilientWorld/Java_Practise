package Polyprameter;

public class polyprameter {
    public static void main(String[] args) {
        worker w = new worker("张三", 40, 10000);
        manager m = new manager("王五", 45, 20000, 300000);
        polyprameter p = new polyprameter();
        p.show(w);
        p.show(m);
        p.testwork(w);
        p.testwork(m);
    }

    public void testwork(employee e) {
        if (e instanceof worker) {
            System.out.println(((worker) e).work());
        } else if (e instanceof manager) {
            System.out.println(((manager) e).manage());
        }
    }

    public void show(employee e) {
        System.out.println(e.AnnualSalary());
    }
}


