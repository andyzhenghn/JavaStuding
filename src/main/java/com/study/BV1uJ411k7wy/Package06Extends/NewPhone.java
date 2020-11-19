package com.study.BV1uJ411k7wy.Package06Extends;

public class NewPhone extends Phone {
    int num;

    public NewPhone() {
        super(20);
        System.out.println("NewPhone constructor"); 
    }
    public NewPhone(int args) {
        num = args;
        System.out.println("NewPhone constructor: params: " + num); 
    }

    @Override
    public void show() {
        super.show();
        System.out.println("show name");
        System.out.println("show profile photo");
    }

    public int getNum() {
        return num;
    }
}