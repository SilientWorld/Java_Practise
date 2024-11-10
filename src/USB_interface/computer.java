package USB_interface;

public class computer {
    public void work(USB usb) {
        usb.open();
        usb.close();
        usb.say();
    }
}
