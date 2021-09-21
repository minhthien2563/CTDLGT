package com.thienhnm2008110318.tuan03;

public class staff {
    String name;
    int salary;
    String address;
    String working_parts;
    String birthday;

    staff() {
    }

    staff(String n) {
        name = n;
        System.out.println("Tên: " + name);
    }

    staff(String n, int s) {
        name = n;
        salary = s;
        System.out.println("Tên: " + name);
        System.out.println("Lương: " + salary);
    }

    staff(String n, int s, String add) {
        name = n;
        salary = s;
        address = add;
        System.out.println("Tên: " + name);
        System.out.println("Lương: " + salary);
        System.out.println("Địa chỉ: " + address);
    }

    staff(String n, int s, String add, String wp) {
        name = n;
        salary = s;
        address = add;
        working_parts = wp;
        System.out.println("Tên: " + name);
        System.out.println("Lương: " + salary);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Bộ phận làm việc: " + working_parts);
    }

    staff(String n, int s, String add, String wp, String bd) {
        name = n;
        salary = s;
        address = add;
        working_parts = wp;
        birthday = bd;
        System.out.println("Tên: " + name);
        System.out.println("Lương: " + salary);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Bộ phận làm việc: " + working_parts);
        System.out.println("Ngày tháng năm sinh: " + birthday);
    }
}
