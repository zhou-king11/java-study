package com.it.text;

import java.util.Scanner;

public class JioupanduanDemo {
    public static void main(String[] args) {
// 判断一个数是奇数还是偶数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        } else {
            System.out.println(num + "是奇数");
        }
    }
}
