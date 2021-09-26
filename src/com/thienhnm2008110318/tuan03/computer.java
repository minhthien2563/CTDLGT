package com.thienhnm2008110318.tuan03;

public class computer {
    String manufacturer;
    int year_of_manufacture;
    String OS;
    int RAM;
    String CPU;
    int price;
    int warranty_year;

    computer() {

    }

    computer(String m) {
        manufacturer = m;
        System.out.println("Nhà sản xuất: " + manufacturer);
    }

    computer(String m, int yom) {
        manufacturer = m;
        year_of_manufacture = yom;
        System.out.println("Nhà sản xuất: " + manufacturer);
        System.out.println("Năm sản xuất: " + year_of_manufacture);
    }

    computer(String m, int yom, String o) {
        manufacturer = m;
        year_of_manufacture = yom;
        OS = o;
        System.out.println("Nhà sản xuất: " + manufacturer);
        System.out.println("Năm sản xuất: " + year_of_manufacture);
        System.out.println("Hệ điều hành: " + OS);
    }

    computer(String m, int yom, String o, int r) {
        manufacturer = m;
        year_of_manufacture = yom;
        OS = o;
        RAM = r;
        System.out.println("Nhà sản xuất: " + manufacturer);
        System.out.println("Năm sản xuất: " + year_of_manufacture);
        System.out.println("Hệ điều hành: " + OS);
        System.out.println("RAM: " + RAM);
    }

    computer(String m, int yom, String o, int r, String c) {
        manufacturer = m;
        year_of_manufacture = yom;
        OS = o;
        RAM = r;
        CPU = c;
        System.out.println("Nhà sản xuất: " + manufacturer);
        System.out.println("Năm sản xuất: " + year_of_manufacture);
        System.out.println("Hệ điều hành: " + OS);
        System.out.println("RAM: " + RAM);
        System.out.println("CPU: " + CPU);
    }

    computer(String m, int yom, String o, int r, String c, int p) {
        manufacturer = m;
        year_of_manufacture = yom;
        OS = o;
        RAM = r;
        CPU = c;
        price = p;
        System.out.println("Nhà sản xuất: " + manufacturer);
        System.out.println("Năm sản xuất: " + year_of_manufacture);
        System.out.println("Hệ điều hành: " + OS);
        System.out.println("RAM: " + RAM);
        System.out.println("CPU: " + CPU);
        System.out.println("Giá: " + price);
    }

    computer(String m, int yom, String o, int r, String c, int p, int wy) {
        manufacturer = m;
        year_of_manufacture = yom;
        OS = o;
        RAM = r;
        CPU = c;
        price = p;
        warranty_year = wy;
        System.out.println("Nhà sản xuất: " + manufacturer);
        System.out.println("Năm sản xuất: " + year_of_manufacture);
        System.out.println("Hệ điều hành: " + OS);
        System.out.println("RAM: " + RAM);
        System.out.println("CPU: " + CPU);
        System.out.println("Giá: " + price);
        System.out.println("Năm bảo hành: " + warranty_year);
    }
}
