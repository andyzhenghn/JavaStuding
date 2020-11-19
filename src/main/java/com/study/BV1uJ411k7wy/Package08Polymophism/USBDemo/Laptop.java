package com.study.BV1uJ411k7wy.Package08Polymophism.USBDemo;

public class Laptop {
    public void open() {
        System.out.println("Laptop open");
    }

    public void close() {
        System.out.println("Laptop close");
    }

    public void useDevice(UsbInterface usb) {
        usb.open();
        if (usb instanceof Mouse) {
            Mouse usbMouse = (Mouse) usb;
            usbMouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard usbKeyboard = (Keyboard) usb;
            usbKeyboard.type();
        }
        usb.close();
    }
}