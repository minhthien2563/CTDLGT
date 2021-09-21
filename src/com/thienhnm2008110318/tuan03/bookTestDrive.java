package com.thienhnm2008110318.tuan03;

public class bookTestDrive {
    public static void main(String[] args) {
        book Book;

        Book = new book(10000);
        Book.price = 10000;

        Book = new book(20000, "Nhà xuất bản Kim Đồng");
        Book.price = 20000;
        Book.publishing_company = "Nhà xuất bản Kim Đồng";

        Book = new book(30000, "Nhà xuất bản Giáo dục", 2021);
        Book.price = 30000;
        Book.publishing_company = " Nhà xuất bản Giáo dục";
        Book.publishing_year = 2021;

        Book = new book(30000, "Nhà xuất bản Lao động", 2019, 20000);
        Book.price = 30000;
        Book.publishing_company = "Nhà xuất bản Lao động";
        Book.publishing_year = 2019;
        Book.amount = 20000;

        Book = new book(30000, "Nhà xuất bản Trẻ", 2019, 15000, "Truyện tranh");
        Book.price = 30000;
        Book.publishing_company = "Nhà xuất bản Trẻ";
        Book.publishing_year = 2019;
        Book.amount = 15000;
        Book.type = "Truyện tranh";
        
        
    }
}
