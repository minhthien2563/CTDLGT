package com.thienhnm2008110318.tuan03;

public class staffTestDrive {
    public static void main(String[] args) {
        staff Staff;

        Staff = new staff("Lê Văn A");
        Staff.name = "Lê Văn A";

        Staff = new staff("Lê Văn A", 30000);
        Staff.name = "Lê Văn A";
        Staff.salary = 30000;

        Staff = new staff("Lê Văn A", 30000, "2/1 Đường Hoàng Văn Thụ");
        Staff.name = "Lê Văn A";
        Staff.salary = 30000;
        Staff.address = "2/1 Đường Hoàng Văn Thụ";

        Staff = new staff("Lê Văn A", 30000, "2/1 Đường Hoàng Văn Thụ", "Lập trình viên");
        Staff.name = "Lê Văn A";
        Staff.salary = 30000;
        Staff.address = "2/1 Đường Hoàng Văn Thụ";
        Staff.working_parts = "Lập trình viên";

        Staff = new staff("Lê Văn A", 30000, "2/1 Đường Hoàng Văn Thụ", "Lập trình viên", "2/1/1997");
        Staff.name = "Lê Văn A";
        Staff.salary = 30000;
        Staff.address = "2/1 Đường Hoàng Văn Thụ";
        Staff.working_parts = "Lập trình viên";
        Staff.birthday = "2/1/1997";
    }
}
