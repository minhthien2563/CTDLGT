package com.thienhnm2008110318.tuan05;

import java.util.ArrayList;
import java.util.Scanner;

public class chucNangBaiTap2 {
    chucNangBaiTap2() {
    }

    Scanner input = new Scanner(System.in);

    public void menu() {
        int select;
        
        do {
            System.out.println("_______TUỲ CHỌN_______");
            System.out.println("1. Nhập");
            System.out.println("2. Xuất");
            System.out.println("3. Sắp xếp");
            System.out.println("4. Ngẫu nhiên");
            System.out.println("5. Xoá");
            select = input.nextInt();
            input.nextLine();
        } while (1 < select || select > 5);

        System.out.println("Selected " + select);
        switch(select) {
            case 1: {
                System.out.print("Vui lòng nhập họ và tên: ");
                String name = input.nextLine();

                Nhap(name);
                break;
            }
            case 2: {
                System.out.println("test");

                Xuat();
                break;
            }
            case 3: {
                System.out.println("test 3");
                break;
            }
            case 4: {
                System.out.println("test 4");
            }
            case 5: {

            }
        }
        input.close();
    }

    ArrayList<String> list = new ArrayList<>();

    public void Nhap(String name) {
        list.add(name);
        System.out.println("Đã thêm '" + name + "' vào danh sách!");

        // menu();
    }

    public void Xuat() {
        System.out.println("Xuất danh sách");
        // for (String i : list) {
        //     System.out.println(i);
        // }
        // menu();

    }
}
