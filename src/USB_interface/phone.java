package USB_interface;

public class phone implements USB {
    public void open() {
        System.out.println("手机开始工作！");
    }

    //必须把两个抽象函数全部实现，实现一个也不能运行
    public void close() {
        System.out.println("手机停止工作！");
    }

    @Override
    public void say() {
        USB.super.say();
    }

}
