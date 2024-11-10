package USB_interface;

public class camera implements USB {
    @Override
    public void open() {
        System.out.println("摄像机开始工作！");
    }

    @Override
    public void close() {
        System.out.println("摄像机停止工作！");
    }

    @Override
    public void say() {
        USB.super.say();
    }
}
