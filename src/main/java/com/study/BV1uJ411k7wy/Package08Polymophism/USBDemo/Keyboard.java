package com.study.BV1uJ411k7wy.Package08Polymophism.USBDemo;

public class Keyboard implements UsbInterface {
    @Override
    public void open() {
        System.out.println("keyboard open");
    }

    @Override
    public void close() {
        System.out.println("keyboard open");
    }

    public void type() {
        System.out.println("keyboard typing");
    }
}