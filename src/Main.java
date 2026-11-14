import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = scanner.nextInt();
        System.out.println("你输入的第一个数字是：" + num);
        System.out.println("请输入第二个数字：");
        int num2 = scanner.nextInt();
        System.out.println("你输入的第二个数字是：" + num2);
        System.out.println("请输入第三个数字：");
        int num3 = scanner.nextInt();
        System.out.println("你输入的第三个数字是：" + num3);
        System.out.println("请输入第四个数字：");
        int num4 = scanner.nextInt();
        System.out.println("你输入的第四个数字是：" + num4);
        int sum = num + num2 + num3 + num4;
        System.out.println("你输入的四个数字的和是：" + sum);
    }
}
