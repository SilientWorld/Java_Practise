package USB_interface;

public interface USB {
    abstract public void open();

    abstract public void close();

    default public void say() {
        System.out.println("say");
    }

    static public void sing() {
        System.out.println("sing");
    }
}
