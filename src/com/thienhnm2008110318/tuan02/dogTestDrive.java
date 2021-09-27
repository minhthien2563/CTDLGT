package com.thienhnm2008110318.tuan02;

public class dogTestDrive {
    public static void main(String[] args) {
        dog[] danhSachDog = new dog[7];

        dog dog0 = new dog(10, "Đen", "Fido");
        dog dog1 = new dog(7, "Vàng", "La La");
        dog dog2 = new dog(25, "Đen trắng", "Lulu");
        dog dog3 = new dog(11, "Nâu", "Kiki");
        dog dog4 = new dog(20, "Nâu đen", "Hoho");
        dog dog5 = new dog(19, "Đốm", "Haha");
        dog dog6 = new dog(4, "Đen thui", "Hihi");

        danhSachDog[0] = dog0;
        danhSachDog[1] = dog1;
        danhSachDog[2] = dog2;
        danhSachDog[3] = dog3;
        danhSachDog[4] = dog4;
        danhSachDog[5] = dog5;
        danhSachDog[6] = dog6;

        for(int i = 0; i < danhSachDog.length; i++) {
            danhSachDog[i].inThongTin();
        }

        
    }
}
