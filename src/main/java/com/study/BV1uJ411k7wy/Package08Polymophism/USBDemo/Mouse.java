package com.study.BV1uJ411k7wy.Package08Polymophism.USBDemo;

public class Mouse implements UsbInterface {
    @Override
    public void open() {
        System.out.println("Mouse open");
    }

    @Override
    public void close() {
        System.out.println("Mouse close");
    }

    public void click() {
        System.out.println("Mouse click");
    }
}