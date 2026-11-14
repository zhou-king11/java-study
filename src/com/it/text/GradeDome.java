package com.it.text;

import java.util.Scanner;

public class GradeDome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int score = scanner.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("输入的成绩有误");
        } else if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
        scanner.close();

    }
}
