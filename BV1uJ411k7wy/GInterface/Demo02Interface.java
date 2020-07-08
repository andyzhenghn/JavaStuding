package GInterface;

public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultImpl impl = new MyInterfaceDefaultImpl();

        impl.methodAbs();
        impl.methodAbs2();
    }
}