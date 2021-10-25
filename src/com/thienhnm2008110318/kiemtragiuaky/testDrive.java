package com.thienhnm2008110318.kiemtragiuaky;

import java.util.Scanner;
import java.util.ArrayList;

public class testDrive {

    static apple Apple;

    static ArrayList<apple> apple_list = new ArrayList<>();

    static Scanner input = new Scanner(System.in);

    static void inputInfo() {
        
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
            
            apple_list.add(Apple);

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

    public static void main(String[] args) {
        Integer select;
        do {
            System.out.println("_______TUỲ CHỌN_______");
            System.out.println("1. Nhập");
            System.out.println("2. Tìm");
            System.out.println("3. In");

            select = input.nextInt();
            input.nextLine();

            switch(select) {
                case 1: {
                    inputInfo();
                    break;
                }
                case 2: {
                    System.out.print("Hãy nhập màu sác loại táo cần tìm (Yellow, Blue, Red): ");
                    String find_color = input.nextLine();

                    searchByName(find_color);
                    break;
                }
                case 3: {
                    printInfo();
                    break;
                }
            }

        } while (select >= 1 && select <= 3);
    }
}
