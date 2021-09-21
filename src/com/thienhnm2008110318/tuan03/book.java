package com.thienhnm2008110318.tuan03;

public class book {
    int price;
    String publishing_company;
    int publishing_year;
    int amount;
    String type;

    book() {
    }

    book(int p) {
        price = p;
        System.out.println("Giá tiền: " + price);
    }

    book(int p, String pc) {
        price = p;
        publishing_company = pc;

        System.out.println("Giá tiền: " + price);
        System.out.println("Nhà xuất bản: " + publishing_company);
    }

    book(int p, String pc, int py) {
        price = p;
        publishing_company = pc;
        publishing_year = py;

        System.out.println("Giá tiền: " + price);
        System.out.println("Nhà xuất bản: " + publishing_company);
        System.out.println("Năm xuất bản: " + publishing_year);
    }

    book(int p, String pc, int py, int a) {
        price = p;
        publishing_company = pc;
        publishing_year = py;
        amount = a;

        System.out.println("Giá tiền: " + price);
        System.out.println("Nhà xuất bản: " + publishing_company);
        System.out.println("Năm xuất bản: " + publishing_year);
        System.out.println("Số lượng: " + amount);
    }

    book(int p, String pc, int py, int a, String t) {
        price = p;
        publishing_company = pc;
        publishing_year = py;
        amount = a;
        type = t;

        System.out.println("Giá tiền: " + price);
        System.out.println("Nhà xuất bản: " + publishing_company);
        System.out.println("Năm xuất bản: " + publishing_year);
        System.out.println("Số lượng: " + amount);
        System.out.println("Loại: " + type);
    } 
}
