package interfaceTest;

public class example3 {
    public static void main(String[] args) {
        typec[] type = new typec[2];
        type[0] = new telephone();
        type[1] = new telescope();
        for (int i = 0; i < type.length; i++) {
            type[i].work();
            if (type[i] instanceof telephone)
                ((telephone) type[i]).call();//向下转型
            if (type[i] instanceof telescope)
                ((telescope) type[i]).picture();//向下转型
        }

    }
}

interface typec {
    void work();
}

class telephone implements typec {
    public void work() {
        System.out.println("电话工作中！");
    }

    public void call() {
        System.out.println("手机通话中！");
    }
}

class telescope implements typec {
    public void work() {
        System.out.println("望远镜工作中！");
    }

    public void picture() {
        System.out.println("望远镜拍摄中！");
    }
}
