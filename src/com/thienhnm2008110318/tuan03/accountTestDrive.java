package com.thienhnm2008110318.tuan03;

public class accountTestDrive {
    public static void main(String[] args) {
        account Account;

        Account = new account("Lê Văn A");
        Account.owner = "Lê Văn A";

        Account = new account("Lê Văn A", 123456);
        Account.owner = "Lê Văn A";
        Account.number = 123456;

        Account = new account("Lê Văn A", 123456, 10000);
        Account.owner = "Lê Văn A";
        Account.number = 123456;
        Account.surplus = 10000;
    }
}
