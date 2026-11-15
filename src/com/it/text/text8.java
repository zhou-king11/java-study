package com.it.text;

import java.util.Random;
import java.util.Scanner;

public class text8 {
    static void main(String[] args) {
        Random random = new Random();
        int bomb = random.nextInt(100) + 1;
        int min = 1;
        int max = 100;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 数字炸弹 === 炸弹藏在1~100之间，猜中即爆炸！");
        while (true) {
            System.out.println("当前范围：" + min + " ~ " + max + "，请输入你猜的数字：");
            int guess = scanner.nextInt();
            if (guess < min || guess > max) {
                System.out.println("超出范围，重新猜！");
                continue;
            }
            count++;
            if (guess == bomb) {
                System.out.println("砰！爆炸！炸弹就是 " + bomb + "，你一共猜了 " + count + " 次");
                break;
            } else if (guess > bomb) {
                max = guess;
                System.out.println("大了！");
            } else {
                min = guess;
                System.out.println("小了！");
            }
        }
    }
}