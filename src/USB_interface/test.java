package USB_interface;

public class test {
    public static void main(String[] args) {
        phone phone = new phone();
        camera camera = new camera();
        computer computer = new computer();
        computer.work(phone);
        computer.work(camera);
    }
}
