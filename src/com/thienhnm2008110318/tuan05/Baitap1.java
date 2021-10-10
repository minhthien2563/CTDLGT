package com.thienhnm2008110318.tuan05;

import java.util.ArrayList;
import java.util.Scanner;

public class Baitap1 {
    static double sum;
    public static void main(String[] args) {
        System.out.println("Hãy nhập số cần thêm vào danh sách (số thực)");

        ArrayList<Double> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        double x;
        String check;

        while (true) {
            System.out.print("Hãy nhập số thực: ");
            x = scanner.nextDouble();

            list.add(x);
            scanner.nextLine();

            System.out.println("Để nhập thêm vui lòng nhập Y, nhấn phím bất kỳ để huỷ.");
            
            check = scanner.nextLine();
            if (!check.equalsIgnoreCase("Y")) {
                break;
            }
        }

        for (double i : list) {
            sum += i;
            System.out.println("Giá trị đã nhập " + i);
        }

        System.out.println("Tổng " + sum);
        scanner.close();
    }
}
