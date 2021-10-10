package com.thienhnm2008110318.tuan02;

public class sinhVien {
    int mssv;
    String name;
    int age;
    String country;

    public sinhVien(int ms, String n, int a, String c) {
        mssv = ms;
        name = n;
        age = a;
        country = c;
    }

    sinhVien() {
        
    }

    void inThongTin() {
        System.out.println("MSSV: " + mssv);
        System.out.println("Tên sinh viên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Quê quán: " + country);
    }
}
