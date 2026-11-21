package com.it.score;

public class StudentTest {

    public static void main(String[] args) {
        // 练习 1：用带参构造创建对象
        Student s1 = new Student("张三", 18, 90);
        s1.show();
        System.out.println("是否成年：" + s1.isAdult());

        // 自测：边界值 100 和非法值 -10
        s1.setScore(100);
        System.out.println("setScore(100) 后：" + s1.getScore());   // 应为 100.0

        s1.setScore(-10);
        System.out.println("setScore(-10) 后：" + s1.getScore());   // 应仍为 100.0

        System.out.println("----------");

        // 练习 2：3 个学生放进数组，求平均分
        Student[] students = {
                new Student("张三", 18, 90),
                new Student("李四", 19, 85),
                new Student("王五", 17, 58)
        };

        double sum = 0;
        for (Student s : students) {
            s.show();
            sum += s.getScore();
        }
        System.out.println("平均分：" + sum / students.length);
    }
}
