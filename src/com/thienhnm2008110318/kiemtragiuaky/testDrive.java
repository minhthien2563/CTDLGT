package com.thienhnm2008110318.kiemtragiuaky;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class testDrive {

    static apple Apple;

    static ArrayList<apple> apple_list = new ArrayList<>();

    static LinkedList<apple> apple_linked_list = new LinkedList<>();

    static Scanner input = new Scanner(System.in);

    static void inputInfo(boolean linkedlist, boolean linkedlist_opt, boolean first) {
        
        String break_out;

        while (true) {
            Apple = new apple();

            Apple.id = apple_list.size()+1;

            System.out.print("Hãy nhập số khối lượng quả táo: ");
            Apple.mass = input.nextDouble();
            input.nextLine();

            System.out.print("Hãy nhập màu sắc quả táo (Yellow, Blue, Red): ");
            Apple.color = input.nextLine();

            System.out.println("Nhập N để huỷ, bấm phím bất kỳ để tiếp tục.");
            
            if (!linkedlist)
                apple_list.add(Apple);
            else {
                if (!linkedlist_opt)
                    apple_linked_list.add(Apple);
                else {
                    if (first)
                        apple_linked_list.addFirst(Apple);
                    else
                        apple_linked_list.addLast(Apple);
                    }
            }
            

            break_out = input.nextLine();
            if (break_out.equalsIgnoreCase("N")) {
                break;
            }

        }

        input.close();
    }

    static void printInfo() {
        for(apple i : apple_list) {
            System.out.println("ID " + i.id + " Khối lượng " + i.mass + " Màu sắc " + i.color);
        }
    }

    static void searchByName(String find_color) {
        for(apple i : apple_list) {
            if (i.color.equals(find_color)) {
                System.out.println("ID " + i.id + " Khối lượng " + i.mass + " Màu sắc " + i.color);
            }
        }
    }

    static void searchById(Integer find_id) {
        for(apple i : apple_linked_list) {
            if (i.id == find_id) {
                System.out.println("ID " + i.id + " Khối lượng " + i.mass + " Màu sắc " + i.color);
            }
        }
    }

    public static void main(String[] args) {
        Integer select;
        do {
            System.out.println("_______TUỲ CHỌN_______");
            System.out.println("1. Nhập táo vào danh sách");
            System.out.println("2. Tìm với tên  trong danh sách");
            System.out.println("3. In danh sách");
            System.out.println("4. Nhập táo vào danh sách liên kết");
            System.out.println("5. Thêm táo vào đầu danh sách liên kết");
            System.out.println("6. Thêm táo vào cuối danh sách liên kết");
            System.out.println("7. Tìm với mã số trong danh sách liên kết");

            select = input.nextInt();
            input.nextLine();

            switch(select) {
                case 1: {
                    inputInfo(false, false);
                }
                case 2: {
                    System.out.print("Hãy nhập màu sác loại táo cần tìm (Yellow, Blue, Red): ");
                    String find_color = input.nextLine();

                    searchByName(find_color);
                }
                case 3: {
                    printInfo();
                }
                case 4: {
                    input
                }
                case 5: {
                    inputInfo(true, true);
                }
                case 6: {
                    inputInfo(true, false);
                }
                case 7: {
                    System.out.print("Hãy nhập mã số táo cần tìm: ");
                    Integer find_id = input.nextInt();

                    searchById(find_id);
                }
            }

        } while (select >= 1 && select <= 3);
    }
}
