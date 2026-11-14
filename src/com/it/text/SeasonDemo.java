package com.it.text;

import java.util.Scanner;

public class SeasonDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" autumn");
                break;
            default:
                System.out.println("输入的月份有误");
        }
        scanner.close();
    }

}
