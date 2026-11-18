package com.it.text;

public class PrimeDemo {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int j = 2; j <= n / j; j++) {
            if (n % j == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("1-100 共有素数：" + count + "个");
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2));
    }
    public static int sum(int n, int m) {
        return m+n;
    }
    public static int sum(int n, int m,int k) {
        return m+n+k;
    }
}