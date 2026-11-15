package com.it.text;

import java.util.Scanner;

public class text6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = scanner.nextInt();
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;
        int count = 0;
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
            if (count == 0) {
                System.out.println("没有找到同时被3和5整除的数字");
            } else {
                System.out.println("同时被3和5整除的数字有：" + count + "个");
            }
        scanner.close();
    }
}
