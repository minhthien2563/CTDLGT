package com.thienhnm2008110318.tuan03;

public class computerTestDrive {
    public static void main(String[] args) {
        computer Computer;

        Computer = new computer("ASUS");
        Computer.manufacturer = "ASUS";

        Computer = new computer("ASUS", 2021);
        Computer.manufacturer = "ASUS";
        Computer.year_of_manufacture = 2021;

        Computer = new computer("ASUS", 2021, "Windows 10 Pro");
        Computer.manufacturer = "ASUS";
        Computer.year_of_manufacture = 2021;
        Computer.OS = "Windows 10 Pro";

        Computer = new computer("ASUS", 2021, "Windows 10 Pro", 16);
        Computer.manufacturer = "ASUS";
        Computer.year_of_manufacture = 2021;
        Computer.OS = "Windows 10 Pro";
        Computer.RAM = 16;

        Computer = new computer("ASUS", 2021, "Windows 10 Pro", 16, "i7 10700K");
        Computer.manufacturer = "ASUS";
        Computer.year_of_manufacture = 2021;
        Computer.OS = "Windows 10 Pro";
        Computer.RAM = 16;
        Computer.CPU = "i7 10700K";

        Computer = new computer("ASUS", 2021, "Windows 10 Pro", 16, "i7 10700K", 30000000);
        Computer.manufacturer = "ASUS";
        Computer.year_of_manufacture = 2021;
        Computer.OS = "Windows 10 Pro";
        Computer.RAM = 16;
        Computer.CPU = "i7 10700K";
        Computer.price = 30000000;

        Computer = new computer("ASUS", 2021, "Windows 10 Pro", 16, "i7 10700K", 30000000, 2023);
        Computer.manufacturer = "ASUS";
        Computer.year_of_manufacture = 2021;
        Computer.OS = "Windows 10 Pro";
        Computer.RAM = 16;
        Computer.CPU = "i7 10700K";
        Computer.price = 30000000;
        Computer.warranty_year = 2023;
    }
}
