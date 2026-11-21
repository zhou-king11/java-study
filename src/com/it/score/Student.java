package com.it.score;

public class Student {

    private String name;
    private int age;
    private double score;

    // 无参构造：保留它，方便 new Student() 后再用 set 方法赋值
    public Student() {
    }

    // 带参构造：创建对象时直接赋初值
    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 40) {
            this.age = age;
        }
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        // 注意边界：0 和 100 都算合法成绩
        if (score >= 0 && score <= 100) {
            this.score = score;
        }
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public void show() {
        System.out.println(name + "，" + age + "岁，成绩是 " + score);
    }
}
