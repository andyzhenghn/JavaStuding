package com.study.BV1uJ411k7wy.Package08Polymophism.USBDemo;

public class DemoUse {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        lap.open();

        // 使用鼠标
        // 向上转型
        UsbInterface usbMouse = new Mouse();
        lap.useDevice(usbMouse);

        // 使用键盘
        Keyboard usbKeyboard = new Keyboard();
        lap.useDevice(usbKeyboard);

        /**
         * useDevice要求的参数是 UsbInterface类的，可以使用以下几种
         * 1. 多态性的实例对象
         * 2. UsbInterface类的实现类
         * 3. 匿名实现类
         */

        lap.close();
    }
}