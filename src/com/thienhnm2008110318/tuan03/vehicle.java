package com.thienhnm2008110318.tuan03;

public class vehicle {
    String owner;
    String manufacturer;
    String type;
    String license;
    int capacity_fuel;


    vehicle(){
    }

    vehicle(String o) {
        owner = o;
        System.out.println("Chủ sở hữu: " + owner);
    }

    vehicle(String o, String m) {
        owner = o;
        manufacturer = m;
        System.out.println("Chủ sở hữu: " + owner);
        System.out.println("Nhà sản xuất: " + manufacturer);
    }

    vehicle(String o, String m, String t) {
        owner = o;
        manufacturer = m;
        type = t;
        System.out.println("Chủ sở hữu: " + owner);
        System.out.println("Nhà sản xuất: " + manufacturer);
        System.out.println("Dòng: " + type);
    }

    vehicle(String o, String m, String t, String l) {
        owner = o;
        manufacturer = m;
        type = t;
        license = l;
        System.out.println("Chủ sở hữu: " + owner);
        System.out.println("Nhà sản xuất: " + manufacturer);
        System.out.println("Dòng: " + type);
        System.out.println("Giấy phép: " + license);
    }

    vehicle(String o, String m, String t, String l, int cf) {
        owner = o;
        manufacturer = m;
        type = t;
        license = l;
        capacity_fuel = cf;
        System.out.println("Chủ sở hữu: " + owner);
        System.out.println("Nhà sản xuất: " + manufacturer);
        System.out.println("Dòng: " + type);
        System.out.println("Giấy phép: " + license);
        System.out.println("Dung tích xăng: " + capacity_fuel);
    }
}
