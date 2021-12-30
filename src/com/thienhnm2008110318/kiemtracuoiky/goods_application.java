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

        
        for(int i = 0; i < 20; i++) {
            Goods.id = app_function.randomString();

            int index = random.nextInt(_type.length);
            Goods.type = _type[index];

            switch(index) {
                case 0: {
                    int j = random.nextInt(food.length);
                    Goods.name = food[j];
                }
                case 1: {
                    int j = random.nextInt(crockery.length);
                    Goods.name = crockery[j];
                }
                case 2: {
                    int j = random.nextInt(electronic.length);
                    Goods.name = electronic[j];
                }
            }

            Goods.price = random.nextInt(100000);
            
            Goods.left_in_stock = random.nextInt(100);
            
            Goods.import_date = app_function.formatter.format(app_function.date);
        }

        app_function.Menu();
        
    }
}
