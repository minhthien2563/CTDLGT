package com.thienhnm2008110318.tuan03;

public class account {
    String owner;
    int number;
    int surplus;

    account() {

    }

    account(String o) {
        owner = o;
        System.out.println("Chủ tài khoản: " + owner);
    }

    account(String o, int n) {
        owner = o;
        number = n;
        System.out.println("Chủ tài khoản: " + owner);
        System.out.println("Số tài khoản: " + number);
    }

    account(String o, int n, int s) {
        owner = o;
        number = n;
        surplus = s;
        System.out.println("Chủ tài khoản: " + owner);
        System.out.println("Số tài khoản: " + number);
        System.out.println("Số dư: " + surplus);
    }
}
