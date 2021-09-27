package com.thienhnm2008110318.tuan02;

public class dog {
    String name;
    int size;
    String color;

    public dog(int s) {
        size = s;
    }

    public dog(int s, String c, String n) {
        size = s;
        color = c;
        name = n;
    }

    void inThongTin() {
        System.out.println("Size = " + size + " " + "color = " + color + " " + "name = " + name);
    }
}
