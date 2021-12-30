package com.thienhnm2008110318.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class chucNangBaiTap2 {
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

            switch(select) {
                case 1: {
                    System.out.print("Vui lòng nhập họ và tên: ");
                    String name = input.nextLine();
    
                    Nhap(name);
                    break;
                }
                case 2: {
                    Xuat();
                    break;
                }
                case 3: {
                    SapXep();
                    break;
                }
                case 4: {
                    XuatNgauNhien();
                    break;
                }
                case 5: {
                    System.out.print("Vui lòng nhập họ và tên muốn xoá: ");
                    String name_remove = input.nextLine();

                    Xoa(name_remove);
                    break;
                }
            }

        } while (select >= 1 && select <= 5);
        
        input.close();
    }

    ArrayList<String> list = new ArrayList<>();

    public void Nhap(String name) {
        list.add(name);
        System.out.println("Đã thêm '" + name + "' vào danh sách!");
    }

    public void Xuat() {
        System.out.println("Xuất danh sách");
        for (String i : list) {
            System.out.println(i);
        }
    }

    public void SapXep() {
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("Đã sắp xếp lại thứ tự danh sách!");
    }

    public void XuatNgauNhien() {
        Collections.shuffle(list);
        System.out.println("Đã sắp xếp ngẫu nhiên danh sách!");
    }

    public void Xoa(String name_remove) {
        boolean remove = false;
        String name_check;
        for (int i = 0; i < list.size(); i++) {
            name_check = list.get(i);
            if (name_check.equalsIgnoreCase(name_remove)) {
                list.remove(name_check);
                remove = true;
            }
        }
        if (!remove)
            System.out.println("Không tìm thấy tên này trong danh sách để xoá.");
        else
            System.out.println("Đã xoá " + name_remove + " khỏi danh sách!");
    }
}
