package com.lk.day01.extend01;

public class ExtendsDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.name="张三";
        student.age=15;
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println("------------------");
        Teacher teacher = new Teacher();
        teacher.name="李四";
        teacher.age=16;
        System.out.println(teacher.name);
        System.out.println(teacher.age);

    }
}
