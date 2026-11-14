package com.it.text;

import java.util.Scanner;

public class bmi
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身高：");
        double height = scanner.nextDouble();
        System.out.println("请输入你的体重：");
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("你的BMI指数是：" + bmi);
        if (bmi < 18.5) {
            System.out.println("体重过轻");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("正常范围");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("超重");
        } else {
            System.out.println("肥胖");
        }
    }
}
