package com.it.text;

import java.util.Scanner;

public class taxt4 {
    public static void main(String[] args) {
        int hp = 500;
        System.out.println("请输入人物受到的伤害：");
        Scanner scanner = new Scanner(System.in);
        int inputHp = scanner.nextInt();
        hp = hp - inputHp;
        if (hp<=0){
            hp =1;
        }
        System.out.println("当前生命值为：" + hp);
        System.out.println("请输入回复的生命值：" );
        scanner = new Scanner(System.in);
        int inputHp1 = scanner.nextInt();
        hp = hp + inputHp1  ;
        if (hp>=500){
            hp =500;
        }
        System.out.println("当前生命值为：" + hp);
        scanner.close();

    }
}
