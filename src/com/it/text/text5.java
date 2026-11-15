package com.it.text;

import java.util.Scanner;

public class text5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个价格：");
        double price = scanner.nextDouble();
        double price1 = price * 0.9;
        System.out.println("打折后的价格为：" + price1);
        double price2 = 0;
        if (price >= 30) {
            price2 = price - 30;
        }else {
            price2=price;
        }
        System.out.println("优惠后的价格为：" + price2);
        if(price>price2){
            System.out.println("2更优惠");
        }else{
            System.out.println("1更优惠");
        }
        scanner.close();
        }
    }
