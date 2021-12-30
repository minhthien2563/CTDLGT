package com.thienhnm2008110318.kiemtracuoiky;

import java.util.ArrayList;
import java.util.Random;


public class goods_application {
    
    static goods Goods;

    static ArrayList<goods> goods_list = new ArrayList<goods>();

    static Random random = new Random();

    static String[] _type = {"Thuc pham", "Sanh su", "Dien tu"};
    static String[] food = {"Ca", "Ca rot", "Ga", "Thit heo"};
    static String[] crockery = {"Chen", "Dia", "Ly"};
    static String[] electronic = {"Dien thoai", "May tinh", "May lanh"};

    public static void main(String[] args) {

        System.out.println("###################################");
        System.out.println("Ma san pham da duoc tao ngau nhien");
        for(int i = 0; i < 20; i++) {
            Goods = new goods();
            Goods.id = app_function.randomString(4);

            int index = random.nextInt(_type.length);
            Goods.type = _type[index];

            int j;

            if (index == 0) {
                j = random.nextInt(food.length);
                Goods.name = food[j];
            }
            else if (index == 1) {
                j = random.nextInt(crockery.length);
                Goods.name = crockery[j];
            }
            else if (index == 2) {
                j = random.nextInt(electronic.length);
                Goods.name = electronic[j];
            }

            System.out.println(Goods.type);
            
            System.out.println(Goods.name);

            Goods.price = random.nextInt(100000);
            
            Goods.left_in_stock = random.nextInt(100);
            
            Goods.import_date = app_function.formatter.format(app_function.date);


            goods_list.add(Goods);
        }
        System.out.println("###################################");

        System.out.println("\n\n");

        app_function.Menu();
        
    }
}
