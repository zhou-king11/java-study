package com.it.text;

import java.util.Scanner;

public class text3 {
    static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：" );
        int num = scanner.nextInt();
        int ge = num % 10;
        int shi =num / 10 ;
        boolean isMultipleOf7 = num % 7 == 0;
        boolean isLucky = ge % 2 == 0 && shi % 2 == 0;
        if (isMultipleOf7 && isLucky){
            System.out.println("这个数字是7的倍数且是7的有缘数");
        }else if (isMultipleOf7){
            System.out.println("这个数字是7的倍数但不是7的有缘数");
        }else {
            System.out.println("这个数字不是7的倍数且不是7的有缘数");
        }
        scanner.close();
    }
}
