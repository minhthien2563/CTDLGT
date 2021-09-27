package com.thienhnm2008110318.tuan02;

import java.util.Scanner;

public class sinhVienTestDrive {
    public static void main(String[] args) {
        sinhVien[] SinhVien = new sinhVien[3];

        Scanner input = new Scanner(System.in);
        for(int i = 0; i < SinhVien.length; i ++) {

            System.out.print("Hãy nhập tên sinh viên: ");
            String name = input.nextLine();

            System.out.print("Hãy nhập tuổi sinh viên: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.print("Hãy nhập quê quán sinh viên: ");
            String country = input.nextLine();

            System.out.print("Hãy nhập mã số sinh viên: ");
            int ms = input.nextInt();
            input.nextLine();

            SinhVien[i] = new sinhVien(ms, name, age, country);
            if (i < 2) {
                System.out.println("Đã nhập thành công, vui lòng nhập thông tin sinh viên tiếp theo!");
                System.out.println("-------------------");
            }
        }
        input.close();

        for(int i = 0; i < SinhVien.length; i++) {
            System.out.println("---");
            System.out.println("In thông tin sinh viên:");

            SinhVien[i].inThongTin();
        }
    }
}
