package com.it.text;

public class MethodDemo {
    public static void main(String[] args) {
        int arr[] = {85, 92, 78, 96, 60};
        int add = 0;
        for (int i = 0; i < arr.length; i++) {
            add += arr[i];
        }
        System.out.println("总分为：" + add + "分");
        System.out.println("平均分为：" + (double) add / arr.length + "分");
        System.out.println("最高分为：" + max(arr) + "分");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 60) {
                count++;
            }
        }
        System.out.println("及格的人数为：" + count + "人");
    }

    public static int max(int[] arr) {
        int m = arr[0];
        for (int v : arr) {
            if (m > v) {
                m = v;
            }
        }
        return m;
    }
}